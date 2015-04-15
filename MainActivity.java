package com.mtots.jj;

import com.mtots.jj.JjRuntime.List;
import com.mtots.jj.JjRuntime.Dict;
import com.mtots.jj.JjRuntime.Function;
import com.mtots.jj.JjRuntime.Builtin;
import com.mtots.jj.JjRuntime.Scope;
import com.mtots.jj.JjRuntime.GlobalScope;

import android.app.Activity;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

	private GlobalScope scope;
	private Dict android;
	private Function onCreateCallback;

	private MediaPlayer mediaPlayer;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		onCreateCallback = null;
		scope = new GlobalScope();

		scope.declareBuiltin(new Builtin() {
			public String getName() {
				return "import";
			}

			public Object call(List args) {
				String name = (String) args.get(0);
				return
					name.equals("android") ? createAndroidModule() :
					name.equals("media") ? createMediaModule() :
					"";
			}
		});

		JjRuntime.eval(scope, JjRuntime.parse(Script.CODE));

		onCreateCallback.call(new List());
	}

	private View getRawView(Dict wrappedView) {
		return (View) ((Function)wrappedView.get("__getRawView__")).call(new List());
	}

	// TODO: move playing media to a service.
	// The way it is done here causes weirdness to happen, as opening an app could
	// actually create multiple versions of an activity.
	private boolean playAudio(String uri) {
		if (mediaPlayer != null) {
			mediaPlayer.stop();
			mediaPlayer.release();
		}

		try {
			mediaPlayer = new MediaPlayer();
			mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
			mediaPlayer.setDataSource(uri);
			mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
				public void onPrepared(MediaPlayer mp) {
					mediaPlayer.start();
				}
			});
			mediaPlayer.prepareAsync();
		} catch (java.io.IOException e) {
			return false;
		}
		return true;
	}

	private Dict createMediaModule() {
		Dict media = new Dict();

		media.putBuiltin(new Builtin() {

			public String getName() {
				return "play";
			}

			public Object call(List args) {
				String uri = (String) args.get(0);
				return playAudio(uri) ? uri : "";
			}

		});

		return media;
	}

	private Dict createAndroidModule() {
		Dict android = new Dict();

		android.putBuiltin(new Builtin() {

			public String getName() {
				return "onCreate";
			}

			public Object call(List args) {
				onCreateCallback = (Function) args.get(0);
				return onCreateCallback;
			}

		});

		android.putBuiltin(new Builtin() {

			public String getName() {
				return "setView";
			}

			public Object call(List args) {
				Dict wrappedView = (Dict) args.get(0);
				View rawView = getRawView(wrappedView);
				setContentView(rawView);
				return wrappedView;
			}
		});

		android.putBuiltin(new Builtin() {

			public String getName() {
				return "text";
			}

			public Object call(List args) {
				Dict tv = new Dict();
				final TextView rawView = new TextView(MainActivity.this);
				rawView.setText((String) args.get(0));
				tv.putBuiltin(new Builtin() {

					public String getName() {
						return "__getRawView__";
					}

					public Object call(List args) {
						return rawView;
					}
				});
				tv.putBuiltin(new Builtin() {

					public String getName() {
						return "setText";
					}

					public Object call(List	args) {
						rawView.setText((String) args.get(0));
						return args.get(0);
					}
				});
				return tv;
			}
		});

		android.putBuiltin(new Builtin() {

			public String getName() {
				return "button";
			}

			public Object call(List args) {
				Dict bv = new Dict();
				final Button rawView = new Button(MainActivity.this);
				rawView.setText((String) args.get(0));
				if (args.size() > 1) {
					final Function callback = (Function) args.get(1);
					rawView.setOnClickListener(new View.OnClickListener() {
						public void onClick(View v) {
							callback.call(new List());
						}
					});
				}
				bv.putBuiltin(new Builtin() {

					public String getName() {
						return "__getRawView__";
					}

					public Object call(List args) {
						return rawView;
					}
				});
				bv.putBuiltin(new Builtin() {

					public String getName() {
						return "setText";
					}

					public Object call(List	args) {
						rawView.setText((String) args.get(0));
						return args.get(0);
					}
				});
				bv.putBuiltin(new Builtin() {

					public String getName() {
						return "onClick";
					}

					public Object call(List args) {
						final Function callback = (Function) args.get(0);
						rawView.setOnClickListener(new View.OnClickListener() {
							public void onClick(View v) {
								callback.call(new List());
							}
						});
						return callback;
					}

				});
				return bv;
			}
		});

		android.putBuiltin(new LayoutBuiltin() {

			public String getName() {
				return "vertical";
			}

			public int getOrientation() {
				return LinearLayout.VERTICAL;
			}
		});

		android.putBuiltin(new LayoutBuiltin() {

			public String getName() {
				return "horizontal";
			}

			public int getOrientation() {
				return LinearLayout.HORIZONTAL;
			}

		});

		return android;
	}

	abstract private class LayoutBuiltin extends Builtin {

		abstract public int getOrientation();

		public Object call(List args) {
			Dict lv = new Dict();
			final LinearLayout rawView = new LinearLayout(MainActivity.this);

			rawView.setOrientation(getOrientation());

			for (int i = 0; i < args.size(); i++)
				rawView.addView(getRawView((Dict) args.get(i)));

			lv.putBuiltin(new Builtin() {

				public String getName() {
					return "__getRawView__";
				}

				public Object call(List args) {
					return rawView;
				}
			});

			lv.putBuiltin(new Builtin() {

				public String getName() {
					return "add";
				}

				public Object call(List args) {
					Dict wrappedView = (Dict) args.get(0);
					View iView = getRawView(wrappedView);
					rawView.addView(iView);
					return wrappedView;
				}

			});
			return lv;
		}
	}

}

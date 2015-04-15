package com.mtots.jj;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity
{
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		JjRuntime.eval(new GlobalScope(), JjRuntime.parse(Script.CODE));
	}

	public class GlobalScope extends JjRuntime.GlobalScope {
	}
}

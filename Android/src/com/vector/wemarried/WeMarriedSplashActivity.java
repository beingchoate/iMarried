package com.vector.wemarried;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class WeMarriedSplashActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_we_married_splash);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.we_married_splash, menu);
		return true;
	}

}

package com.vector.wemarried.android;

import com.vector.wemarried.R;
import com.vector.wemarried.android.utils.bitmapfun.ui.ImageGridActivity;
import com.vector.wemarried.android.utils.bitmapfun.ui.ImageGridFragment;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

public class WeMarriedSplashActivity extends Activity {
	
	private SharedPreferences mSharedPrefs;
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		final View startView = View.inflate(this,R.layout.activity_we_married_splash,null);
		
		mSharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);
		
		//setContentView(R.layout.activity_seeds_start);
		setContentView(startView);		
		
		// Fade in and fade out
		AlphaAnimation fadeShow = new AlphaAnimation(0.3f,1.0f);
		fadeShow.setDuration(1000);
		startView.startAnimation(fadeShow);				
		
		// Stay for a moments and redirect
		fadeShow.setAnimationListener(new AnimationListener()
		{
			@Override
			public void onAnimationEnd(Animation arg0) {
				redirectTo();
			}
			@Override
			public void onAnimationRepeat(Animation animation) {}
			@Override
			public void onAnimationStart(Animation animation) {}			
		});
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.we_married_splash, menu);
		return true;
	}
	
	private void redirectTo(){       
		Intent intent;
		if(isFirstStart())
		{
			updateFirstStartFlag(false);
			intent = new Intent(this, ImageGridActivity.class);
		    Bundle bundle = new Bundle();
		    bundle.putString("caller", "SeedsStartActivity");
		    intent.putExtras(bundle);
		}
		else
		{
			intent = new Intent(this, ImageGridActivity.class);		
		}		
				
		startActivity(intent);
		finish();
	}
	
    private boolean isFirstStart(){
    	
    	// Retrieve the seeds info status by date via the shared preference file
    	return mSharedPrefs.getBoolean("isfirststart",true);    	
    }
    
    private void updateFirstStartFlag(Boolean _inTag){
    	
    	SharedPreferences.Editor editor = mSharedPrefs.edit();
    	editor.putBoolean("isfirststart", _inTag);
    	editor.commit();    	
    } 

}

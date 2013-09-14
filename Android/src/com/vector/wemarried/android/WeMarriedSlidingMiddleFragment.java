package com.vector.wemarried.android;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;


public class WeMarriedSlidingMiddleFragment extends SlidingFragmentActivity {
	
	private int mTitleRes;

	public WeMarriedSlidingMiddleFragment() {
		mTitleRes = R.string.wemarried_midpage_title;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTitle(mTitleRes);
        LayoutInflater mLi = LayoutInflater.from(this);        
        View view0 = mLi.inflate(R.layout.fragment_startpage, null);
	}		

}
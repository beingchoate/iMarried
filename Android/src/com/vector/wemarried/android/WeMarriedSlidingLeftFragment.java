package com.vector.wemarried.android;

import com.vector.wemarried.android.R;
import com.vector.wemarried.android.utils.bitmapfun.provider.Images;
import com.vector.wemarried.android.utils.bitmapfun.ui.ImageGridActivity;
import com.vector.wemarried.android.utils.bitmapfun.ui.ImageGridFragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

public class WeMarriedSlidingLeftFragment extends Fragment implements OnClickListener{
	private View mHeadView;
	private View mChangxingSetView;
	private View mLavenderSetView;
	private View mNanshanSetView;
	private View mSofaSetView;
	private View mSunflowerView;
	private View mUniformView;
	private View mWestlakeView;
	
     @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);    	
    }
     
     @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
    		Bundle savedInstanceState) {
    	 View view = inflater.inflate(R.layout.image_sliding_left_fragment, container,
 				false);
    	 mHeadView = view.findViewById(R.id.headImageView);
    	 mChangxingSetView = view.findViewById(R.id.changxingset);
    	 mLavenderSetView = view.findViewById(R.id.lavenderset);
    	 mNanshanSetView = view.findViewById(R.id.nanshanset);
    	 mSofaSetView = view.findViewById(R.id.sofaset);
    	 mSunflowerView = view.findViewById(R.id.sunflowerset);
    	 mUniformView = view.findViewById(R.id.uniformset);
    	 mWestlakeView = view.findViewById(R.id.westlakeset);
    	 
    	 mHeadView.setOnClickListener(this);
    	 mChangxingSetView.setOnClickListener(this);
    	 mLavenderSetView.setOnClickListener(this);
    	 mNanshanSetView.setOnClickListener(this);
    	 mSofaSetView.setOnClickListener(this);
    	 mSunflowerView.setOnClickListener(this);
    	 mUniformView.setOnClickListener(this);
    	 mWestlakeView.setOnClickListener(this);

 		System.out.println();
    	return view;
    }

	@Override
	public void onClick(View v) {
		Fragment newContent = null;
		switch (v.getId()) {
		case R.id.headImageView:
			WeMarriedSlidingRightFragment.switchToDefaultSet();
		    newContent = new WeMarriedSlidingStartFragment();
		    break;
		case R.id.changxingset:
			Images.switchToChangxing();
			newContent = new ImageGridFragment();
			mChangxingSetView.setSelected(true);
			mLavenderSetView.setSelected(false);
			mNanshanSetView.setSelected(false);
			mSofaSetView.setSelected(false);
			mSunflowerView.setSelected(false);
			mUniformView.setSelected(false);
			mWestlakeView.setSelected(false);			
			break;
		case R.id.lavenderset:
			Images.switchToLavender();
			newContent = new ImageGridFragment();
			mChangxingSetView.setSelected(false);
			mLavenderSetView.setSelected(true);
			mNanshanSetView.setSelected(false);
			mSofaSetView.setSelected(false);
			mSunflowerView.setSelected(false);
			mUniformView.setSelected(false);
			mWestlakeView.setSelected(false);	
			break;
		case R.id.nanshanset:
			Images.switchToNanshan();
			newContent = new ImageGridFragment();
			mChangxingSetView.setSelected(false);
			mLavenderSetView.setSelected(false);
			mNanshanSetView.setSelected(true);
			mSofaSetView.setSelected(false);
			mSunflowerView.setSelected(false);
			mUniformView.setSelected(false);
			mWestlakeView.setSelected(false);	
		    break;
		case R.id.sofaset:
			Images.switchToSofa();
			newContent = new ImageGridFragment();
			mChangxingSetView.setSelected(false);
			mLavenderSetView.setSelected(false);
			mNanshanSetView.setSelected(false);
			mSofaSetView.setSelected(true);
			mSunflowerView.setSelected(false);
			mUniformView.setSelected(false);
			mWestlakeView.setSelected(false);	
		    break;
		case R.id.sunflowerset:
			Images.switchToSunflower();
			newContent = new ImageGridFragment();
			mChangxingSetView.setSelected(false);
			mLavenderSetView.setSelected(false);
			mNanshanSetView.setSelected(false);
			mSofaSetView.setSelected(false);
			mSunflowerView.setSelected(true);
			mUniformView.setSelected(false);
			mWestlakeView.setSelected(false);	
		    break;
		case R.id.uniformset:
			Images.switchToUniform();
			newContent = new ImageGridFragment();
			mChangxingSetView.setSelected(false);
			mLavenderSetView.setSelected(false);
			mNanshanSetView.setSelected(false);
			mSofaSetView.setSelected(false);
			mSunflowerView.setSelected(false);
			mUniformView.setSelected(true);
			mWestlakeView.setSelected(false);	
		    break;
		case R.id.westlakeset:
			Images.switchToWestlake();
			newContent = new ImageGridFragment();
			mChangxingSetView.setSelected(false);
			mLavenderSetView.setSelected(false);
			mNanshanSetView.setSelected(false);
			mSofaSetView.setSelected(false);
			mSunflowerView.setSelected(false);
			mUniformView.setSelected(false);
			mWestlakeView.setSelected(true);	
		    break;
		default:
			break;
		}
		
		if (newContent != null)
			switchFragment(newContent);
		
	}
	
	
	private void switchFragment(Fragment fragment) {
		if (getActivity() == null)
			return;

		if (getActivity() instanceof ImageGridActivity) {
			ImageGridActivity ra = (ImageGridActivity) getActivity();
			ra.switchContent(fragment);
		}
	}
}

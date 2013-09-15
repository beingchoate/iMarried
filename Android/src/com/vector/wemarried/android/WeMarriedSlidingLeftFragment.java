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
	private View mAboutView;
	
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
    	 mAboutView = view.findViewById(R.id.aboutbtnlayout);
    	 
    	 mHeadView.setOnClickListener(this);
    	 mChangxingSetView.setOnClickListener(this);
    	 mLavenderSetView.setOnClickListener(this);
    	 mNanshanSetView.setOnClickListener(this);
    	 mSofaSetView.setOnClickListener(this);
    	 mSunflowerView.setOnClickListener(this);
    	 mUniformView.setOnClickListener(this);
    	 mWestlakeView.setOnClickListener(this);
    	 mAboutView.setOnClickListener(this);

 		System.out.println();
    	return view;
    }

	@Override
	public void onClick(View v) {
		Fragment newContent = null;
		switch (v.getId()) {
		case R.id.headImageView:
			ImageGridActivity.onChangePageTitle(R.string.app_name);
			WeMarriedSlidingRightFragment.switchToDefaultSet();
		    newContent = new WeMarriedSlidingStartFragment();
		    break;
		case R.id.changxingset:
			ImageGridActivity.onChangePageTitle(R.string.wemarried_menu_changxing);
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
			ImageGridActivity.onChangePageTitle(R.string.wemarried_menu_lavender);
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
			ImageGridActivity.onChangePageTitle(R.string.wemarried_menu_nanshan);
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
			ImageGridActivity.onChangePageTitle(R.string.wemarried_menu_sofa);
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
			ImageGridActivity.onChangePageTitle(R.string.wemarried_menu_sunflower);
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
			ImageGridActivity.onChangePageTitle(R.string.wemarried_menu_uniform);
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
			ImageGridActivity.onChangePageTitle(R.string.wemarried_menu_westlake);
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
		case R.id.aboutbtnlayout:
			ImageGridActivity.onChangePageTitle(R.string.wemarried_menu_contact);
			WeMarriedSlidingRightFragment.switchToDefaultSet();
		    newContent = new WeMarriedAboutFragment();
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

package com.vector.wemarried.android.utils.bitmapfun.ui;

import com.vector.wemarried.android.utils.bitmapfun.ui.ImageDetailFragment;

import android.widget.ImageView;

public class ImageShower {
	
	public static void showImage(int _resId, ImageView _inView){
		_inView.setImageResource(_resId);		
	}
	
	public static void showImage(int _resId, ImageView _inView, ImageDetailFragment fragment){
		_inView.setImageResource(_resId);
		fragment.attachPhotoView(_inView);
	}

}

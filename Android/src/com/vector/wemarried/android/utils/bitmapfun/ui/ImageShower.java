package com.vector.wemarried.android.utils.bitmapfun.ui;

import java.io.InputStream;

import com.vector.wemarried.android.utils.bitmapfun.ui.ImageDetailFragment;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

public class ImageShower {
	
	public static void showImage(Context _context, int _resId, ImageView _inView){
		Bitmap tBitmap;
		tBitmap = ImageShower.readBitMap(_context, _resId);
		_inView.setImageBitmap(tBitmap);
		//_inView.setImageResource(_resId);		
	}
	
	public static void showImage(int _resId, ImageView _inView, ImageDetailFragment fragment){
		_inView.setImageResource(_resId);
		fragment.attachPhotoView(_inView);
	}
	
	public static Bitmap readBitMap(Context context, int _resId){  
	    BitmapFactory.Options opt = new BitmapFactory.Options();  
	    opt.inPreferredConfig = Bitmap.Config.RGB_565;   
	    opt.inPurgeable = true;  
	    opt.inInputShareable = true;   
	    InputStream is = context.getResources().openRawResource(_resId);  
	        return BitmapFactory.decodeStream(is,null,opt);  
	}  	

}

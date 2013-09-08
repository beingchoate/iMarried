package com.vector.wemarried.android;

import com.vector.wemarried.R;
import com.vector.wemarried.android.utils.bitmapfun.provider.Images;
import com.vector.wemarried.android.utils.bitmapfun.ui.ImageGridActivity;
import com.vector.wemarried.android.utils.bitmapfun.ui.ImageGridFragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class WeMarriedMenuFragment extends ListFragment {
	
	public String[] mScene;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_menu_list, null);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		mScene = getResources().getStringArray(R.array.scene);
		ArrayAdapter<String> colorAdapter = new ArrayAdapter<String>(getActivity(), 
				android.R.layout.simple_list_item_1, android.R.id.text1, mScene);
		setListAdapter(colorAdapter);
	}
	
	@Override
	public void onListItemClick(ListView lv, View v, int position, long id) {
		Fragment newContent = new ImageGridFragment();
		Log.i("Testing","position is: "+position+" Scene: "+mScene[position]);
		if(mScene[position].equals(getString(R.string.wemarried_menu_changxing)))
			Images.switchToChangxing();
		else if(mScene[position].equals(getString(R.string.wemarried_menu_lavender)))
			Images.switchToLavender();
		else if(mScene[position].equals(getString(R.string.wemarried_menu_nanshan)))
			Images.switchToNanshan();
		else if(mScene[position].equals(getString(R.string.wemarried_menu_sofa)))
			Images.switchToSofa();
		else if(mScene[position].equals(getString(R.string.wemarried_menu_sunflower)))
			Images.switchToSunflower();
		else if(mScene[position].equals(getString(R.string.wemarried_menu_uniform)))
			Images.switchToUniform();
		else if(mScene[position].equals(getString(R.string.wemarried_menu_westlake)))
			Images.switchToWestlake();
		
		Log.i("Testing","size of images is: "+Images.imageIDs.length);
		if (newContent != null)
			switchFragment(newContent);
	}
	
	// the meant of switching the above fragment
	private void switchFragment(Fragment fragment) {
		if (getActivity() == null)
			return;

		if (getActivity() instanceof ImageGridActivity) {
			ImageGridActivity ra = (ImageGridActivity) getActivity();
			ra.switchContent(fragment);
		}
	}
}

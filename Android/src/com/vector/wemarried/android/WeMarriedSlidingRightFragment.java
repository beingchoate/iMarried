package com.vector.wemarried.android;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class WeMarriedSlidingRightFragment extends Fragment{
	
	private TextView mScenePlace;
	private TextView mSuitesName;
	private TextView mDescription;
	
	public static int mScenePlaceId = R.string.wemarried_rightpage_desc1;
	public static int mSuitesNameId = R.string.wemarried_rightpage_desc2;
	public static int mDescriptionId = R.string.wemarried_rightpage_desc3;
	
    @Override
   public void onCreate(Bundle savedInstanceState) {
   	super.onCreate(savedInstanceState);    	
   }
    
    @Override
   public View onCreateView(LayoutInflater inflater, ViewGroup container,
   		Bundle savedInstanceState) {
    	
    	View view = inflater.inflate(R.layout.fragment_rightpage, container,
				false);
    	mScenePlace = (TextView)view.findViewById(R.id.leftdesc1);
    	mSuitesName = (TextView)view.findViewById(R.id.leftdesc2);
    	mDescription = (TextView)view.findViewById(R.id.leftdesc3);
    	
    	mScenePlace.setText(mScenePlaceId);
    	mSuitesName.setText(mSuitesNameId);
    	mDescription.setText(mDescriptionId);
    	
    	return view;
    }
    
    


}

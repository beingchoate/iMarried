package com.vector.wemarried.android;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class WeMarriedSlidingRightFragment extends Fragment{
	
	private static TextView mScenePlace;
	private static TextView mSuitesName;
	private static TextView mDescription;
	
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
    	    	
    	return view;
    }
    
    public static void setTextViews(){
    	mScenePlace.setText(mScenePlaceId);
    	mSuitesName.setText(mSuitesNameId);
    	mDescription.setText(mDescriptionId);    	
    }
    
    public static void switchToDefaultSet(){
    	WeMarriedSlidingRightFragment.mScenePlaceId = R.string.wemarried_rightpage_desc1;
    	WeMarriedSlidingRightFragment.mSuitesNameId = R.string.wemarried_rightpage_desc2;
    	WeMarriedSlidingRightFragment.mDescriptionId = R.string.wemarried_rightpage_desc3;
    	WeMarriedSlidingRightFragment.setTextViews();
    }
    
    public static void switchToChangxingSet(){
    	WeMarriedSlidingRightFragment.mScenePlaceId = R.string.wemarried_rightpage_scene_changxing;
    	WeMarriedSlidingRightFragment.mSuitesNameId = R.string.wemarried_rightpage_suitname_changxing;
    	WeMarriedSlidingRightFragment.setTextViews();
    }
    
    public static void switchToLavenderSet(){
    	WeMarriedSlidingRightFragment.mScenePlaceId = R.string.wemarried_rightpage_scene_lavender;
    	WeMarriedSlidingRightFragment.mSuitesNameId = R.string.wemarried_rightpage_suitname_lavender;
    	WeMarriedSlidingRightFragment.setTextViews();
    }
    
    public static void switchToNanshanSet(){
    	WeMarriedSlidingRightFragment.mScenePlaceId = R.string.wemarried_rightpage_scene_nanshan;
    	WeMarriedSlidingRightFragment.mSuitesNameId = R.string.wemarried_rightpage_suitname_nanshan;    	
    	WeMarriedSlidingRightFragment.setTextViews();
    }
    
    public static void switchToSofaSet(){
    	WeMarriedSlidingRightFragment.mScenePlaceId = R.string.wemarried_rightpage_scene_sofa;
    	WeMarriedSlidingRightFragment.mSuitesNameId = R.string.wemarried_rightpage_suitname_sofa;
    	WeMarriedSlidingRightFragment.setTextViews();
    }
    
    public static void switchToSunflowerSet(){
    	WeMarriedSlidingRightFragment.mScenePlaceId = R.string.wemarried_rightpage_scene_sunflower;
    	WeMarriedSlidingRightFragment.mSuitesNameId = R.string.wemarried_rightpage_suitname_sunflower;    	
    	WeMarriedSlidingRightFragment.setTextViews();
    }
    
    public static void switchToUniformSet(){
    	WeMarriedSlidingRightFragment.mScenePlaceId = R.string.wemarried_rightpage_scene_uniform;
    	WeMarriedSlidingRightFragment.mSuitesNameId = R.string.wemarried_rightpage_suitname_uniform;    	
    	WeMarriedSlidingRightFragment.setTextViews();
    }
    
    public static void switchToWestlakeSet(){
    	WeMarriedSlidingRightFragment.mScenePlaceId = R.string.wemarried_rightpage_scene_westlake;
    	WeMarriedSlidingRightFragment.mSuitesNameId = R.string.wemarried_rightpage_suitname_westlake;  	
    	WeMarriedSlidingRightFragment.setTextViews();
    }

}

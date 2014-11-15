package jitty.aandyan.SwipableTabView;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;

import jitty.aandyan.swipabletab.R;


public class SwipeTabView extends LinearLayout {


    private ArrayList<String> Titiles=new ArrayList<String>();
    public void setTitle(ArrayList<String> titles)
    {
        Titiles=titles;
    }


    private ViewPager mPager;
    private PagerSlidingTabStrip mTabs;
    private SwipeTabPagerAdapter mPagerAdapter;
    private ArrayList<Fragment> mGridViews;

    public SwipeTabView(Context context, ArrayList<String> titles, ArrayList<Fragment> fragments, FragmentManager fragmentManager) {
        super(context);
        Titiles=titles;
        mGridViews=fragments;
        mPagerAdapter = new SwipeTabPagerAdapter(fragmentManager);
        init();
    }

    public SwipeTabView(Context context, AttributeSet paramAttributeSet, ArrayList<String> titles) {
        super(context, paramAttributeSet);

        init();
    }

    private void init() {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View root = inflater.inflate(R.layout.swipe_layout, this);
        mTabs = (PagerSlidingTabStrip) root.findViewById(R.id.tabs);
        mPager = (ViewPager) root.findViewById(R.id.pager);


        mPager.setAdapter(mPagerAdapter);
        mTabs.setOnPageChangeListener(mOnPageChangeListener);
        mTabs.setViewPager(mPager);
    }


    private ViewPager.OnPageChangeListener mOnPageChangeListener = new ViewPager.SimpleOnPageChangeListener() {
        @Override
        public void onPageSelected(int item) {
        }

        @Override
        public void onPageScrollStateChanged(int arg0) {
        }
    };


    private class SwipeTabPagerAdapter extends FragmentPagerAdapter
    {
        public SwipeTabPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            return mGridViews.get(i);
        }


        @Override
        public int getCount() {
            return mGridViews.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            try{
                return Titiles.get(position);
            }
            catch (Exception e)
            {
                return "";
            }

        }

    }


}

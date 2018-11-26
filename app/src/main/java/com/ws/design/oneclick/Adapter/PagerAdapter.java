package com.ws.design.oneclick.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.ws.design.oneclick.fragment.TabOne;

/**
 * Created by KURPC on 24-01-2018.
 */

public class PagerAdapter extends FragmentPagerAdapter {

    int mNoOfTabs;
    public PagerAdapter(FragmentManager fm,int NumberOfTabs)

    {
      super(fm);
      this.mNoOfTabs = NumberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {

            case 0:
                TabOne tab1 = new TabOne();
                return tab1;
            case 1:
                TabOne tab2 = new TabOne();
                return tab2;
            case 2:
                TabOne tab3 = new TabOne();
                return  tab3;
            case 3:
                TabOne tab4 = new TabOne();
                return tab4;
                default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return mNoOfTabs ;

    }
}

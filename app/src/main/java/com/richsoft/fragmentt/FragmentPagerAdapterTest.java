package com.richsoft.fragmentt;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * 作者：chengjie on 17/1/6 14:11
 * 邮箱：10078216660@qq.com
 * 描述：
 */
public class FragmentPagerAdapterTest extends FragmentPagerAdapter {
    public FragmentPagerAdapterTest(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {


        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }
}

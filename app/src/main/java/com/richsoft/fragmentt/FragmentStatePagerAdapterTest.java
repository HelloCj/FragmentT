package com.richsoft.fragmentt;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * 作者：chengjie on 17/1/9 10:29
 * 邮箱：10078216660@qq.com
 * 描述：
 */
public class FragmentStatePagerAdapterTest extends FragmentStatePagerAdapter{
    public FragmentStatePagerAdapterTest(FragmentManager fm) {
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

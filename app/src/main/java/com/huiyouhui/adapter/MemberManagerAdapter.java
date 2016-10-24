package com.huiyouhui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.huiyouhui.fragment.CollectionMemberFragment;
import com.huiyouhui.fragment.RecommendMemberFragment;
import com.huiyouhui.lib.base.BaseFragment;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/10/13.
 */
public class MemberManagerAdapter extends FragmentPagerAdapter {
    String[] title = {"收藏的会员","推荐的会员"};
    ArrayList<BaseFragment> data;

    public MemberManagerAdapter(FragmentManager fm) {
        super(fm);
        data = new ArrayList<>();
        data.add(new CollectionMemberFragment());
        data.add(new RecommendMemberFragment());
    }

    @Override
    public Fragment getItem(int position) {
        return data.get(position);
    }

    @Override
    public int getCount() {
        return title.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }

}
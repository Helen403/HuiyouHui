package com.huiyouhui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.huiyouhui.fragment.CashFillFragment;
import com.huiyouhui.fragment.PayRecordAllFragment;
import com.huiyouhui.lib.base.BaseFragment;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/10/13.
 */
public class PayRecordAdapter extends FragmentPagerAdapter {
    String[] title = {"全部","交易成功", "退款订单"};
    ArrayList<BaseFragment> data;

    public PayRecordAdapter(FragmentManager fm) {
        super(fm);
        data = new ArrayList<>();
        data.add(new PayRecordAllFragment());
        data.add(new CashFillFragment());
        data.add(new CashFillFragment());
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
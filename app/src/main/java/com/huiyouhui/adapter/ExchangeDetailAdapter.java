package com.huiyouhui.adapter;

import android.view.View;

import com.huiyouhui.R;
import com.huiyouhui.bean.ExchangeDetailBean;
import com.huiyouhui.lib.base.MyBaseAdapter;

/**
 * Created by Administrator on 2016/10/19.
 */
public class ExchangeDetailAdapter extends MyBaseAdapter<ExchangeDetailBean> {


    @Override
    public int getContentView() {
        return R.layout.item_exchange_detail;
    }

    @Override
    public void onInitView(View view, ExchangeDetailBean exchangeDetailBean, int position) {

    }
}

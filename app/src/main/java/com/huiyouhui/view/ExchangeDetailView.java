package com.huiyouhui.view;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.huiyouhui.R;
import com.huiyouhui.lib.base.BaseView;

/**
 * Created by Administrator on 2016/10/19.
 */
public class ExchangeDetailView extends BaseView {

    public TextView tv1;
    public TextView tv2;
    public TextView tv3;
    public TextView finish;
    RelativeLayout rl;


    public ExchangeDetailView(Context context) {
        super(context);
    }

    @Override
    public int getContentView() {
        return R.layout.view_exchange_detail;
    }

    @Override
    public void findViews() {
        tv1 = (TextView) findViewById(R.id.tv_1);
        tv2 = (TextView) findViewById(R.id.tv_1);
        tv3 = (TextView) findViewById(R.id.tv_3);
        finish = (TextView) findViewById(R.id.finish);
        rl = (RelativeLayout) findViewById(R.id.rl);
    }

    @Override
    public void initData() {

    }

    @Override
    public void setListeners() {
        rl.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}

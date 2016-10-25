package com.huiyouhui.activity;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.huiyouhui.R;
import com.huiyouhui.adapter.ExchangeDetailAdapter;
import com.huiyouhui.bean.ExchangeDetailBean;
import com.huiyouhui.lib.base.BaseActivity;
import com.huiyouhui.lib.custemview.MyListView;
import com.huiyouhui.view.ExchangeDetailView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/10/14.
 */
public class ExchangeDetailsActivity extends BaseActivity {

    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;
    private TextView tv5;
    private TextView tv6;
    private MyListView listview;
    private TextView tv7;
    private TextView tv8;
    private TextView tv12;
    RelativeLayout rl_1;
    RelativeLayout rl_2;
    View view1;

    ExchangeDetailAdapter exchangeDetailAdapter;
    ExchangeDetailView exchangeDetailView;

    @Override
    public int getContentView() {
        return R.layout.activity_exchange_detail;
    }

    @Override
    public void findViews() {
        setTitle("兑换详情");
        tv1 = (TextView) findViewById(R.id.tv_1);
        tv2 = (TextView) findViewById(R.id.tv_1);
        tv3 = (TextView) findViewById(R.id.tv_3);
        tv4 = (TextView) findViewById(R.id.tv_4);
        tv5 = (TextView) findViewById(R.id.tv_5);
        tv6 = (TextView) findViewById(R.id.tv_6);
        listview = (MyListView) findViewById(R.id.listview);
        tv7 = (TextView) findViewById(R.id.tv_7);
        tv8 = (TextView) findViewById(R.id.tv_8);
        tv12 = (TextView) findViewById(R.id.tv_12);
        rl_1 = (RelativeLayout) findViewById(R.id.rl_1);
        rl_2 = (RelativeLayout) findViewById(R.id.rl_2);
        view1 = findViewById(R.id.view_1);
    }

    @Override
    protected void onShowMessage(RelativeLayout relativeLayout) {
        super.onShowMessage(relativeLayout);
        exchangeDetailView = new ExchangeDetailView(ExchangeDetailsActivity.this);

        exchangeDetailView.setVisibility(View.GONE);
        relativeLayout.addView(exchangeDetailView);
    }

    @Override
    public void initData() {
        setData();
    }

    private void setData() {
        ArrayList<ExchangeDetailBean> data = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            data.add(new ExchangeDetailBean());
        }
        exchangeDetailAdapter = new ExchangeDetailAdapter();
        listview.setAdapter(exchangeDetailAdapter);
        exchangeDetailAdapter.setData(data);

    }

    @Override
    public void setListeners() {
        exchangeDetailView.finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exchangeDetailView.setVisibility(View.GONE);
                rl_1.setVisibility(View.GONE);
                rl_2.setVisibility(View.GONE);
                view1.setVisibility(View.GONE);

            }
        });


        setOnListeners(tv12);
        setOnClick(new onClick() {
            @Override
            public void onClick(View v, int id) {
                switch (id) {
                    case R.id.tv_12:
                        exchangeDetailView.setVisibility(View.VISIBLE);
                        break;
                }
            }
        });

    }
}

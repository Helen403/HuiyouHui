package com.huiyouhui.activity;

import android.os.Handler;

import com.huiyouhui.R;
import com.huiyouhui.lib.base.BaseActivity;
import com.huiyouhui.lib.custemview.RefreshScrollView;

/**
 * Created by Administrator on 2016/10/14.
 */
public class ExchangeDetailsActivity extends BaseActivity {

    RefreshScrollView refreshScrollView;
    Handler handler = new Handler();

    @Override
    public int getContentView() {
        return R.layout.activity_exchange_detail;
    }

    @Override
    public void findViews() {
        refreshScrollView = (RefreshScrollView) findViewById(R.id.refresh);
    }

    @Override
    public void initData() {

    }

    @Override
    public void setListeners() {
        refreshScrollView.setOnRefresh(new RefreshScrollView.onRefresh() {
            @Override
            public void refresh() {
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        refreshScrollView.stopRefresh();
                    }
                }, 2000);
            }
        });
    }
}

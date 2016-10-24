package com.huiyouhui.activity;

import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;

import com.huiyouhui.R;
import com.huiyouhui.lib.base.BaseActivity;
import com.huiyouhui.view.SnapUpCountDownTimerView;

/**
 * Created by Administrator on 2016/10/24 0024.
 */
public class PreViewActivity extends BaseActivity {
    private SwipeRefreshLayout mSwipeRefreshLayout;


    @Override
    public int getContentView() {
        return R.layout.activity_preview;
    }

    @Override
    public void findViews() {
        mSwipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipeRefreshLayout);
        mSwipeRefreshLayout.setColorSchemeColors(getResources().getColor(R.color.bg_color));
        SnapUpCountDownTimerView rushBuyCountDownTimerView = (SnapUpCountDownTimerView) findViewById(R.id.RushBuyCountDownTimerView);
        rushBuyCountDownTimerView.setTime(1, 22, 11);
        rushBuyCountDownTimerView.start();
        mSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        T("刷新成功");
                        mSwipeRefreshLayout.setRefreshing(false);
                    }
                }, 1500);
            }
        });
    }

    @Override
    public void initData() {
        setTitle("店铺预览");
    }

    @Override
    public void setListeners() {

    }
}

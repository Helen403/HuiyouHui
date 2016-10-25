package com.huiyouhui.activity;

import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;

import com.huiyouhui.R;
import com.huiyouhui.lib.base.BaseActivity;

/**
 * Created by Administrator on 2016/10/24 0024.
 */
public class AddJobActivity extends BaseActivity {
    private SwipeRefreshLayout mWipeRefreshLayout;

    @Override
    public int getContentView() {
        return R.layout.activity_add_job;
    }

    @Override
    public void findViews() {
        mWipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipeRefreshLayout);
        mWipeRefreshLayout.setColorSchemeColors(getResources().getColor(R.color.bg_color));
    }

    @Override
    public void initData() {
        setTitle("添加招聘");
    }

    @Override
    public void setListeners() {
        mWipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        T("刷新成功");
                        mWipeRefreshLayout.setRefreshing(false);
                    }
                }, 1500);
            }
        });
    }
}

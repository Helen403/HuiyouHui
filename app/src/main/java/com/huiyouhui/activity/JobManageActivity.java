package com.huiyouhui.activity;

import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.huiyouhui.R;
import com.huiyouhui.lib.base.BaseActivity;

/**
 * Created by Administrator on 2016/10/24 0024.
 */
public class JobManageActivity extends BaseActivity {


    private ListView mListView;
    private TextView mTv0;
    private SwipeRefreshLayout mWipeRefreshLayout;

    @Override
    public int getContentView() {
        return R.layout.activity_job_manager;
    }

    @Override
    public void findViews() {
        mWipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipeRefreshLayout);
        mWipeRefreshLayout.setColorSchemeColors(getResources().getColor(R.color.bg_color));
        mListView = (ListView) findViewById(R.id.listview);
        mTv0 = (TextView) findViewById(R.id.tv_0);
    }

    @Override
    public void initData() {
        setTitle("招聘管理");
        getRightBtn().setText("添加招聘");
        getRightBtn().setTextSize(12);
    }

    @Override
    public void setListeners() {
        getRightBtn().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToActivityByClass(JobManageActivity.this, AddJobActivity.class);
            }
        });
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

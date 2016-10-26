package com.huiyouhui.activity;

import android.view.View;
import android.widget.TextView;

import com.huiyouhui.R;
import com.huiyouhui.adapter.JobManAdapter;
import com.huiyouhui.bean.JobManBean;
import com.huiyouhui.lib.LRecyclerView.interfaces.OnLoadMoreListener;
import com.huiyouhui.lib.LRecyclerView.interfaces.OnRefreshListener;
import com.huiyouhui.lib.LRecyclerView.recyclerview.LRecyclerView;
import com.huiyouhui.lib.LRecyclerView.recyclerview.LRecyclerViewAdapter;
import com.huiyouhui.lib.base.BaseActivity;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/10/24 0024.
 */
public class JobManageActivity extends BaseActivity {


    private TextView mTv0;
    LRecyclerView lRecyclerView;
    LRecyclerViewAdapter lRecyclerViewAdapter;

    @Override
    public int getContentView() {
        return R.layout.activity_job_manager;
    }

    @Override
    public void findViews() {
        mTv0 = (TextView) findViewById(R.id.tv_0);
        lRecyclerView = (LRecyclerView) findViewById(R.id.lrecyclerview);
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
                goToActivityByClass(AddJobActivity.class);
            }
        });
    }

    @Override
    protected void onAttachMyRecycleViewAdapter() {
        super.onAttachMyRecycleViewAdapter();
        lRecyclerViewAdapter = new LRecyclerViewAdapter(JobManageActivity.this, JobManAdapter.class, lRecyclerView);
        lRecyclerView.setAdapter(lRecyclerViewAdapter);
        lRecyclerView.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh() {
                ArrayList<JobManBean> data = new ArrayList<JobManBean>();
                for (int i = 0; i < 4; i++) {
                    data.add(new JobManBean());
                }
                lRecyclerViewAdapter.setRefresh(data);
            }
        });
        lRecyclerView.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore() {
                ArrayList<JobManBean> data = new ArrayList<JobManBean>();
                for (int i = 0; i < 1; i++) {
                    data.add(new JobManBean());
                }
                lRecyclerViewAdapter.setAddData(data);
            }
        });
        //刷新数据
        lRecyclerView.setRefreshing(true);

    }
}

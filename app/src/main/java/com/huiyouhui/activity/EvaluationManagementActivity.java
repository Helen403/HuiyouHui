package com.huiyouhui.activity;

import android.view.View;

import com.huiyouhui.R;
import com.huiyouhui.adapter.EvaluationManagementAdapter;
import com.huiyouhui.bean.EvaluationManagementBean;
import com.huiyouhui.lib.LRecyclerView.interfaces.OnItemClickListener;
import com.huiyouhui.lib.LRecyclerView.interfaces.OnLoadMoreListener;
import com.huiyouhui.lib.LRecyclerView.interfaces.OnRefreshListener;
import com.huiyouhui.lib.LRecyclerView.recyclerview.LRecyclerView;
import com.huiyouhui.lib.LRecyclerView.recyclerview.LRecyclerViewAdapter;
import com.huiyouhui.lib.base.BaseActivity;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/10/25.
 */
public class EvaluationManagementActivity extends BaseActivity {

    LRecyclerView lRecyclerView;
    LRecyclerViewAdapter lRecyclerViewAdapter;

    @Override
    public int getContentView() {
        return R.layout.activity_evaluation_management;
    }

    @Override
    public void findViews() {
        setTitle("评价管理");
        lRecyclerView = (LRecyclerView) findViewById(R.id.myrecycleview);
    }

    @Override
    public void initData() {
    }

    @Override
    public void setListeners() {
    }

    @Override
    protected void onAttachMyRecycleViewAdapter() {
        super.onAttachMyRecycleViewAdapter();

        lRecyclerViewAdapter = new LRecyclerViewAdapter(EvaluationManagementActivity.this, EvaluationManagementAdapter.class, lRecyclerView);
        lRecyclerView.setAdapter(lRecyclerViewAdapter);
        lRecyclerView.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh() {
                ArrayList<EvaluationManagementBean> data = new ArrayList<EvaluationManagementBean>();
                for (int i = 0; i < 4; i++) {
                    data.add(new EvaluationManagementBean());
                }
                lRecyclerViewAdapter.setRefresh(data);
            }
        });
        lRecyclerView.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore() {
                ArrayList<EvaluationManagementBean> data = new ArrayList<EvaluationManagementBean>();
                for (int i = 0; i < 1; i++) {
                    data.add(new EvaluationManagementBean());
                }
                lRecyclerViewAdapter.setAddData(data);
            }
        });
        //刷新数据
        lRecyclerView.setRefreshing(true);

        lRecyclerViewAdapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                goToActivityByClass(EvaluationDetailActivity.class);
            }

            @Override
            public void onItemLongClick(View view, int position) {

            }
        });
    }
}

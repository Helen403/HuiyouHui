package com.huiyouhui.activity;

import android.view.View;
import android.widget.RelativeLayout;

import com.huiyouhui.R;
import com.huiyouhui.adapter.SetNoticeAdapter;
import com.huiyouhui.bean.SetNoticeBean;
import com.huiyouhui.lib.LRecyclerView.interfaces.OnLoadMoreListener;
import com.huiyouhui.lib.LRecyclerView.interfaces.OnRefreshListener;
import com.huiyouhui.lib.LRecyclerView.recyclerview.LRecyclerView;
import com.huiyouhui.lib.LRecyclerView.recyclerview.LRecyclerViewAdapter;
import com.huiyouhui.lib.base.BaseActivity;
import com.huiyouhui.view.DelectNoticeView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/10/25.
 */
public class SetNoticeActivity extends BaseActivity {

    LRecyclerView lRecyclerView;
    LRecyclerViewAdapter lRecyclerViewAdapter;
    public DelectNoticeView delectNoticeView;

    @Override
    public int getContentView() {
        return R.layout.activity_set_notice;
    }

    @Override
    public void findViews() {
        setTitle("公告设置");
        getRightBtn().setText("添加公告");
        lRecyclerView = (LRecyclerView) findViewById(R.id.myrecycleview);

    }

    @Override
    protected void onShowMessage(RelativeLayout relativeLayout) {
        super.onShowMessage(relativeLayout);
        delectNoticeView = new DelectNoticeView(SetNoticeActivity.this);
        delectNoticeView.setVisibility(View.GONE);
        relativeLayout.addView(delectNoticeView);
    }

    @Override
    public void initData() {

    }

    @Override
    public void setListeners() {
        getRightBtn().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToActivityByClass(EditNoticeActivity.class);
            }
        });
    }


    @Override
    protected void onAttachMyRecycleViewAdapter() {
        super.onAttachMyRecycleViewAdapter();
        lRecyclerViewAdapter = new LRecyclerViewAdapter(SetNoticeActivity.this, SetNoticeAdapter.class, lRecyclerView);
        lRecyclerView.setAdapter(lRecyclerViewAdapter);
        lRecyclerView.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh() {
                ArrayList<SetNoticeBean> data = new ArrayList<SetNoticeBean>();
                for (int i = 0; i < 4; i++) {
                    data.add(new SetNoticeBean());
                }
                lRecyclerViewAdapter.setRefresh(data);
            }
        });
        lRecyclerView.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore() {
                ArrayList<SetNoticeBean> data = new ArrayList<SetNoticeBean>();
                for (int i = 0; i < 1; i++) {
                    data.add(new SetNoticeBean());
                }
                lRecyclerViewAdapter.setRefresh(data);
            }
        });
        //刷新数据
        lRecyclerView.setRefreshing(true);
    }
}

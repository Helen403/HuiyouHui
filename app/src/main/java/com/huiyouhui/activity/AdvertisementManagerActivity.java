package com.huiyouhui.activity;

import android.view.View;
import android.widget.RelativeLayout;

import com.huiyouhui.R;
import com.huiyouhui.adapter.AdvertisementManagerAdapter;
import com.huiyouhui.bean.AdvertisementManagerBean;
import com.huiyouhui.lib.LRecyclerView.interfaces.OnLoadMoreListener;
import com.huiyouhui.lib.LRecyclerView.interfaces.OnRefreshListener;
import com.huiyouhui.lib.LRecyclerView.recyclerview.LRecyclerView;
import com.huiyouhui.lib.LRecyclerView.recyclerview.LRecyclerViewAdapter;
import com.huiyouhui.lib.base.BaseActivity;
import com.huiyouhui.view.DelectAdvertisementView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/10/26.
 */
public class AdvertisementManagerActivity extends BaseActivity {

    LRecyclerView lRecyclerView;
    LRecyclerViewAdapter lRecyclerViewAdapter;

    public DelectAdvertisementView delectAdvertisementView;

    @Override
    public int getContentView() {
        return R.layout.activity_advertisement_manager;
    }

    @Override
    public void findViews() {
        setTitle("广告管理");
        getRightBtn().setText("添加广告");
        lRecyclerView = (LRecyclerView) findViewById(R.id.myrecycleview);

    }

    @Override
    protected void onShowMessage(RelativeLayout relativeLayout) {
        super.onShowMessage(relativeLayout);

        delectAdvertisementView = new DelectAdvertisementView(AdvertisementManagerActivity.this);
        delectAdvertisementView.setVisibility(View.GONE);
        relativeLayout.addView(delectAdvertisementView);
    }

    @Override
    public void initData() {
    }

    @Override
    public void setListeners() {
        getRightBtn().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToActivityByClass(AddAdvertisementActivity.class);
            }
        });
    }


    @Override
    protected void onAttachMyRecycleViewAdapter() {
        super.onAttachMyRecycleViewAdapter();

        lRecyclerViewAdapter = new LRecyclerViewAdapter(AdvertisementManagerActivity.this, AdvertisementManagerAdapter.class, lRecyclerView);
        lRecyclerView.setAdapter(lRecyclerViewAdapter);
        lRecyclerView.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh() {
                ArrayList<AdvertisementManagerBean> data = new ArrayList<AdvertisementManagerBean>();
                for (int i = 0; i < 4; i++) {
                    data.add(new AdvertisementManagerBean());
                }
                lRecyclerViewAdapter.setRefresh(data);
            }
        });
        lRecyclerView.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore() {
                ArrayList<AdvertisementManagerBean> data = new ArrayList<AdvertisementManagerBean>();
                for (int i = 0; i < 1; i++) {
                    data.add(new AdvertisementManagerBean());
                }
                lRecyclerViewAdapter.setAddData(data);
            }
        });
        //刷新数据
        lRecyclerView.setRefreshing(true);

    }
}

package com.huiyouhui.activity;

import android.view.View;

import com.huiyouhui.R;
import com.huiyouhui.adapter.RedDetailAdapter;
import com.huiyouhui.bean.RedDetailBean;
import com.huiyouhui.lib.MyRecycleView.MyLinearLayoutManager;
import com.huiyouhui.lib.base.BaseActivity;
import com.huiyouhui.lib.base.MyBaseRecycleAdapter;
import com.huiyouhui.lib.custemview.MyRecycleView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/10/20.
 */
public class RedDetailActivity extends BaseActivity {
    MyRecycleView myRecycleView;
    RedDetailAdapter redDetailAdapter;
    View headView;

    @Override
    public int getContentView() {
        return R.layout.activity_red_detail;
    }

    @Override
    public void findViews() {
        setTitle("红包详情");
        myRecycleView = (MyRecycleView) findViewById(R.id.myrecycleview);
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


        //添加头部View
        headView = inflater.inflate(R.layout.view_red_detail_head, content, false);
        myRecycleView.addHeaderView(headView);

        // 使用重写后的线性布局管理器
        MyLinearLayoutManager manager = new MyLinearLayoutManager(this);
        myRecycleView.setLayoutManager(manager);

        redDetailAdapter = new RedDetailAdapter(this, myRecycleView);
        myRecycleView.setAdapter(redDetailAdapter);


        redDetailAdapter.setOnRefresh(new MyBaseRecycleAdapter.OnRefresh() {
            @Override
            public void onRefresh() {
                ArrayList<RedDetailBean> data = new ArrayList<RedDetailBean>();
                for (int i = 0; i < 5; i++) {
                    data.add(new RedDetailBean());
                }
                redDetailAdapter.setRefresh(data);
            }

            @Override
            public void onAddData() {
                ArrayList<RedDetailBean> data = new ArrayList<RedDetailBean>();
                for (int i = 0; i < 1; i++) {
                    data.add(new RedDetailBean());
                }
                redDetailAdapter.setAddData(data);
            }
        });


        // 刷新
        myRecycleView.setRefresh(true);


    }
}

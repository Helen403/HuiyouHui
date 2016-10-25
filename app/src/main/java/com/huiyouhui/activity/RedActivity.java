package com.huiyouhui.activity;

import android.view.View;
import android.widget.TextView;

import com.huiyouhui.R;
import com.huiyouhui.adapter.RedAdapter;
import com.huiyouhui.bean.RedBean;
import com.huiyouhui.lib.MyRecycleView.MyLinearLayoutManager;
import com.huiyouhui.lib.base.BaseActivity;
import com.huiyouhui.lib.base.MyBaseRecycleAdapter;
import com.huiyouhui.lib.custemview.MyRecycleView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/10/19.
 */
public class RedActivity extends BaseActivity {

    MyRecycleView myRecycleView;
    RedAdapter redAdapter;
    TextView tv_12;

    @Override
    public int getContentView() {
        return R.layout.activity_red;
    }

    @Override
    public void findViews() {
        setTitle("红包管理");
        myRecycleView = (MyRecycleView) findViewById(R.id.myrecycleview);
        tv_12 = (TextView) findViewById(R.id.tv_12);
    }


    @Override
    public void initData() {

    }

    @Override
    public void setListeners() {
        setOnListeners(tv_12);
        setOnClick(new onClick() {
            @Override
            public void onClick(View v, int id) {
                switch (id) {
                    case R.id.tv_12:
                        goToActivityByClass( SetRedActivity.class);
                        break;
                }
            }
        });

    }

    @Override
    protected void onAttachMyRecycleViewAdapter() {
        super.onAttachMyRecycleViewAdapter();
        // 使用重写后的线性布局管理器
        MyLinearLayoutManager manager = new MyLinearLayoutManager(this);
        myRecycleView.setLayoutManager(manager);

        redAdapter = new RedAdapter(this, myRecycleView);
        myRecycleView.setAdapter(redAdapter);
        // 刷新
        myRecycleView.setRefresh(true);

        redAdapter.setOnRefresh(new MyBaseRecycleAdapter.OnRefresh() {
            @Override
            public void onRefresh() {
                ArrayList<RedBean> data = new ArrayList<RedBean>();
                for (int i = 0; i < 5; i++) {
                    data.add(new RedBean());
                }
                redAdapter.setRefresh(data);
            }

            @Override
            public void onAddData() {
                ArrayList<RedBean> data = new ArrayList<RedBean>();
                for (int i = 0; i < 1; i++) {
                    data.add(new RedBean());
                }
                redAdapter.setAddData(data);
            }
        });

        redAdapter.setOnItemClickListener(new MyBaseRecycleAdapter.OnItemClickListener<RedBean>() {
            @Override
            public void onItemClick(View view, int position, RedBean redBean) {
                //跳转到对应的红包详情
                goToRedDetail(view, position, redBean);
            }
        });

    }

    private void goToRedDetail(View view, int position, RedBean redBean) {

        goToActivityByClass( RedDetailActivity.class);
    }


}

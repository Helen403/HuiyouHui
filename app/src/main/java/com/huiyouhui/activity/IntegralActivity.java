package com.huiyouhui.activity;

import android.widget.TextView;

import com.huiyouhui.R;
import com.huiyouhui.adapter.IntegralAdapter;
import com.huiyouhui.bean.IntegralBean;
import com.huiyouhui.lib.MyRecycleView.MyLinearLayoutManager;
import com.huiyouhui.lib.base.BaseActivity;
import com.huiyouhui.lib.base.MyBaseRecycleAdapter;
import com.huiyouhui.lib.custemview.MyRecycleView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/10/13.
 */
public class IntegralActivity extends BaseActivity {
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private MyRecycleView myrecycleview;
    IntegralAdapter integralAdapter;


    @Override
    public int getContentView() {
        return R.layout.activity_integral;
    }

    @Override
    public void findViews() {
        setTitle("积分记录");

        tv1 = (TextView) findViewById(R.id.tv_1);
        tv2 = (TextView) findViewById(R.id.tv_2);
        tv3 = (TextView) findViewById(R.id.tv_3);
        myrecycleview = (MyRecycleView) findViewById(R.id.myrecycleview);
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

        // 使用重写后的线性布局管理器
        MyLinearLayoutManager manager = new MyLinearLayoutManager(this);
        myrecycleview.setLayoutManager(manager);

        integralAdapter = new IntegralAdapter(this, myrecycleview);
        myrecycleview.setAdapter(integralAdapter);
        // 刷新
        myrecycleview.setRefresh(true);

        integralAdapter.setOnRefresh(new MyBaseRecycleAdapter.OnRefresh() {
            @Override
            public void onRefresh() {
                ArrayList<IntegralBean> data = new ArrayList<IntegralBean>();
                for (int i = 0; i < 5; i++) {
                    data.add(new IntegralBean());
                }
                integralAdapter.setRefresh(data);
            }

            @Override
            public void onAddData() {
                ArrayList<IntegralBean> data = new ArrayList<IntegralBean>();
                for (int i = 0; i < 1; i++) {
                    data.add(new IntegralBean());
                }
                integralAdapter.setAddData(data);

            }
        });
    }
}

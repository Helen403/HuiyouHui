package com.huiyouhui.activity;

import android.widget.TextView;

import com.huiyouhui.R;
import com.huiyouhui.adapter.GiveIntegralRecordAdapter;
import com.huiyouhui.bean.GiveIntegralRecordBean;
import com.huiyouhui.lib.MyRecycleView.MyLinearLayoutManager;
import com.huiyouhui.lib.base.BaseActivity;
import com.huiyouhui.lib.base.MyBaseRecycleAdapter;
import com.huiyouhui.lib.custemview.MyRecycleView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/10/14.
 */
public class GiveIntegralRecordActivity extends BaseActivity {
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private MyRecycleView myrecycleview;
    GiveIntegralRecordAdapter giveIntegralRecordAdapter;

    @Override
    public int getContentView() {
        return R.layout.activity_give_integral_record;
    }

    @Override
    public void findViews() {
        setTitle("赠送记录");

        tv1 = (TextView) findViewById(R.id.tv_1);
        tv2 = (TextView) findViewById(R.id.tv_1);
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

        giveIntegralRecordAdapter = new GiveIntegralRecordAdapter(this, myrecycleview);
        myrecycleview.setAdapter(giveIntegralRecordAdapter);
        // 刷新
        myrecycleview.setRefresh(true);

        giveIntegralRecordAdapter.setOnRefresh(new MyBaseRecycleAdapter.OnRefresh() {
            @Override
            public void onRefresh() {
                ArrayList<GiveIntegralRecordBean> data = new ArrayList<GiveIntegralRecordBean>();
                for (int i = 0; i < 5; i++) {
                    data.add(new GiveIntegralRecordBean());
                }
                giveIntegralRecordAdapter.setRefresh(data);
            }

            @Override
            public void onAddData() {
                ArrayList<GiveIntegralRecordBean> data = new ArrayList<GiveIntegralRecordBean>();
                for (int i = 0; i < 1; i++) {
                    data.add(new GiveIntegralRecordBean());
                }
                giveIntegralRecordAdapter.setAddData(data);

            }
        });

    }
}

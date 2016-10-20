package com.huiyouhui.activity;

import com.huiyouhui.R;
import com.huiyouhui.adapter.ExchangeRecordAdapter;
import com.huiyouhui.bean.ExchangeRecordBean;
import com.huiyouhui.lib.MyRecycleView.MyLinearLayoutManager;
import com.huiyouhui.lib.base.BaseActivity;
import com.huiyouhui.lib.base.MyBaseRecycleAdapter;
import com.huiyouhui.lib.custemview.MyRecycleView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/10/19.
 */
public class ExchangeRecordActivity extends BaseActivity {


    MyRecycleView myRecycleView;
    ExchangeRecordAdapter exchangeRecordAdapter;

    @Override
    public int getContentView() {
        return R.layout.activity_exchange_record;
    }

    @Override
    public void findViews() {
        setTitle("兑换记录");
        myRecycleView = (MyRecycleView) findViewById(R.id.myrecycleview);
    }

    @Override
    public void initData() {
        MyRecycleView();
    }

    @Override
    public void setListeners() {

    }


    private void MyRecycleView() {
        // 使用重写后的线性布局管理器
        MyLinearLayoutManager manager = new MyLinearLayoutManager(this);
        myRecycleView.setLayoutManager(manager);

        exchangeRecordAdapter = new ExchangeRecordAdapter(this, myRecycleView);
        myRecycleView.setAdapter(exchangeRecordAdapter);
        // 刷新
        myRecycleView.setRefresh(true);

        exchangeRecordAdapter.setOnRefresh(new MyBaseRecycleAdapter.OnRefresh() {
            @Override
            public void onRefresh() {
                ArrayList<ExchangeRecordBean> data = new ArrayList<ExchangeRecordBean>();
                for (int i = 0; i < 5; i++) {
                    data.add(new ExchangeRecordBean());
                }
                exchangeRecordAdapter.setRefresh(data);
            }

            @Override
            public void onAddData() {
                ArrayList<ExchangeRecordBean> data = new ArrayList<ExchangeRecordBean>();
                for (int i = 0; i < 1; i++) {
                    data.add(new ExchangeRecordBean());
                }
                exchangeRecordAdapter.setAddData(data);
            }
        });
    }
}

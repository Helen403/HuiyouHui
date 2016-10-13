package com.huiyouhui.activity;

import android.widget.TextView;

import com.huiyouhui.R;
import com.huiyouhui.adapter.WithdrawalsAdapter;
import com.huiyouhui.bean.WithdrawalsBean;
import com.huiyouhui.lib.MyRecycleView.MyLinearLayoutManager;
import com.huiyouhui.lib.base.BaseActivity;
import com.huiyouhui.lib.base.MyBaseRecycleAdapter;
import com.huiyouhui.lib.custemview.MyRecycleView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/10/13.
 */
public class WithdrawalsActivity extends BaseActivity {
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;
    private MyRecycleView myrecycleview;
    WithdrawalsAdapter withdrawalsAdapter;

    @Override
    public int getContentView() {
        return R.layout.activity_withdrawals;
    }

    @Override
    public void findViews() {
        setTitle("申请提现");
        tv1 = (TextView) findViewById(R.id.tv_1);
        tv2 = (TextView) findViewById(R.id.tv_2);
        tv3 = (TextView) findViewById(R.id.tv_3);
        tv4 = (TextView) findViewById(R.id.tv_4);
        myrecycleview = (MyRecycleView) findViewById(R.id.myrecycleview);
    }

    @Override
    public void initData() {
        //设置RecyclerView
        MyRecycleView();
    }

    @Override
    public void setListeners() {

    }


    private void MyRecycleView() {
        // 使用重写后的线性布局管理器
        MyLinearLayoutManager manager = new MyLinearLayoutManager(this);
        myrecycleview.setLayoutManager(manager);

        withdrawalsAdapter = new WithdrawalsAdapter(this, myrecycleview);
        myrecycleview.setAdapter(withdrawalsAdapter);
        // 刷新
        myrecycleview.setRefresh(true);

        withdrawalsAdapter.setOnRefresh(new MyBaseRecycleAdapter.OnRefresh() {
            @Override
            public void onRefresh() {
                ArrayList<WithdrawalsBean> data = new ArrayList<WithdrawalsBean>();
                for (int i = 0; i < 5; i++) {
                    data.add(new WithdrawalsBean());
                }
                withdrawalsAdapter.setRefresh(data);
            }

            @Override
            public void onAddData() {
                ArrayList<WithdrawalsBean> data = new ArrayList<WithdrawalsBean>();
                for (int i = 0; i < 1; i++) {
                    data.add(new WithdrawalsBean());
                }
                withdrawalsAdapter.setAddData(data);

            }
        });
    }
}

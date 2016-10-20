package com.huiyouhui.activity;

import com.huiyouhui.R;
import com.huiyouhui.adapter.SuperValueAdapter;
import com.huiyouhui.bean.SuperValueBean;
import com.huiyouhui.lib.MyRecycleView.MyLinearLayoutManager;
import com.huiyouhui.lib.base.BaseActivity;
import com.huiyouhui.lib.base.MyBaseRecycleAdapter;
import com.huiyouhui.lib.custemview.MyRecycleView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/10/20.
 */
public class SuperValueShopActivity extends BaseActivity {
    private MyRecycleView myrecycleview;
    SuperValueAdapter superValueAdapter;


    @Override
    public int getContentView() {
        return R.layout.activity_super_value_shop;
    }

    @Override
    public void findViews() {
        setTitle("超值商品管理");
        getRightBtn().setText("添加商品");

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

        superValueAdapter = new SuperValueAdapter(this, myrecycleview);
        myrecycleview.setAdapter(superValueAdapter);


        superValueAdapter.setOnRefresh(new MyBaseRecycleAdapter.OnRefresh() {
            @Override
            public void onRefresh() {
                ArrayList<SuperValueBean> data = new ArrayList<SuperValueBean>();
                for (int i = 0; i < 5; i++) {
                    data.add(new SuperValueBean());
                }
                superValueAdapter.setRefresh(data);
            }

            @Override
            public void onAddData() {
                ArrayList<SuperValueBean> data = new ArrayList<SuperValueBean>();
                for (int i = 0; i < 1; i++) {
                    data.add(new SuperValueBean());
                }
                superValueAdapter.setAddData(data);
            }
        });


        // 刷新
        myrecycleview.setRefresh(true);


    }
}

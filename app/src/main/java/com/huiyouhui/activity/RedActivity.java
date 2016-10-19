package com.huiyouhui.activity;

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

    @Override
    public int getContentView() {
        return R.layout.activity_red;
    }

    @Override
    public void findViews() {
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


    }


}

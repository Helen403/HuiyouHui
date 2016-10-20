package com.huiyouhui.activity;

import android.view.View;

import com.huiyouhui.R;
import com.huiyouhui.adapter.CardManagerAdapter;
import com.huiyouhui.bean.CardManagerBean;
import com.huiyouhui.lib.MyRecycleView.MyLinearLayoutManager;
import com.huiyouhui.lib.base.BaseActivity;
import com.huiyouhui.lib.base.MyBaseRecycleAdapter;
import com.huiyouhui.lib.custemview.MyRecycleView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/10/20.
 */
public class CardManagerActivity extends BaseActivity {
    MyRecycleView myRecycleView;
    CardManagerAdapter cardManagerAdapter;

    @Override
    public int getContentView() {
        return R.layout.activity_card_manager;
    }

    @Override
    public void findViews() {
        setTitle("卡卷管理");
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

        cardManagerAdapter = new CardManagerAdapter(this, myRecycleView);
        myRecycleView.setAdapter(cardManagerAdapter);
        // 刷新
        myRecycleView.setRefresh(true);

        cardManagerAdapter.setOnRefresh(new MyBaseRecycleAdapter.OnRefresh() {
            @Override
            public void onRefresh() {
                ArrayList<CardManagerBean> data = new ArrayList<CardManagerBean>();
                for (int i = 0; i < 5; i++) {
                    data.add(new CardManagerBean());
                }
                cardManagerAdapter.setRefresh(data);
            }

            @Override
            public void onAddData() {
                ArrayList<CardManagerBean> data = new ArrayList<CardManagerBean>();
                for (int i = 0; i < 1; i++) {
                    data.add(new CardManagerBean());
                }
                cardManagerAdapter.setAddData(data);
            }
        });

        cardManagerAdapter.setOnItemClickListener(new MyBaseRecycleAdapter.OnItemClickListener<CardManagerBean>() {
            @Override
            public void onItemClick(View view, int position, CardManagerBean cardManagerBean) {
                goToActivityByClass(CardManagerActivity.this, CardDetailActivity.class);
            }
        });

    }
}

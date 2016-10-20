package com.huiyouhui.activity;

import android.view.View;

import com.huiyouhui.R;
import com.huiyouhui.adapter.ChoiceShopAdapter;
import com.huiyouhui.bean.ChoiceShopBean;
import com.huiyouhui.lib.MyRecycleView.MyLinearLayoutManager;
import com.huiyouhui.lib.base.BaseActivity;
import com.huiyouhui.lib.base.MyBaseRecycleAdapter;
import com.huiyouhui.lib.custemview.MyRecycleView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/10/20.
 */
public class ChoiceShopActivity extends BaseActivity {
    MyRecycleView recycleView;
    ChoiceShopAdapter choiceShopAdapter;

    @Override
    public int getContentView() {
        return R.layout.activity_choice_shop;
    }

    @Override
    public void findViews() {
        setTitle("选择商品");
        recycleView = (MyRecycleView) findViewById(R.id.myrecycleview);
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
        recycleView.setLayoutManager(manager);

        choiceShopAdapter = new ChoiceShopAdapter(this, recycleView);
        recycleView.setAdapter(choiceShopAdapter);


        choiceShopAdapter.setOnRefresh(new MyBaseRecycleAdapter.OnRefresh() {
            @Override
            public void onRefresh() {
                ArrayList<ChoiceShopBean> data = new ArrayList<ChoiceShopBean>();
                for (int i = 0; i < 2; i++) {
                    data.add(new ChoiceShopBean());
                }
                choiceShopAdapter.setRefresh(data);
            }

            @Override
            public void onAddData() {
                ArrayList<ChoiceShopBean> data = new ArrayList<ChoiceShopBean>();
                for (int i = 0; i < 1; i++) {
                    data.add(new ChoiceShopBean());
                }
                choiceShopAdapter.setAddData(data);
            }
        });
        // 刷新
        recycleView.setRefresh(true);

        choiceShopAdapter.setOnItemClickListener(new MyBaseRecycleAdapter.OnItemClickListener<ChoiceShopBean>() {
            @Override
            public void onItemClick(View view, int position, ChoiceShopBean choiceShopBean) {
                finish();
            }
        });

    }
}

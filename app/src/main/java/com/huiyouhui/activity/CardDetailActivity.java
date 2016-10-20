package com.huiyouhui.activity;

import android.graphics.Color;
import android.widget.ListView;

import com.huiyouhui.R;
import com.huiyouhui.adapter.CardDetailAdapter;
import com.huiyouhui.bean.CardDetailBean;
import com.huiyouhui.lib.base.BaseActivity;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/10/20.
 */
public class CardDetailActivity extends BaseActivity {
    ListView listView;

    CardDetailAdapter cardDetailAdapter;

    @Override
    public int getContentView() {
        return R.layout.activity_card_detail;
    }

    @Override
    public void findViews() {
        setTitle("卡卷详情");
        status.setBackgroundColor(Color.parseColor("#FF9C00"));
        head_view.setBackgroundColor(Color.parseColor("#FF9C00"));

        listView = (ListView) findViewById(R.id.listview);


    }

    @Override
    public void initData() {
        //设置listview的数据
        setListViewData();
    }

    //设置listview的数据
    private void setListViewData() {
        ArrayList<CardDetailBean> data = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            data.add(new CardDetailBean());
        }
        cardDetailAdapter = new CardDetailAdapter(CardDetailActivity.this);
        listView.setAdapter(cardDetailAdapter);
    }

    @Override
    public void setListeners() {

    }
}

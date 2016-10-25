package com.huiyouhui.adapter;

import android.content.Context;

import com.huiyouhui.R;
import com.huiyouhui.bean.CardManagerBean;
import com.huiyouhui.lib.base.MyBaseRecycleAdapter;
import com.huiyouhui.lib.custemview.MyRecycleView;

/**
 * Created by Administrator on 2016/10/20.
 */
public class CardManagerAdapter extends MyBaseRecycleAdapter<CardManagerBean> {
    public CardManagerAdapter(Context context, MyRecycleView mRecyclerView) {
        super( mRecyclerView);
    }

    @Override
    public int getContentView() {
        return R.layout.item_card_manager;
    }

    @Override
    public void onInitView(RecycleViewHolder holder, CardManagerBean cardManagerBean, int position) {

    }
}

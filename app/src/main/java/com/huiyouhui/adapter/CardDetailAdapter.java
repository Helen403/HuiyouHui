package com.huiyouhui.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.View;

import com.huiyouhui.R;
import com.huiyouhui.bean.CardDetailBean;
import com.huiyouhui.lib.base.MyBaseAdapter;
import com.huiyouhui.lib.custemview.CircleImageView;

/**
 * Created by Administrator on 2016/10/20.
 */
public class CardDetailAdapter extends MyBaseAdapter<CardDetailBean> {
    public CardDetailAdapter(Context context) {
        super(context);
    }

    @Override
    public int getContentView() {
        return R.layout.item_card_detail;
    }

    @Override
    public void onInitView(View view, CardDetailBean cardDetailBean, int position) {
        CircleImageView cir = getViewById(R.id.cir);
        cir.setBorderWidth(0);
        cir.setBorderColor(Color.parseColor("#00000000"));
    }
}

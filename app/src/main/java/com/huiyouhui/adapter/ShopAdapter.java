package com.huiyouhui.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.huiyouhui.R;
import com.huiyouhui.bean.ShopBean;
import com.huiyouhui.lib.base.MyBaseAdapter;

/**
 * Created by Administrator on 2016/10/11.
 */
public class ShopAdapter extends MyBaseAdapter<ShopBean> {
    public ShopAdapter(Context context) {
        super(context);
    }

    @Override
    public int getContentView() {
        return R.layout.item_shop;
    }

    @Override
    public void onInitView(View view, ShopBean shopBean, int position) {
        ImageView imageView = getViewById(R.id.iv_1);
        imageView.setImageResource(shopBean.drawable);
        setText(shopBean.title,R.id.tv_1);
    }
}

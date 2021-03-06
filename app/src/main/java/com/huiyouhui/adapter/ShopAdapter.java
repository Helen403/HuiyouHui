package com.huiyouhui.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.huiyouhui.R;
import com.huiyouhui.bean.ShopBean;
import com.huiyouhui.factroy.ProjectFactroy;
import com.huiyouhui.lib.base.MyBaseAdapter;

/**
 * Created by Administrator on 2016/10/11.
 */
public class ShopAdapter extends MyBaseAdapter<ShopBean> {



    @Override
    public int getContentView() {
        return R.layout.item_shop;
    }

    @Override
    public void onInitView(View view, final ShopBean shopBean, int position) {
        ImageView imageView = getViewById(R.id.iv_1);
        imageView.setImageResource(shopBean.drawable);
        setText(shopBean.title, R.id.tv_1);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToActivityByClass(ProjectFactroy.getClazzByModelName(shopBean.title));
            }
        });
    }
}

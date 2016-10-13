package com.huiyouhui.view;

import android.content.Context;
import android.view.View;

import com.huiyouhui.R;
import com.huiyouhui.lib.base.BaseView;

/**
 * Created by Administrator on 2016/9/7.
 */
public class AdverView extends BaseView{
    public AdverView(Context context) {
        super(context);
    }

    @Override
    public void findViews() {

    }

    @Override
    public int getContentView() {
        return R.layout.view_adver;
    }

    @Override
    public void setListeners() {

    }

    @Override
    public void initData() {
        view.findViewById(R.id.ll).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setVisibility(GONE);
            }
        });
    }
}

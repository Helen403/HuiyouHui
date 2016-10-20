package com.huiyouhui.view;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.huiyouhui.R;
import com.huiyouhui.lib.base.BaseView;

/**
 * Created by Administrator on 2016/10/12.
 */
public class RevokeShopView extends BaseView {

    RelativeLayout relativeLayout;
    private TextView tv1;
    private TextView sure;
    private TextView cancel;


    public RevokeShopView(Context context) {
        super(context);
    }


    @Override
    public int getContentView() {
        return R.layout.view_revoke_shop;
    }

    @Override
    public void findViews() {
        relativeLayout = (RelativeLayout) view.findViewById(R.id.rl_exit);

        tv1 = (TextView) findViewById(R.id.tv_1);
        sure = (TextView) findViewById(R.id.sure);
        cancel = (TextView) findViewById(R.id.cancel);
    }


    @Override
    public void initData() {

    }

    @Override
    public void setListeners() {
        setOnListeners(relativeLayout, sure);
        setOnClick(new onClick() {
            @Override
            public void onClick(View v, int id) {
                switch (id) {
                    case R.id.rl_exit:
                        view.setVisibility(GONE);
                        break;
                    case R.id.sure:
                        view.setVisibility(GONE);
                        break;
                    case R.id.cancel:
                        view.setVisibility(GONE);
                        break;
                }
            }
        });
    }
}

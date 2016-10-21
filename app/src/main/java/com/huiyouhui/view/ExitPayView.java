package com.huiyouhui.view;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.huiyouhui.R;
import com.huiyouhui.lib.base.BaseView;

/**
 * Created by Administrator on 2016/10/21.
 */
public class ExitPayView extends BaseView {

    public RelativeLayout rlExit;
    public TextView tv1;
    public TextView tv2;
    public EditText edit;
    public TextView sure;
    public TextView cancel;


    public ExitPayView(Context context) {
        super(context);
    }

    @Override
    public int getContentView() {
        return R.layout.view_exit_pay;
    }

    @Override
    public void findViews() {
        rlExit = (RelativeLayout) findViewById(R.id.rl_exit);
        tv1 = (TextView) findViewById(R.id.tv_1);
        tv2 = (TextView) findViewById(R.id.tv_2);
        edit = (EditText) findViewById(R.id.edit);
        sure = (TextView) findViewById(R.id.sure);
        cancel = (TextView) findViewById(R.id.cancel);
    }

    @Override
    public void initData() {

    }

    @Override
    public void setListeners() {
        setOnListeners(sure, cancel, rlExit);
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

package com.huiyouhui.view;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.huiyouhui.R;
import com.huiyouhui.lib.base.BaseView;

/**
 * Created by Administrator on 2016/10/13.
 */
public class GiveView extends BaseView {
    private RelativeLayout rlExit;
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    public TextView finish;
    private TextView keepon;
    public GiveView(Context context) {
        super(context);
    }

    @Override
    public int getContentView() {
        return R.layout.view_recharge;
    }

    @Override
    public void findViews() {
        rlExit = (RelativeLayout) findViewById(R.id.rl_exit);
        tv1 = (TextView) findViewById(R.id.tv_1);
        tv2 = (TextView) findViewById(R.id.tv_2);
        tv3 = (TextView) findViewById(R.id.tv_3);
        finish = (TextView) findViewById(R.id.finish);
        keepon = (TextView) findViewById(R.id.keepon);
    }

    @Override
    public void initData() {
        tv1.setText("赠送成功");
        tv2.setText("你赠送给'Helen'的200积分");
        tv3.setText("已送出,总消费0元");
        keepon.setText("继续赠送");

    }

    @Override
    public void setListeners() {
        setOnListeners(rlExit,keepon);
        setOnClick(new onClick() {
            @Override
            public void onClick(View v, int id) {
                switch (id){
                    //点击蒙板
                    case R.id.rl_exit:
                        view.setVisibility(GONE);
                        break;
                    //继续赠送
                    case R.id.keepon:
                        view.setVisibility(GONE);
                        break;

                }

            }
        });
    }
}

package com.huiyouhui.activity;

import android.graphics.Color;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.huiyouhui.R;
import com.huiyouhui.lib.base.BaseActivity;
import com.huiyouhui.lib.custemview.CircleImageView;
import com.huiyouhui.view.ExitPayView;

/**
 * Created by Administrator on 2016/10/21.
 */
public class PayDetailActivity extends BaseActivity {

    private CircleImageView iv1;
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;
    private TextView tv5;
    private TextView tv6;
    private TextView tv7;
    private TextView tv8;
    private TextView tv9;
    private TextView tv10;
    private TextView tv11;
    private TextView tv12;
    private TextView tv13;
    private TextView tv14;
    private TextView tv15;
    private TextView tv16;
    private TextView tv17;

    ExitPayView exitPayView;


    @Override
    public int getContentView() {
        return R.layout.activity_pay_detail;
    }

    @Override
    public void findViews() {
        setTitle("买单详情");
        getRightBtn().setText("退款");
        iv1 = (CircleImageView) findViewById(R.id.iv_1);
        iv1.setBorderWidth(0);
        iv1.setBorderColor(Color.parseColor("#00000000"));
        tv1 = (TextView) findViewById(R.id.tv_1);
        tv2 = (TextView) findViewById(R.id.tv_2);
        tv3 = (TextView) findViewById(R.id.tv_3);
        tv4 = (TextView) findViewById(R.id.tv_4);
        tv5 = (TextView) findViewById(R.id.tv_5);
        tv6 = (TextView) findViewById(R.id.tv_6);
        tv7 = (TextView) findViewById(R.id.tv_7);
        tv8 = (TextView) findViewById(R.id.tv_8);
        tv9 = (TextView) findViewById(R.id.tv_9);
        tv10 = (TextView) findViewById(R.id.tv_10);
        tv11 = (TextView) findViewById(R.id.tv_11);
        tv12 = (TextView) findViewById(R.id.tv_12);
        tv13 = (TextView) findViewById(R.id.tv_13);
        tv14 = (TextView) findViewById(R.id.tv_14);
        tv15 = (TextView) findViewById(R.id.tv_15);
        tv16 = (TextView) findViewById(R.id.tv_16);
        tv17 = (TextView) findViewById(R.id.tv_17);
    }

    @Override
    protected void onShowMessage(RelativeLayout relativeLayout) {
        super.onShowMessage(relativeLayout);
        exitPayView = new ExitPayView(PayDetailActivity.this);
        exitPayView.setVisibility(View.GONE);
        relativeLayout.addView(exitPayView);
    }

    @Override
    public void initData() {

    }

    @Override
    public void setListeners() {
        getRightBtn().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exitPayView.setVisibility(View.VISIBLE);
            }
        });
    }
}

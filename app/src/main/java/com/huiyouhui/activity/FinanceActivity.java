package com.huiyouhui.activity;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.huiyouhui.R;
import com.huiyouhui.lib.base.BaseActivity;

/**
 * Created by Administrator on 2016/10/20.
 */
public class FinanceActivity extends BaseActivity {


    private ImageView iv1;
    private TextView tv1;
    private ImageView iv2;
    private TextView tv2;
    private EditText edit1;
    private TextView tv3;
    private EditText edit2;
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
    private TextView tv18;
    private TextView tv19;
    private TextView tv20;
    private TextView tv21;

    RelativeLayout rl1;
    RelativeLayout rl2;

    @Override
    public int getContentView() {
        return R.layout.activity_finance;
    }

    @Override
    public void findViews() {
        setTitle("财务管理");

        iv1 = (ImageView) findViewById(R.id.iv_1);
        tv1 = (TextView) findViewById(R.id.tv_1);
        iv2 = (ImageView) findViewById(R.id.iv_2);
        tv2 = (TextView) findViewById(R.id.tv_2);
        edit1 = (EditText) findViewById(R.id.edit_1);
        tv3 = (TextView) findViewById(R.id.tv_3);
        edit2 = (EditText) findViewById(R.id.edit_2);
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
        tv18 = (TextView) findViewById(R.id.tv_18);
        tv19 = (TextView) findViewById(R.id.tv_19);
        tv20 = (TextView) findViewById(R.id.tv_20);
        tv21 = (TextView) findViewById(R.id.tv_21);
        rl1 = (RelativeLayout) findViewById(R.id.rl_1);
        rl2 = (RelativeLayout) findViewById(R.id.rl_2);

    }

    @Override
    public void initData() {

    }

    @Override
    public void setListeners() {
        setOnListeners(rl1, rl2);
        setOnClick(new onClick() {
            @Override
            public void onClick(View v, int id) {
                switch (id) {
                    //积分记录
                    case R.id.rl_1:
                        goToActivityByClass(FinanceActivity.this, IntegralActivity.class);
                        break;
                    //现金记录
                    case R.id.rl_2:
                        goToActivityByClass(FinanceActivity.this, CashActivity.class);
                        break;
                }
            }
        });
    }
}

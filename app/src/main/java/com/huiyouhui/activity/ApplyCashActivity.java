package com.huiyouhui.activity;

import android.graphics.Color;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.huiyouhui.R;
import com.huiyouhui.lib.base.BaseActivity;

/**
 * Created by Administrator on 2016/10/13.
 */
public class ApplyCashActivity extends BaseActivity {

    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;
    private TextView tv5;
    private TextView tv6;
    private TextView tv7;
    private TextView tv8;
    private EditText edit;
    private TextView tv12;


    @Override
    public int getContentView() {
        return R.layout.activity_apply_cash;
    }

    @Override
    public void findViews() {
        setTitle("申请提现");
        getRightBtn().setText("提现记录");
        getRightBtn().setTextColor(Color.WHITE);


        tv1 = (TextView) findViewById(R.id.tv_1);
        tv2 = (TextView) findViewById(R.id.tv_2);
        tv3 = (TextView) findViewById(R.id.tv_3);
        tv4 = (TextView) findViewById(R.id.tv_4);
        tv5 = (TextView) findViewById(R.id.tv_5);
        tv6 = (TextView) findViewById(R.id.tv_6);
        tv7 = (TextView) findViewById(R.id.tv_7);
        tv8 = (TextView) findViewById(R.id.tv_8);
        edit = (EditText) findViewById(R.id.edit);
        tv12 = (TextView) findViewById(R.id.tv_12);
    }

    @Override
    public void initData() {

    }

    @Override
    public void setListeners() {
        getRightBtn().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        setOnListeners(tv12);
        setOnClick(new onClick() {
            @Override
            public void onClick(View v, int id) {
                switch (id) {
                    //申请提现
                    case R.id.tv_12:
                        goToActivityByClass(ApplyCashActivity.this, ResultDetailActivity.class);
                        break;
                }
            }
        });
    }
}

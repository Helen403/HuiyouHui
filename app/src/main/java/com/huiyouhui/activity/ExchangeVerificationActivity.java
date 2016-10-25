package com.huiyouhui.activity;

import android.graphics.Color;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.huiyouhui.R;
import com.huiyouhui.lib.base.BaseActivity;

/**
 * Created by Administrator on 2016/10/14.
 */
public class ExchangeVerificationActivity extends BaseActivity {

    private EditText edit;
    private TextView tv12;


    @Override
    public int getContentView() {
        return R.layout.activity_exchange_verification;
    }

    @Override
    public void findViews() {
        setTitle("兑换验证");
        getRightBtn().setText("兑换记录");
        getRightBtn().setTextColor(Color.WHITE);


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
                goToActivityByClass( ExchangeRecordActivity.class);
            }
        });

        setOnListeners(tv12);
        setOnClick(new onClick() {
            @Override
            public void onClick(View v, int id) {
                switch (id) {
                    //查询
                    case R.id.tv_12:
                        goToActivityByClass( ExchangeDetailsActivity.class);
                        break;
                }
            }
        });

    }
}

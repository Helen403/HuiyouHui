package com.huiyouhui.activity;

import android.graphics.Color;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.huiyouhui.R;
import com.huiyouhui.lib.base.BaseActivity;

/**
 * Created by Administrator on 2016/10/20.
 */
public class SetCardActivity extends BaseActivity {

    private RelativeLayout rl1;
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;
    private TextView tv5;
    private TextView tv6;
    private TextView tv7;
    private EditText edit1;
    private TextView tv8;
    private EditText edit2;
    private TextView tv9;
    private EditText edit3;
    private TextView tv10;
    private EditText edit4;
    private TextView tv11;
    private EditText edit5;
    private TextView tv12;
    private EditText edit6;
    private TextView tv13;
    private EditText tv14;
    private TextView tv15;


    @Override
    public int getContentView() {
        return R.layout.activity_set_card;
    }

    @Override
    public void findViews() {
        setTitle("设置卡卷");
        status.setBackgroundColor(Color.parseColor("#FF9C00"));
        head_view.setBackgroundColor(Color.parseColor("#FF9C00"));

        rl1 = (RelativeLayout) findViewById(R.id.rl1);
        tv1 = (TextView) findViewById(R.id.tv_1);
        tv2 = (TextView) findViewById(R.id.tv_1);
        tv3 = (TextView) findViewById(R.id.tv_3);
        tv4 = (TextView) findViewById(R.id.tv_4);
        tv5 = (TextView) findViewById(R.id.tv_5);
        tv6 = (TextView) findViewById(R.id.tv_6);
        tv7 = (TextView) findViewById(R.id.tv_7);
        edit1 = (EditText) findViewById(R.id.edit_1);
        tv8 = (TextView) findViewById(R.id.tv_8);
        edit2 = (EditText) findViewById(R.id.edit_2);
        tv9 = (TextView) findViewById(R.id.tv_9);
        edit3 = (EditText) findViewById(R.id.edit_3);
        tv10 = (TextView) findViewById(R.id.tv_10);
        edit4 = (EditText) findViewById(R.id.edit_4);
        tv11 = (TextView) findViewById(R.id.tv_11);
        edit5 = (EditText) findViewById(R.id.edit_5);
        tv12 = (TextView) findViewById(R.id.tv_12);
        edit6 = (EditText) findViewById(R.id.edit_6);
        tv13 = (TextView) findViewById(R.id.tv_13);
        tv14 = (EditText) findViewById(R.id.tv_14);
        tv15 = (TextView) findViewById(R.id.tv_15);
    }

    @Override
    public void initData() {

    }

    @Override
    public void setListeners() {

    }
}

package com.huiyouhui.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.huiyouhui.R;
import com.huiyouhui.lib.base.BaseActivity;

/**
 * Created by Administrator on 2016/10/13.
 */
public class ResultDetailActivity extends BaseActivity {

    private TextView tv1;
    private LinearLayout ll1;
    private ImageView iv1;
    private View v1;
    private View v2;
    private ImageView iv2;
    private View v3;
    private View v4;
    private ImageView iv3;
    private LinearLayout ll2;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;
    private TextView tv5;
    private TextView tv6;
    private TextView tv7;
    private TextView tv12;


    @Override
    public int getContentView() {
        return R.layout.activity_result_detail;
    }

    @Override
    public void findViews() {
        tv1 = (TextView) findViewById(R.id.tv_1);
        ll1 = (LinearLayout) findViewById(R.id.ll1);
        iv1 = (ImageView) findViewById(R.id.iv_1);
        v1 = findViewById(R.id.v_1);
        v2 = findViewById(R.id.v_2);
        iv2 = (ImageView) findViewById(R.id.iv_2);
        v3 = findViewById(R.id.v_3);
        v4 = findViewById(R.id.v_4);
        iv3 = (ImageView) findViewById(R.id.iv_3);
        ll2 = (LinearLayout) findViewById(R.id.ll2);
        tv2 = (TextView) findViewById(R.id.tv_2);
        tv3 = (TextView) findViewById(R.id.tv_3);
        tv4 = (TextView) findViewById(R.id.tv_4);
        tv5 = (TextView) findViewById(R.id.tv_5);
        tv6 = (TextView) findViewById(R.id.tv_6);
        tv7 = (TextView) findViewById(R.id.tv_7);
        tv12 = (TextView) findViewById(R.id.tv_12);
    }

    @Override
    public void initData() {

    }

    @Override
    public void setListeners() {

    }
}

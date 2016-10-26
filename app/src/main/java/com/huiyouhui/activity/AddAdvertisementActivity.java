package com.huiyouhui.activity;

import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.huiyouhui.R;
import com.huiyouhui.lib.base.BaseActivity;

/**
 * Created by Administrator on 2016/10/26.
 */
public class AddAdvertisementActivity extends BaseActivity {

    private TextView tv1;
    private ImageView iv1;
    private TextView tv2;
    private TextView tv3;
    private EditText edit;
    private TextView tv4;
    private TextView tv5;
    private TextView tv6;
    private TextView tv7;
    private TextView tv8;
    private TextView tv9;
    private TextView tv10;
    private TextView tv12;




    @Override
    public int getContentView() {
        return R.layout.activity_add_advertisement;
    }



    @Override
    public void findViews() {
        setTitle("添加广告");
        tv1 = (TextView) findViewById(R.id.tv_1);
        iv1 = (ImageView) findViewById(R.id.iv_1);
        tv2 = (TextView) findViewById(R.id.tv_2);
        tv3 = (TextView) findViewById(R.id.tv_3);
        edit = (EditText) findViewById(R.id.edit);
        tv4 = (TextView) findViewById(R.id.tv_4);
        tv5 = (TextView) findViewById(R.id.tv_5);
        tv6 = (TextView) findViewById(R.id.tv_6);
        tv7 = (TextView) findViewById(R.id.tv_7);
        tv8 = (TextView) findViewById(R.id.tv_8);
        tv9 = (TextView) findViewById(R.id.tv_9);
        tv10 = (TextView) findViewById(R.id.tv_10);
        tv12 = (TextView) findViewById(R.id.tv_12);
    }

    @Override
    public void initData() {

    }

    @Override
    public void setListeners() {

    }
}

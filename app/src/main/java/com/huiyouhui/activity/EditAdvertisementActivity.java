package com.huiyouhui.activity;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.huiyouhui.R;
import com.huiyouhui.lib.base.BaseActivity;

/**
 * Created by Administrator on 2016/10/26.
 */
public class EditAdvertisementActivity extends BaseActivity {
    private TextView tv1;
    private ImageView iv1;
    private TextView tv2;
    private TextView tv3;
    private EditText edit;
    private TextView tv4;
    private TextView tv5;
    private TextView tv12;


    @Override
    public int getContentView() {
        return R.layout.activity_edit_advertisement;
    }

    @Override
    public void findViews() {
        setTitle("编辑广告");
        tv1 = (TextView) findViewById(R.id.tv_1);
        iv1 = (ImageView) findViewById(R.id.iv_1);
        tv2 = (TextView) findViewById(R.id.tv_2);
        tv3 = (TextView) findViewById(R.id.tv_3);
        edit = (EditText) findViewById(R.id.edit);
        tv4 = (TextView) findViewById(R.id.tv_4);
        tv5 = (TextView) findViewById(R.id.tv_5);
        tv12 = (TextView) findViewById(R.id.tv_12);
    }

    @Override
    public void initData() {

    }

    @Override
    public void setListeners() {
        setOnListeners(tv12);
        setOnClick(new onClick() {
            @Override
            public void onClick(View v, int id) {
                switch (id){
                    case R.id.tv_12:
                        finish();
                        break;
                }
            }
        });
    }
}

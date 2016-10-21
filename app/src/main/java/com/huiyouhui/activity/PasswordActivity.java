package com.huiyouhui.activity;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.huiyouhui.R;
import com.huiyouhui.lib.base.BaseActivity;

/**
 * Created by Administrator on 2016/10/14.
 */
public class PasswordActivity extends BaseActivity {

    private TextView tv1;
    private EditText edit1;
    private TextView tv2;
    private EditText edit2;
    private TextView tv3;
    private EditText edit3;
    private TextView tv12;


    @Override
    public int getContentView() {
        return R.layout.activity_password;
    }

    @Override
    public void findViews() {
        setTitle("修改密码");


        tv1 = (TextView) findViewById(R.id.tv_1);
        edit1 = (EditText) findViewById(R.id.edit_1);
        tv2 = (TextView) findViewById(R.id.tv_2);
        edit2 = (EditText) findViewById(R.id.edit_2);
        tv3 = (TextView) findViewById(R.id.tv_3);
        edit3 = (EditText) findViewById(R.id.edit_3);
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
                switch (id) {
                    //确定修改密码
                    case R.id.tv_12:
                        T("密码已修改");
                        break;
                }
            }
        });
    }
}

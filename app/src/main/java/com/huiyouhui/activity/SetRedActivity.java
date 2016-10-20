package com.huiyouhui.activity;

import android.view.View;
import android.widget.TextView;

import com.huiyouhui.R;
import com.huiyouhui.lib.base.BaseActivity;

/**
 * Created by Administrator on 2016/10/20.
 */
public class SetRedActivity extends BaseActivity {
    TextView tv_12;

    @Override
    public int getContentView() {
        return R.layout.activity_set_red;
    }

    @Override
    public void findViews() {
        setTitle("设置红包");
        tv_12 = (TextView) findViewById(R.id.tv_12);
    }

    @Override
    public void initData() {

    }

    @Override
    public void setListeners() {
        setOnListeners(tv_12);
        setOnClick(new onClick() {
            @Override
            public void onClick(View v, int id) {
                switch (id) {
                    case R.id.tv_12:
                    //显示红包
                        break;
                }
            }
        });
    }
}

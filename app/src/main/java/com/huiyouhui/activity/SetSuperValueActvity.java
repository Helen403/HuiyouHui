package com.huiyouhui.activity;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.huiyouhui.R;
import com.huiyouhui.lib.base.BaseActivity;

/**
 * Created by Administrator on 2016/10/20.
 */
public class SetSuperValueActvity extends BaseActivity {

    RelativeLayout rl_1;
    TextView tv_12;

    @Override
    public int getContentView() {
        return R.layout.activity_set_super_value;
    }

    @Override
    public void findViews() {
        setTitle("超值商品设置 ");
        rl_1 = (RelativeLayout) findViewById(R.id.rl_1);
        tv_12 = (TextView) findViewById(R.id.tv_12);
    }

    @Override
    public void initData() {

    }

    @Override
    public void setListeners() {
        setOnListeners(rl_1, tv_12);
        setOnClick(new onClick() {
            @Override
            public void onClick(View v, int id) {
                switch (id) {
                    case R.id.rl_1:
                        goToActivityByClass( ChoiceShopActivity.class);
                        break;
                    case R.id.tv_12:
                        finish();
                        break;
                }
            }
        });
    }
}

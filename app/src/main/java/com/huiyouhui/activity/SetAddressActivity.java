package com.huiyouhui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.huiyouhui.R;
import com.huiyouhui.constant.Constants;
import com.huiyouhui.lib.base.BaseActivity;

/**
 * Created by Administrator on 2016/10/24 0024.
 */
public class SetAddressActivity extends BaseActivity {

    private RelativeLayout rl_1;

    @Override
    public int getContentView() {
        return R.layout.activity_set_address;
    }

    @Override
    public void findViews() {
        rl_1 = (RelativeLayout) findViewById(R.id.rl_1);
    }

    @Override
    public void initData() {
        setTitle("店铺地址");
    }

    @Override
    public void setListeners() {
        setOnListeners(rl_1);
        setOnClick(new onClick() {
            @Override
            public void onClick(View v, int id) {
                if (v == rl_1) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("type", Constants.Song.select_province);
                    goToActivityByClass(SelectCityActivity.class, bundle);
                }
            }
        });
    }
}

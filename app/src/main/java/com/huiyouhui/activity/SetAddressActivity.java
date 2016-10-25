package com.huiyouhui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.huiyouhui.R;
import com.huiyouhui.constant.Constants;
import com.huiyouhui.lib.base.BaseActivity;

/**
 * Created by Administrator on 2016/10/24 0024.
 */
public class SetAddressActivity extends BaseActivity {
    private ImageView iv1;

    @Override
    public int getContentView() {
        return R.layout.activity_set_address;
    }

    @Override
    public void findViews() {
        iv1 = (ImageView) findViewById(R.id.iv_1);
    }

    @Override
    public void initData() {
        setTitle("店铺地址");
    }

    @Override
    public void setListeners() {
        setOnListeners(iv1);
        setOnClick(new onClick() {
            @Override
            public void onClick(View v, int id) {
                if (v == iv1) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("type", Constants.Song.select_province);
                    goToActivityByClass(SelectCityActivity.class, bundle);
                }
            }
        });
    }
}

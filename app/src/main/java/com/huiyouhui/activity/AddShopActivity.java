package com.huiyouhui.activity;

import android.view.View;
import android.widget.ImageButton;

import com.huiyouhui.R;
import com.huiyouhui.dialog.PhotoSelectDialog;
import com.huiyouhui.lib.base.BaseActivity;

/**
 * Created by Administrator on 2016/10/21 0021.
 */
public class AddShopActivity extends BaseActivity {
    private PhotoSelectDialog mDialog;
    private ImageButton ib1;

    @Override
    public int getContentView() {
        return R.layout.activity_add_shop;
    }

    @Override
    public void findViews() {
        ib1 = (ImageButton) findViewById(R.id.ib_1);
        mDialog = new PhotoSelectDialog(this);
    }

    @Override
    public void initData() {
        setTitle("添加商品");
    }

    @Override
    public void setListeners() {
        setOnListeners(ib1);
        setOnClick(new onClick() {
            @Override
            public void onClick(View v, int id) {
                if (v == ib1) {
                    mDialog.show();
                }
            }
        });
    }
}

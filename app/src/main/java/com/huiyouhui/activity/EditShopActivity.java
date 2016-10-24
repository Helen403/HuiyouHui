package com.huiyouhui.activity;

import android.view.View;
import android.widget.ImageView;

import com.huiyouhui.R;
import com.huiyouhui.dialog.PhotoSelectDialog;
import com.huiyouhui.lib.base.BaseActivity;

/**
 * Created by Administrator on 2016/10/21 0021.
 */
public class EditShopActivity extends BaseActivity {
    private ImageView iv1;
    private PhotoSelectDialog mDialog;

    @Override
    public int getContentView() {
        return R.layout.activity_edit_shop;
    }

    @Override
    public void findViews() {
        iv1 = (ImageView) findViewById(R.id.iv_content_1);
        mDialog = new PhotoSelectDialog(this);
    }

    @Override
    public void initData() {
        setTitle("编辑商品");
    }

    @Override
    public void setListeners() {
        setOnListeners(iv1);
        setOnClick(new onClick() {
            @Override
            public void onClick(View v, int id) {
                if (v == iv1) {
                    mDialog.show();
                }
            }
        });
    }
}

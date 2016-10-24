package com.huiyouhui.activity;

import android.view.View;
import android.widget.ImageButton;

import com.huiyouhui.R;
import com.huiyouhui.dialog.PhotoSelectDialog;
import com.huiyouhui.lib.base.BaseActivity;

/**
 * Created by Administrator on 2016/10/24 0024.
 */
public class SetPhotosActivity extends BaseActivity {
    private ImageButton ib1;
    private PhotoSelectDialog mDialog;

    @Override
    public int getContentView() {
        return R.layout.activity_set_photos;
    }

    @Override
    public void findViews() {
        mDialog = new PhotoSelectDialog(this);
        ib1 = (ImageButton) findViewById(R.id.ib_1);

    }

    @Override
    public void initData() {
        setTitle("店铺相册");
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDialog.show();
            }
        });

    }

    @Override
    public void setListeners() {

    }
}

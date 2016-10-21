package com.huiyouhui.activity;

import android.view.View;
import android.widget.TextView;

import com.huiyouhui.R;
import com.huiyouhui.dialog.PhotoSelectDialog;
import com.huiyouhui.lib.base.BaseActivity;

/**
 * Created by Administrator on 2016/10/21 0021.
 */
public class UpdateSignboardActivity extends BaseActivity {
    private TextView mTvChange;
    private TextView mTvCommit;
    private PhotoSelectDialog mDialog;

    @Override
    public int getContentView() {
        return R.layout.activity_update_signboard;
    }

    @Override
    public void findViews() {
        mDialog = new PhotoSelectDialog(this);
        mTvChange = (TextView) findViewById(R.id.tv_1);
        mTvCommit = (TextView) findViewById(R.id.tv_2);
    }

    @Override
    public void initData() {
        setTitle("上传店铺招牌");
    }

    @Override
    public void setListeners() {
        setOnListeners(mTvChange, mTvCommit);
        setOnClick(new onClick() {
            @Override
            public void onClick(View v, int id) {
                if (v == mTvChange) {
                    mDialog.show();
                } else if (v == mTvCommit) {

                }
            }
        });
    }
}

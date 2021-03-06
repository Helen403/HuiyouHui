package com.huiyouhui.activity;

import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.huiyouhui.R;
import com.huiyouhui.lib.base.BaseActivity;
import com.huiyouhui.lib.custemview.CircleImageView;

/**
 * Created by Administrator on 2016/10/20 0020.
 */
public class ShopSettingActivity extends BaseActivity {
    private TextView tv12;

    @Override
    public int getContentView() {
        return R.layout.activity_shop_seting;
    }

    @Override
    public void findViews() {
        mWipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipeRefreshLayout);
        mWipeRefreshLayout.setColorSchemeColors(getResources().getColor(R.color.bg_color));
        tv1 = (TextView) findViewById(R.id.tv_1);
        cv2 = (CircleImageView) findViewById(R.id.cv_2);
        iv2 = (ImageView) findViewById(R.id.iv_2);
        tv3 = (TextView) findViewById(R.id.tv_3);
        iv3 = (ImageView) findViewById(R.id.iv_3);
        tv4 = (TextView) findViewById(R.id.tv_4);
        iv4 = (ImageView) findViewById(R.id.iv_4);
        tv5 = (TextView) findViewById(R.id.tv_5);
        tv6 = (TextView) findViewById(R.id.tv_6);
        tv7 = (TextView) findViewById(R.id.tv_7);
        tv8 = (TextView) findViewById(R.id.tv_8);
        tv9 = (TextView) findViewById(R.id.tv_9);
        tv12 = (TextView) findViewById(R.id.tv_12);

        ll2 = (LinearLayout) findViewById(R.id.ll_2);
        ll3 = (LinearLayout) findViewById(R.id.ll_3);
        ll4 = (LinearLayout) findViewById(R.id.ll_4);
        mWipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        T("刷新成功");
                        mWipeRefreshLayout.setRefreshing(false);
                    }
                }, 1500);
            }
        });

        tv12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                T("保存成功");
                finish();
            }
        });
    }

    @Override
    public void initData() {
        setTitle("店铺设置");
    }

    @Override
    public void setListeners() {
        setOnListeners(ll2, ll3, ll4, tv7, tv8, tv9);
        setOnClick(new onClick() {
            @Override
            public void onClick(View v, int id) {
                switch (id) {
                    case R.id.ll_2:
                        goToActivityByClass(UpdateSignboardActivity.class);
                        break;
                    case R.id.ll_3:
                        goToActivityByClass(SetPhoneActivity.class);
                        break;
                    case R.id.ll_4:
                        goToActivityByClass(SetContactActivity.class);
                        break;
                    case R.id.tv_5:
                        break;
                    case R.id.tv_6:
                        break;
                    case R.id.tv_7:
                        goToActivityByClass(SetPhotosActivity.class);
                        break;
                    case R.id.tv_8:
                        goToActivityByClass(SetAddressActivity.class);
                        break;
                    case R.id.tv_9:
                        goToActivityByClass(SetLocationActivity.class);
                        break;
                }
            }
        });
    }


    private SwipeRefreshLayout mWipeRefreshLayout;
    private TextView tv1;
    private CircleImageView cv2;
    private ImageView iv2;
    private TextView tv3;
    private ImageView iv3;
    private TextView tv4;
    private ImageView iv4;
    private TextView tv5;
    private TextView tv6;
    private TextView tv7;
    private TextView tv8;
    private TextView tv9;
    private LinearLayout ll2, ll3, ll4;


}

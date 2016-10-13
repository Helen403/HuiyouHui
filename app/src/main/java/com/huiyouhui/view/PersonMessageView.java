package com.huiyouhui.view;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.huiyouhui.R;
import com.huiyouhui.activity.ApplyCashActivity;
import com.huiyouhui.activity.CashActivity;
import com.huiyouhui.activity.IntegralActivity;
import com.huiyouhui.activity.RechargeActivity;
import com.huiyouhui.activity.WithdrawalsAccountActivity;
import com.huiyouhui.lib.base.BaseView;
import com.huiyouhui.lib.custemview.CircleImageView;

/**
 * Created by Administrator on 2016/10/12.
 */
//个人信息
public class PersonMessageView extends BaseView {

    private CircleImageView icon;
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;
    private ImageView iv1;
    private ImageView iv2;
    private ImageView iv3;
    private TextView tv5;
    private ImageView iv4;
    public ImageView personIv5;
    private TextView tv6;
    private TextView exit;
    LinearLayout ll1;
    LinearLayout ll2;
    RelativeLayout rl1;
    RelativeLayout rl2;
    RelativeLayout rl3;


    public PersonMessageView(Context context) {
        super(context);
    }


    @Override
    public int getContentView() {
        return R.layout.view_person_message;
    }

    @Override
    public void findViews() {
        icon = (CircleImageView) findViewById(R.id.icon);
        tv1 = (TextView) findViewById(R.id.tv_1);
        tv2 = (TextView) findViewById(R.id.tv_2);
        tv3 = (TextView) findViewById(R.id.tv_3);
        tv4 = (TextView) findViewById(R.id.tv_4);
        iv1 = (ImageView) findViewById(R.id.iv_1);
        iv2 = (ImageView) findViewById(R.id.iv_2);
        iv3 = (ImageView) findViewById(R.id.iv_3);
        tv5 = (TextView) findViewById(R.id.tv_5);
        iv4 = (ImageView) findViewById(R.id.iv_4);
        tv6 = (TextView) findViewById(R.id.tv_6);
        exit = (TextView) findViewById(R.id.exit);
        ll1 = (LinearLayout) findViewById(R.id.ll1);
        ll2 = (LinearLayout) findViewById(R.id.ll2);
        personIv5 = (ImageView) findViewById(R.id.person_iv_5);
        rl1 = (RelativeLayout) findViewById(R.id.rl_1);
        rl2 = (RelativeLayout) findViewById(R.id.rl_2);
        rl3 = (RelativeLayout) findViewById(R.id.rl_3);
    }

    @Override
    public void initData() {

    }

    @Override
    public void setListeners() {
        setOnListeners(icon, ll1, ll2, rl1,rl2,rl3);
        setOnClick(new onClick() {
            @Override
            public void onClick(View v, int id) {
                switch (id) {
                    case R.id.icon:


                        break;


                    //积分记录
                    case R.id.ll1:
                        goToActivityByClass(getContext(), IntegralActivity.class);

                        break;

                    //现金记录
                    case R.id.ll2:
                        goToActivityByClass(getContext(), CashActivity.class);

                        break;
                    //积分充值
                    case R.id.rl_1:

                        goToActivityByClass(getContext(), RechargeActivity.class);
                        break;
                    //申请提现
                    case R.id.rl_2:
                        goToActivityByClass(getContext(), ApplyCashActivity.class);
                        break;
                    //提现帐号
                    case R.id.rl_3:
                        goToActivityByClass(getContext(), WithdrawalsAccountActivity.class);
                        break;
                }
            }
        });
    }


}

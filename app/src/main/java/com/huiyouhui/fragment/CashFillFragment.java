package com.huiyouhui.fragment;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.huiyouhui.R;
import com.huiyouhui.activity.RechargeActivity;
import com.huiyouhui.lib.base.BaseFragment;

/**
 * Created by Administrator on 2016/10/13.
 */
public class CashFillFragment extends BaseFragment {

    private TextView tv1;
    private TextView tv2;
    private EditText edittext;
    private TextView tv3;
    private TextView tv4;
    private TextView tv5;
    private ImageView iv1;
    private ImageView iv2;
    private ImageView iv3;
    private ImageView iv4;
    private TextView tv12;


    @Override
    public int getContentView() {
        return R.layout.fragment_cash_fill;
    }

    @Override
    public void findViews() {
        tv1 = (TextView) contentView.findViewById(R.id.tv_1);
        tv2 = (TextView) contentView.findViewById(R.id.tv_2);
        edittext = (EditText) contentView.findViewById(R.id.edittext);
        tv3 = (TextView) contentView.findViewById(R.id.tv_3);
        tv4 = (TextView) contentView.findViewById(R.id.tv_4);
        tv5 = (TextView) contentView.findViewById(R.id.tv_5);
        iv1 = (ImageView) contentView.findViewById(R.id.iv_1);
        iv2 = (ImageView) contentView.findViewById(R.id.iv_2);
        iv3 = (ImageView) contentView.findViewById(R.id.iv_3);
        iv4 = (ImageView) contentView.findViewById(R.id.iv_4);
        tv12 = (TextView) contentView.findViewById(R.id.tv_12);
    }

    @Override
    public void initData() {

    }

    @Override
    public void setListeners() {
        setOnListeners(tv12);
        setOnClick(new onClick() {
            @Override
            public void onClick(View v, int id) {
                switch (id) {
                    //确认充值  显示充值蒙板
                    case R.id.tv_12:
                        if (getActivity() instanceof RechargeActivity) {
                            final RechargeActivity rechargeActivity = (RechargeActivity) getActivity();
                            rechargeActivity.rechargeView.setVisibility(View.VISIBLE);
                            //点击完成退出当前Activity
                            rechargeActivity.rechargeView.findViewById(R.id.finish).setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    rechargeActivity.finish();
                                }
                            });
                        }
                        break;

                }
            }
        });
    }
}

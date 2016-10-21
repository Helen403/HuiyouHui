package com.huiyouhui.activity;

import android.graphics.Color;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.huiyouhui.R;
import com.huiyouhui.lib.base.BaseActivity;
import com.huiyouhui.view.GiveView;

/**
 * Created by Administrator on 2016/10/14.
 */
public class GiveIntegralActivity extends BaseActivity {
    private TextView tv1;
    private EditText edit1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;
    private EditText edit2;
    private TextView tv5;
    private TextView tv6;
    private TextView tv12;


    GiveView giveView;

    @Override
    public int getContentView() {
        return R.layout.activity_give_integral;
    }

    @Override
    public void findViews() {
        setTitle("赠送积分");
        getRightBtn().setText("赠送记录");
        getRightBtn().setTextColor(Color.WHITE);

        tv1 = (TextView) findViewById(R.id.tv_1);
        edit1 = (EditText) findViewById(R.id.edit_1);
        tv2 = (TextView) findViewById(R.id.tv_1);
        tv3 = (TextView) findViewById(R.id.tv_3);
        tv4 = (TextView) findViewById(R.id.tv_4);
        edit2 = (EditText) findViewById(R.id.edit_2);
        tv5 = (TextView) findViewById(R.id.tv_5);
        tv6 = (TextView) findViewById(R.id.tv_6);
        tv12 = (TextView) findViewById(R.id.tv_12);
    }


    @Override
    protected void onShowMessage(RelativeLayout relativeLayout) {
        super.onShowMessage(relativeLayout);
        giveView = new GiveView(this);
        giveView.setVisibility(View.GONE);
        relativeLayout.addView(giveView);


    }

    @Override
    public void initData() {

    }

    @Override
    public void setListeners() {
        getRightBtn().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToActivityByClass(GiveIntegralActivity.this, GiveIntegralRecordActivity.class);
            }
        });


        setOnListeners(tv12);
        setOnClick(new onClick() {
            @Override
            public void onClick(View v, int id) {
                switch (id) {
                    case R.id.tv_12:
                        giveView.setVisibility(View.VISIBLE);
                        //点击确认按钮
                        giveView.finish.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                finish();
                            }
                        });
                        break;
                }
            }
        });
    }
}

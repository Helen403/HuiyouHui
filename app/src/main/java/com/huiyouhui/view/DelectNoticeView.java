package com.huiyouhui.view;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.huiyouhui.R;
import com.huiyouhui.lib.base.BaseView;

/**
 * Created by Administrator on 2016/10/12.
 */
public class DelectNoticeView extends BaseView {

    RelativeLayout relativeLayout;
    TextView tv1;
    TextView tv;
    TextView tv2;

    public DelectNoticeView(Context context) {
        super(context);
    }


    @Override
    public int getContentView() {
        return R.layout.view_exit_app;
    }

    @Override
    public void findViews() {
        relativeLayout = (RelativeLayout) view.findViewById(R.id.rl_exit);
        tv1 = (TextView) view.findViewById(R.id.sure);
        tv = (TextView) view.findViewById(R.id.tv_1);
        tv2 = (TextView) view.findViewById(R.id.cancel);
    }


    @Override
    public void initData() {
        tv.setText("是否将该公告删除?");
    }

    @Override
    public void setListeners() {
        setOnListeners(relativeLayout, tv2, tv1);
        setOnClick(new onClick() {
            @Override
            public void onClick(View v, int id) {
                switch (id) {
                    case R.id.rl_exit:
                        view.setVisibility(GONE);
                        break;
                    case R.id.sure:
                        view.setVisibility(GONE);
                        break;
                    case R.id.cancel:
                        view.setVisibility(GONE);
                        break;
                }
            }
        });
    }
}

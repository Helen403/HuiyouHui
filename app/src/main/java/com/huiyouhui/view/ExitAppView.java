package com.huiyouhui.view;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;

import com.huiyouhui.R;
import com.huiyouhui.lib.base.BaseView;

/**
 * Created by Administrator on 2016/10/12.
 */
public class ExitAppView extends BaseView {

    RelativeLayout relativeLayout;
    public ExitAppView(Context context) {
        super(context);
    }



    @Override
    public int getContentView() {
        return R.layout.view_exit_app;
    }
    @Override
    public void findViews() {
        relativeLayout = (RelativeLayout) view.findViewById(R.id.rl_exit);
    }


    @Override
    public void initData() {

    }
    @Override
    public void setListeners() {
        setOnListeners(relativeLayout);
        setOnClick(new onClick() {
            @Override
            public void onClick(View v, int id) {
                switch (id){
                    case R.id.rl_exit:
                        view.setVisibility(GONE);
                        break;
                }
            }
        });
    }
}

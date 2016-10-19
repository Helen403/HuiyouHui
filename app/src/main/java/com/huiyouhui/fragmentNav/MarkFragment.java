package com.huiyouhui.fragmentNav;


import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.huiyouhui.R;
import com.huiyouhui.activity.RedActivity;
import com.huiyouhui.lib.base.BaseFragment;
import com.huiyouhui.lib.custemview.CircleImageView;

/**
 * Created by Administrator on 2016/8/22.
 */
public class MarkFragment extends BaseFragment {


    private CircleImageView icon;
    private RelativeLayout rl1;
    private ImageView iv1;
    private TextView tv1;
    private RelativeLayout rl2;
    private ImageView iv2;
    private TextView tv2;
    private RelativeLayout rl3;
    private ImageView iv3;
    private TextView tv3;


    @Override
    public int getContentView() {
        return R.layout.fragment_mark;
    }

    @Override
    public void findViews() {
        icon = (CircleImageView) contentView.findViewById(R.id.icon);
        rl1 = (RelativeLayout) contentView.findViewById(R.id.rl1);
        iv1 = (ImageView) contentView.findViewById(R.id.iv_1);
        tv1 = (TextView) contentView.findViewById(R.id.tv_1);
        rl2 = (RelativeLayout) contentView.findViewById(R.id.rl2);
        iv2 = (ImageView) contentView.findViewById(R.id.iv_2);
        tv2 = (TextView) contentView.findViewById(R.id.tv_2);
        rl3 = (RelativeLayout) contentView.findViewById(R.id.rl3);
        iv3 = (ImageView) contentView.findViewById(R.id.iv_3);
        tv3 = (TextView) contentView.findViewById(R.id.tv_3);
    }

    @Override
    public void initData() {
        //隐藏头部
        hideHeadView();
    }

    @Override
    public void setListeners() {

        setOnListeners(rl1, rl2, rl3);
        setOnClick(new onClick() {
            @Override
            public void onClick(View v, int id) {
                switch (id) {
                    //红包管理
                    case R.id.rl1:
                        goToActivityByClass(getActivity(), RedActivity.class);

                        break;
                    //卡卷管理
                    case R.id.rl2:

                        break;
                    //超值兑换
                    case R.id.rl3:

                        break;
                }
            }
        });


    }


    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        //隐藏头部
        hideHeadView();
        if (hidden) {

        } else {

        }
    }

}

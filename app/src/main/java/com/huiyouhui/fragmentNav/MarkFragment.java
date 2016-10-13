package com.huiyouhui.fragmentNav;


import com.huiyouhui.R;
import com.huiyouhui.lib.base.BaseFragment;

/**
 * Created by Administrator on 2016/8/22.
 */
public class MarkFragment extends BaseFragment {


    @Override
    public void dealLogicBeforeFindView() {

    }

    @Override
    public int getContentView() {
        return R.layout.fragment_mark;
    }

    @Override
    public void findViews() {

    }

    @Override
    public void initData() {
        //隐藏头部
        hideHeadView();
    }

    @Override
    public void setListeners() {

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

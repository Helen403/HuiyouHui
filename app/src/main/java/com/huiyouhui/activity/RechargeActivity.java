package com.huiyouhui.activity;

import android.graphics.Color;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.RelativeLayout;

import com.huiyouhui.R;
import com.huiyouhui.adapter.RechargeAdapter;
import com.huiyouhui.lib.PagerSlidingTabStrip.PagerSlidingTabStrip;
import com.huiyouhui.lib.PagerSlidingTabStrip.TabImageAdapter;
import com.huiyouhui.lib.base.BaseActivity;
import com.huiyouhui.view.RechargeView;

/**
 * Created by Administrator on 2016/10/13.
 */
public class RechargeActivity extends BaseActivity {

    private PagerSlidingTabStrip pagerSliding;
    private ViewPager viewpager;
    //充值完成的View
    public RechargeView rechargeView;
    TabImageAdapter mTabImageAdapter;

    @Override
    public int getContentView() {
        return R.layout.activity_recharge;
    }

    @Override
    public void findViews() {
        setTitle("积分充值");
        pagerSliding = (PagerSlidingTabStrip) findViewById(R.id.pager_sliding);
        viewpager = (ViewPager) findViewById(R.id.viewpager);
    }

    @Override
    public void initData() {
        //设置Viewpager
        setViewPager();
    }

    @Override
    protected void onShowMessage(RelativeLayout relativeLayout) {
        super.onShowMessage(relativeLayout);
        rechargeView = new RechargeView(this);
        rechargeView.setVisibility(View.GONE);
        relativeLayout.addView(rechargeView);
    }

    private void setViewPager() {
        // 初始化ViewPager并且添加适配器
        viewpager.setAdapter(new RechargeAdapter(getSupportFragmentManager()));
        //向ViewPager绑定PagerSlidingTabStrip
        pagerSliding.setViewPager(viewpager);
        pagerSliding.setShouldExpand(true);
        //滑动条颜色
        pagerSliding.setIndicatorColor(Color.parseColor("#DD5D54"));
        pagerSliding.setTextColor(Color.parseColor("#C5C5C5"));
        pagerSliding.setTextSize(40);
        pagerSliding.setFillViewport(true);
        pagerSliding.setIndicatorHeight(15);
        pagerSliding.setIndicatorColorResource(R.color.deep_green);

        mTabImageAdapter = new TabImageAdapter(this);
    }

    @Override
    public void setListeners() {

    }
}

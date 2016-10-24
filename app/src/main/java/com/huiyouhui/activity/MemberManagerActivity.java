package com.huiyouhui.activity;

import android.graphics.Color;
import android.support.v4.view.ViewPager;

import com.huiyouhui.R;
import com.huiyouhui.adapter.MemberManagerAdapter;
import com.huiyouhui.lib.PagerSlidingTabStrip.PagerSlidingTabStrip;
import com.huiyouhui.lib.PagerSlidingTabStrip.TabImageAdapter;
import com.huiyouhui.lib.base.BaseActivity;

/**
 * Created by Administrator on 2016/10/21.
 */
public class MemberManagerActivity extends BaseActivity {


    private PagerSlidingTabStrip pagerSliding;
    private ViewPager viewpager;
    //充值完成的View
    TabImageAdapter mTabImageAdapter;

    @Override
    public int getContentView() {
        return R.layout.activity_member_manager;
    }

    @Override
    public void findViews() {
        setTitle("会员管理");
        pagerSliding = (PagerSlidingTabStrip) findViewById(R.id.pager_sliding);
        viewpager = (ViewPager) findViewById(R.id.viewpager);
    }

    @Override
    public void initData() {
        //设置Viewpager
        setViewPager();
    }

    @Override
    public void setListeners() {

    }



    private void setViewPager() {
        // 初始化ViewPager并且添加适配器
        viewpager.setAdapter(new MemberManagerAdapter(getSupportFragmentManager()));
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
}

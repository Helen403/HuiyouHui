package com.huiyouhui.activity;

import android.graphics.Color;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.huiyouhui.R;
import com.huiyouhui.adapter.PayRecordAdapter;
import com.huiyouhui.lib.PagerSlidingTabStrip.PagerSlidingTabStrip;
import com.huiyouhui.lib.PagerSlidingTabStrip.TabImageAdapter;
import com.huiyouhui.lib.base.BaseActivity;

/**
 * Created by Administrator on 2016/10/21.
 */
public class PayRecordActivity extends BaseActivity {

    private PagerSlidingTabStrip pagerSliding;
    private ViewPager viewpager;
    //充值完成的View
    TabImageAdapter mTabImageAdapter;

    @Override
    public int getContentView() {
        return R.layout.activity_pay_record;
    }

    @Override
    public void findViews() {
        setTitle("买单记录");
        getRightBtn().setText("订单汇总");
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
        getRightBtn().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToActivityByClass( FinanceActivity.class);
            }
        });
    }


    private void setViewPager() {
        // 初始化ViewPager并且添加适配器
        viewpager.setAdapter(new PayRecordAdapter(getSupportFragmentManager()));
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

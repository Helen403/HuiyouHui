package com.huiyouhui.fragmentNav;


import android.os.Handler;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.huiyouhui.R;
import com.huiyouhui.activity.ExchangeVerificationActivity;
import com.huiyouhui.activity.GiveIntegralActivity;
import com.huiyouhui.adapter.JDViewAdapter;
import com.huiyouhui.adapter.ShopAdapter;
import com.huiyouhui.bean.AdverNotice;
import com.huiyouhui.bean.ShopBean;
import com.huiyouhui.lib.base.BaseFragment;
import com.huiyouhui.lib.custemview.CircleImageView;
import com.huiyouhui.lib.custemview.JDAdverView;
import com.huiyouhui.lib.custemview.MyGridView;
import com.huiyouhui.view.AdverView;
import com.huiyouhui.view.ExitAppView;
import com.huiyouhui.view.MashView;
import com.huiyouhui.view.PersonMessageView;

import java.util.ArrayList;


/**
 * Created by Administrator on 2016/8/22.
 */
public class ShopFragment extends BaseFragment {

    //头像
    CircleImageView icon;
    /****************************************/
    //下面的
    MyGridView myGridView;
    //下面gridview的图片和对应的文字
    int[] imgs = {R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher};
    String[] titles = {"店铺设置", "商品管理", "财务管理", "买单记录", "会员管理", "评价管理", "公告设置", "广告管理", "招聘管理"};

    /****************************************/
    //轮播
    JDAdverView tbView;
    AdverView adverView;
    LinearLayout ll;
    /****************************************/
    //个人信息View
    PersonMessageView personMessageView;
    TextView exit;
    //动画时间
    int AnimTime = 250;
    MashView mashView;
    Handler handler = new Handler();
    /****************************************/
    //退出AppView
    ExitAppView exitAppView;
    TextView sure, cancel;

    /****************************************/
    //头像下面四个按钮
    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;

    /****************************************/

    @Override
    public int getContentView() {
        return R.layout.fragment_shop;
    }

    @Override
    public void findViews() {
        icon = (CircleImageView) contentView.findViewById(R.id.icon);
        tbView = (JDAdverView) contentView.findViewById(R.id.jdadver);
        myGridView = (MyGridView) contentView.findViewById(R.id.mygridview);
        ll = (LinearLayout) contentView.findViewById(R.id.ll);
        tv1 = (TextView) contentView.findViewById(R.id.tv_1);
        tv2 = (TextView) contentView.findViewById(R.id.tv_2);
        tv3 = (TextView) contentView.findViewById(R.id.tv_3);
        tv4 = (TextView) contentView.findViewById(R.id.tv_4);
    }

    @Override
    public void initData() {
        //隐藏头部
        hideHeadView();
        //轮播字体上下
        adver();
        //下面gridview
        gridview();
    }

    private void gridview() {

        ShopAdapter shopAdapter = new ShopAdapter(getActivity());
        myGridView.setAdapter(shopAdapter);

        ArrayList<ShopBean> data = new ArrayList<>();
        int count = imgs.length;
        for (int i = 0; i < count; i++) {
            data.add(new ShopBean(imgs[i], titles[i]));
        }
        shopAdapter.setData(data);

    }

    private void adver() {
        ArrayList<AdverNotice> datas = new ArrayList<>();
        datas.add(new AdverNotice("瑞士维氏军刀 新品满200-50", "最新"));
        datas.add(new AdverNotice("家居家装焕新季，讲199减100！", "最火爆"));
        datas.add(new AdverNotice("带上相机去春游，尼康低至477", "HOT"));
        datas.add(new AdverNotice("价格惊呆！电信千兆光纤上市", "new"));
        final JDViewAdapter adapter = new JDViewAdapter(datas);
        tbView.setAdapter(adapter);
        //开启线程滚东
        tbView.start();
    }

    @Override
    protected void onShowMessage(RelativeLayout relativeLayout) {
        super.onShowMessage(relativeLayout);
        /****************************************/
        //点击轮播轮播View
        adverView = new AdverView(getActivity());
        adverView.setVisibility(View.GONE);
        activity.content.addView(adverView);
        /****************************************/
        //个人信息View
        personMessageView = new PersonMessageView(getActivity());
        mashView = new MashView(getActivity());
        mashView.setVisibility(View.GONE);
        activity.content.addView(mashView);
        personMessageView.setVisibility(View.GONE);
        activity.content.addView(personMessageView);
        exit = (TextView) personMessageView.findViewById(R.id.exit);


        /****************************************/
        //退出AppView
        exitAppView = new ExitAppView(getActivity());
        exitAppView.setVisibility(View.GONE);
        activity.content.addView(exitAppView);
        sure = (TextView) exitAppView.findViewById(R.id.sure);
        cancel = (TextView) exitAppView.findViewById(R.id.cancel);
        /****************************************/

    }

    @Override
    public void setListeners() {
        setOnListeners(ll, icon, exit, cancel, sure, personMessageView.personIv5, tv1, tv2, tv3, tv4);
        setOnClick(new onClick() {
            @Override
            public void onClick(View v, int id) {
                switch (id) {
                    //点击广告栏
                    case R.id.ll:
                        adverView.setVisibility(View.VISIBLE);
                        break;
                    //点击头像
                    case R.id.icon:
                        personMessageView.setVisibility(View.VISIBLE);
                        AnimationSet animationSetPersonOpen = new AnimationSet(true);
                        //参数1～2：x轴的开始位置
                        //参数3～4：y轴的开始位置
                        //参数5～6：x轴的结束位置
                        //参数7～8：x轴的结束位置
                        TranslateAnimation translateAnimationOpen =
                                new TranslateAnimation(
                                        Animation.RELATIVE_TO_SELF, -1f,
                                        Animation.RELATIVE_TO_SELF, 0f,
                                        Animation.RELATIVE_TO_SELF, 0f,
                                        Animation.RELATIVE_TO_SELF, 0f);
                        translateAnimationOpen.setDuration(AnimTime);
                        animationSetPersonOpen.addAnimation(translateAnimationOpen);

                        personMessageView.startAnimation(animationSetPersonOpen);
                        /**************************************/
                        mashView.setVisibility(View.VISIBLE);
                        AnimationSet animationSetMash = new AnimationSet(true);
                        AlphaAnimation AlphaOpen = new AlphaAnimation(0f, 1.f);
                        AlphaOpen.setDuration(AnimTime);
                        animationSetMash.addAnimation(AlphaOpen);
                        mashView.startAnimation(animationSetMash);

                        break;
                    case R.id.person_iv_5:
                        AnimationSet animationSetPersonClose = new AnimationSet(true);
                        //参数1～2：x轴的开始位置
                        //参数3～4：y轴的开始位置
                        //参数5～6：x轴的结束位置
                        //参数7～8：x轴的结束位置
                        TranslateAnimation translateAnimationClose =
                                new TranslateAnimation(
                                        Animation.RELATIVE_TO_SELF, 0f,
                                        Animation.RELATIVE_TO_SELF, -1f,
                                        Animation.RELATIVE_TO_SELF, 0f,
                                        Animation.RELATIVE_TO_SELF, 0f);
                        translateAnimationClose.setDuration(AnimTime);
                        animationSetPersonClose.addAnimation(translateAnimationClose);

                        personMessageView.startAnimation(animationSetPersonClose);
                        /**************************************/
                        AnimationSet animationSetMashClose = new AnimationSet(true);
                        AlphaAnimation Alpha = new AlphaAnimation(1.f, 0f);
                        Alpha.setDuration(AnimTime);
                        animationSetMashClose.addAnimation(Alpha);
                        mashView.startAnimation(animationSetMashClose);
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                personMessageView.setVisibility(View.GONE);
                                mashView.setVisibility(View.GONE);
                            }
                        }, AnimTime);
                        break;

                    //点击退出App
                    case R.id.exit:
                        exitAppView.setVisibility(View.VISIBLE);

                        break;
                    //点击取消退出App
                    case R.id.cancel:
                        exitAppView.setVisibility(View.GONE);
                        break;
                    //点击退出App
                    case R.id.sure:
                        activity.finish();
                        break;

                    //赠送积分
                    case R.id.tv_1:
                        goToActivityByClass(getActivity(), GiveIntegralActivity.class);
                        break;
                    //兑换验证
                    case R.id.tv_2:
                        goToActivityByClass(getActivity(), ExchangeVerificationActivity.class);
                        break;
                    //扫一扫
                    case R.id.tv_3:
                        goToActivityByClass(getActivity(), ExchangeVerificationActivity.class);
                        break;
                    //收款
                    case R.id.tv_4:
                        goToActivityByClass(getActivity(), ExchangeVerificationActivity.class);
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
            if (tbView != null)
                tbView.stop();

        } else {
            //当前可见
            if (tbView != null)
                tbView.start();

        }
    }


}

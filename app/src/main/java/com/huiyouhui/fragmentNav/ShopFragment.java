package com.huiyouhui.fragmentNav;


import android.os.Handler;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.huiyouhui.R;
import com.huiyouhui.activity.ExchangeVerificationActivity;
import com.huiyouhui.activity.GiveIntegralActivity;
import com.huiyouhui.activity.PreViewActivity;
import com.huiyouhui.adapter.JDViewAdapter;
import com.huiyouhui.bean.AdverNotice;
import com.huiyouhui.factroy.ProjectFactroy;
import com.huiyouhui.lib.base.BaseFragment;
import com.huiyouhui.lib.custemview.CircleImageView;
import com.huiyouhui.lib.custemview.JDAdverView;
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
    private ImageView iv1;
    //九个模块
    private RelativeLayout rl_1, rl_2, rl_3, rl_4, rl_5, rl_6, rl_7, rl_8, rl_9;

    /****************************************/

    @Override
    public int getContentView() {
        return R.layout.fragment_shop;
    }

    @Override
    public void findViews() {
        icon = (CircleImageView) contentView.findViewById(R.id.icon);
        tbView = (JDAdverView) contentView.findViewById(R.id.jdadver);
        ll = (LinearLayout) contentView.findViewById(R.id.ll);
        tv1 = (TextView) contentView.findViewById(R.id.tv_1);
        tv2 = (TextView) contentView.findViewById(R.id.tv_1);
        tv3 = (TextView) contentView.findViewById(R.id.tv_3);
        tv4 = (TextView) contentView.findViewById(R.id.tv_4);
        iv1 = (ImageView) contentView.findViewById(R.id.iv_1);

        rl_1 = (RelativeLayout) contentView.findViewById(R.id.rl1);
        rl_2 = (RelativeLayout) contentView.findViewById(R.id.rl2);
        rl_3 = (RelativeLayout) contentView.findViewById(R.id.rl3);
        rl_4 = (RelativeLayout) contentView.findViewById(R.id.rl4);
        rl_5 = (RelativeLayout) contentView.findViewById(R.id.rl5);
        rl_6 = (RelativeLayout) contentView.findViewById(R.id.rl6);
        rl_7 = (RelativeLayout) contentView.findViewById(R.id.rl7);
        rl_8 = (RelativeLayout) contentView.findViewById(R.id.rl8);
        rl_9 = (RelativeLayout) contentView.findViewById(R.id.rl9);

        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToActivityByClass(getActivity(), PreViewActivity.class);
            }
        });


    }

    @Override
    public void initData() {
        //隐藏头部
        hideHeadView();
        //轮播字体上下
        adver();


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
        setOnListeners(ll, icon, exit, cancel, sure, personMessageView.personIv5, tv1, tv2, tv3, tv4, rl_1, rl_2, rl_3, rl_4, rl_5, rl_6, rl_7, rl_8, rl_9);
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
                    //店铺设置
                    case R.id.rl1:
                        goToActivityByClass(getActivity(), ProjectFactroy.getClazzByModelName("店铺设置"));
                        break;
                    //商品管理
                    case R.id.rl2:
                        goToActivityByClass(getActivity(), ProjectFactroy.getClazzByModelName("商品管理"));
                        break;
                    //财务管理
                    case R.id.rl3:
                        goToActivityByClass(getActivity(), ProjectFactroy.getClazzByModelName("财务管理"));
                        break;
                    //买单记录
                    case R.id.rl4:
                        goToActivityByClass(getActivity(), ProjectFactroy.getClazzByModelName("买单记录"));
                        break;
                    //会员管理
                    case R.id.rl5:
                        goToActivityByClass(getActivity(), ProjectFactroy.getClazzByModelName("会员管理"));
                        break;
                    //评价管理
                    case R.id.rl6:
                        goToActivityByClass(getActivity(), ProjectFactroy.getClazzByModelName("评价管理"));
                        break;
                    //公告设置
                    case R.id.rl7:
                        goToActivityByClass(getActivity(), ProjectFactroy.getClazzByModelName("公告设置"));
                        break;
                    //广告管理
                    case R.id.rl8:
                        goToActivityByClass(getActivity(), ProjectFactroy.getClazzByModelName("广告管理"));
                        break;
                    //招聘管理
                    case R.id.rl9:
                        goToActivityByClass(getActivity(), ProjectFactroy.getClazzByModelName("招聘管理"));
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

package com.huiyouhui.dialog;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.huiyouhui.R;
import com.huiyouhui.lib.PagerSlidingTabStrip.PagerSlidingTabStrip;
import com.huiyouhui.lib.base.BaseActivity;
import com.huiyouhui.lib.base.LBaseAdapter;
import com.huiyouhui.lib.base.LPagerAdapter;
import com.huiyouhui.view.DepthPageTransformer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/10/21 0021.
 */
public class PhotoSelectDialog extends AlertDialog {

    private BaseActivity mContext;
    private List<String> mTabs;
    private List<GridView> mFragmens;
    private ArrayList<TestBean> mPhotos;

    public PhotoSelectDialog(Context context) {
        super(context, R.style.photo_dialog);
        mContext = (BaseActivity) context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window dialogWindow = getWindow();
        dialogWindow.setGravity(Gravity.BOTTOM);
        WindowManager.LayoutParams lp = dialogWindow.getAttributes();
        Display display = mContext.getWindowManager().getDefaultDisplay();
        lp.width = (int) (display.getWidth() * 1);
        lp.height = (int) (display.getHeight() * 0.8);
        setContentView(R.layout.dialog_select_photo);
        initView();
        initData();
    }

    private void initData() {
//        mFragmens = new ArrayList<Fragment>();
//        mFragmens.add(new PhotoFragment());
//        mFragmens.add(new PhotoFragment());
//        mFragmens.add(new PhotoFragment());
        mFragmens = new ArrayList<>();
        mFragmens.add(new GridView(mContext));
        mFragmens.add(new GridView(mContext));
        mFragmens.add(new GridView(mContext));
        mTabs = new ArrayList<String>();
        mTabs.add("最新");
        mTabs.add("照片");
        mTabs.add("图库");
        vpContent.setAdapter(new InnerPagerAdapter(mFragmens));
        pagerTab.setViewPager(vpContent);
        vpContent.setPageTransformer(true, new DepthPageTransformer());
        initPhoto();

    }

    private void initPhoto() {
        mPhotos = new ArrayList<>();
        for (int i = 0; i < 88; i++) {
            mPhotos.add(new TestBean());
        }
        for (GridView item : mFragmens) {
            item.setNumColumns(4);
            item.setAdapter(new InnerAdapter(mContext, R.layout.item_input_pic, mPhotos));
        }
    }

    private void initView() {
        pagerTab = (PagerSlidingTabStrip) findViewById(R.id.pager_tab);
        vpContent = (ViewPager) findViewById(R.id.vp_content);
        bt1 = (TextView) findViewById(R.id.bt_1);
        bt2 = (TextView) findViewById(R.id.bt_2);
        pagerTab.setIndicatorColor(Color.parseColor("#DD5D54"));
        pagerTab.setTextColor(Color.parseColor("#C5C5C5"));
        pagerTab.setTextSize(sp2px(mContext, 15));
        pagerTab.setIndicatorHeight(3);
        pagerTab.setIndicatorColorResource(R.color.deep_green);
    }

    private PagerSlidingTabStrip pagerTab;
    private ViewPager vpContent;
    private TextView bt1;
    private TextView bt2;


//    private class InnerPagerAdapter extends LFragmentPagerAdapter<Fragment> {
//        public InnerPagerAdapter(FragmentManager fm, List<Fragment> mViewList, List<String> mTitles) {
//            super(fm, mViewList, mTitles);
//        }
//    }

    private class InnerPagerAdapter extends LPagerAdapter<GridView> {
        public InnerPagerAdapter(List<GridView> mViewList) {
            super(mViewList);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mTabs.get(position);
        }
    }

    /**
     * 将sp值转换为px值，保证文字大小不变
     */
    public int sp2px(Context context, float spValue) {
        final float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (spValue * fontScale + 0.5f);
    }


    private class TestBean {
    }

    private class InnerAdapter extends LBaseAdapter<TestBean> {

        public InnerAdapter(Context context, int viewid, List<TestBean> objects) {
            super(context, viewid, objects);
        }

        @Override
        protected ViewHolder<TestBean> createHolder(View v) {
            InnerHorder horder = new InnerHorder();
            horder.cb1 = (CheckBox) v.findViewById(R.id.cb_1);
            horder.iv1 = (ImageView) findViewById(R.id.iv_1);
            return horder;
        }

        @Override
        protected void bindHolder(ViewHolder<TestBean> h) {
            final InnerHorder horder = (InnerHorder) h;
            horder.cb1.setChecked(false);
            if (horder.iv1 == null)
                return;
            horder.iv1.setOnClickListener(new OnClickListener<TestBean>(horder) {
                @Override
                public void onClick(View v, ViewHolder<TestBean> viewHolder) {
                    horder.cb1.setChecked(!horder.cb1.isChecked());
                }
            });
        }

        private class InnerHorder extends ViewHolder<TestBean> {
            private CheckBox cb1;
            private ImageView iv1;
        }
    }
}

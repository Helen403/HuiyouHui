package com.huiyouhui.activity;

import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.huiyouhui.R;
import com.huiyouhui.lib.base.BaseActivity;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/10/24 0024.
 */
public class EditJobActivity extends BaseActivity {
    private SwipeRefreshLayout mWipeRefreshLayout;
    private Spinner mSp1;
    private ArrayList<String> mSp1Datas;
    private ArrayList<String> mSp2Datas;
    private Spinner mSp2;

    @Override
    public int getContentView() {
        return R.layout.activity_add_job;
    }

    @Override
    public void findViews() {
        mWipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipeRefreshLayout);
        mWipeRefreshLayout.setColorSchemeColors(getResources().getColor(R.color.bg_color));
        mSp1 = (Spinner) findViewById(R.id.sp1);
        mSp2 = (Spinner) findViewById(R.id.sp2);
    }

    @Override
    public void initData() {
        setTitle("添加招聘");
        mSp1Datas = new ArrayList<String>();
        mSp2Datas = new ArrayList<String>();
        mSp1Datas.add("不限");
        mSp1Datas.add("1年以下");
        mSp1Datas.add("1-3年");
        mSp1Datas.add("3-5年");
        mSp1Datas.add("5年以上");
        mSp2Datas.add("不限");
        mSp2Datas.add("全职");
        mSp2Datas.add("兼职");
        mSp1.setAdapter(new ArrayAdapter<String>(this, R.layout.item_spinner_textview, mSp1Datas));
        mSp2.setAdapter(new ArrayAdapter<String>(this, R.layout.item_spinner_textview, mSp2Datas));
    }

    @Override
    public void setListeners() {
        mWipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        T("刷新成功");
                        mWipeRefreshLayout.setRefreshing(false);
                    }
                }, 1500);
            }
        });
    }
}

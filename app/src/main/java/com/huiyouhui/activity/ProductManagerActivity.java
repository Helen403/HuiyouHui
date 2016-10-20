package com.huiyouhui.activity;

import android.view.View;
import android.widget.TextView;

import com.huiyouhui.R;
import com.huiyouhui.adapter.ShopManagerAdapter;
import com.huiyouhui.bean.ManagerShopBean;
import com.huiyouhui.constant.Constants;
import com.huiyouhui.lib.MyRecycleView.MyLinearLayoutManager;
import com.huiyouhui.lib.base.BaseActivity;
import com.huiyouhui.lib.base.MyBaseRecycleAdapter;
import com.huiyouhui.lib.custemview.MyRecycleView;
import com.huiyouhui.view.SlidingTab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by Administrator on 2016/10/20 0020.
 */
public class ProductManagerActivity extends BaseActivity {
    private TextView tv1;
    private MyRecycleView mRecycleview;
    private ArrayList<ManagerShopBean> list;
    private String[] stateArr = {"已上架", "已下架", "审核中"};
    private String[] titleArr = {"全自动洗车", "汽车美容", "汽车保养"};
    private ShopManagerAdapter mAdapter;
    private SlidingTab mSlidingTab;
    private int mCurrentState;

    @Override
    public int getContentView() {
        return R.layout.activity_product_manager;
    }

    @Override
    public void findViews() {
        tv1 = (TextView) findViewById(R.id.tv_1);
        mRecycleview = (MyRecycleView) findViewById(R.id.recycleview);
        mSlidingTab = (SlidingTab) findViewById(R.id.slidingTab);
    }

    @Override
    public void initData() {
        setTitle("商品管理");
        getRightBtn().setText("添加商品");
        getRightBtn().setTextSize(13);
        initTestData();
        initRecycleview();
        initTabNames();
        tv1.setVisibility(View.GONE);
        mRecycleview.setVisibility(View.VISIBLE);


    }

    private void initTabNames() {
        ArrayList<String> list = new ArrayList<>();
        list.add("全部");
        list.add("已上架");
        list.add("已下架");
        list.add("待审核");
        mSlidingTab.setTabNames(list);
    }

    @Override
    public void onResume() {
        super.onResume();
        mRecycleview.setRefresh(true);
    }

    private void initRecycleview() {
        mRecycleview.setLayoutManager(new MyLinearLayoutManager(this));
        mAdapter = new ShopManagerAdapter(this, mRecycleview);
        mRecycleview.setAdapter(mAdapter);
        mAdapter.setOnRefresh(new MyBaseRecycleAdapter.OnRefresh() {
            @Override
            public void onRefresh() {
                if (mCurrentState == 0 || mCurrentState == 1 || mCurrentState == 2)
                    initTestData();
                Collections.shuffle(list);
                mAdapter.setRefresh(list);
                mRecycleview.smoothScrollToPosition(0);

            }


            @Override
            public void onAddData() {
                mAdapter.setAddData(list);
            }
        });
    }

    private void initTestData() {
        if (list == null)
            list = new ArrayList<>();
        ManagerShopBean bean;
        for (int i = 0; i < 20; i++) {
            bean = new ManagerShopBean();
            bean.currentState = stateArr[new Random().nextInt(3)];
            bean.exchangePrice = "" + 155 + i + " 积分";
            bean.finalPrice = "" + 22 + i + " 元";
            bean.shopTitle = titleArr[new Random().nextInt(3)];
            bean.sellNum = "" + i;
            list.add(bean);
            bean = null;
        }
    }

    @Override
    public void setListeners() {
        mSlidingTab.setOnTabStateChage(new SlidingTab.OnTabStateChage() {
            @Override
            public void onStateChage(int position) {
                mCurrentState = position;
                switch (position){
                    case Constants.Song.Order_State_up:
                        List<ManagerShopBean> arr = getSelectOrderUp();
                        list.clear();
                        list.addAll(arr);
                        mRecycleview.setRefresh(true);
                        break;
                    case Constants.Song.Order_State_down:
                        break;
                    case Constants.Song.Order_State_Loding:
                        break;
                    default:
                        mRecycleview.setRefresh(true);
                        break;
                }
            }
        });
        mSlidingTab.notifyDataSetChanged();
    }

    /**
     * 正在审核中的数据
     */
    private List<ManagerShopBean> getSelectOrderLoding() {
        final ArrayList<ManagerShopBean> list = new ArrayList<>();
        for (ManagerShopBean item : this.list) {
            if (item.getOrderstate() == Constants.Song.Order_State_Loding)
                list.add(item);
        }
        return list;
    }

    /**
     * 已下架的数据
     */
    private List<ManagerShopBean> getSelectOrderDown() {
        final ArrayList<ManagerShopBean> list = new ArrayList<>();
        for (ManagerShopBean item : this.list) {
            if (item.getOrderstate() == Constants.Song.Order_State_down)
                list.add(item);
        }
        return list;
    }

    /**
     * 上架中的数据
     */
    private List<ManagerShopBean> getSelectOrderUp() {
        final ArrayList<ManagerShopBean> list = new ArrayList<>();
        for (ManagerShopBean item : this.list) {
            if (item.getOrderstate() == Constants.Song.Order_State_up)
                list.add(item);
        }
        return list;
    }

}

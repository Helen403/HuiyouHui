package com.huiyouhui.activity;

import android.widget.TextView;

import com.huiyouhui.R;
import com.huiyouhui.adapter.IntegralAdapter;
import com.huiyouhui.bean.IntegralBean;
import com.huiyouhui.lib.MyRecycleView.MyLinearLayoutManager;
import com.huiyouhui.lib.base.BaseActivity;
import com.huiyouhui.lib.base.MyBaseRecycleAdapter;
import com.huiyouhui.lib.custemview.MyRecycleView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/10/13.
 */
public class CashActivity extends BaseActivity {
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private MyRecycleView myrecycleview;
    IntegralAdapter integralAdapter;


    @Override
    public int getContentView() {
        return R.layout.activity_cash;
    }

    @Override
    public void findViews() {
        setTitle("现金记录");

        tv1 = (TextView) findViewById(R.id.tv_1);
        tv2 = (TextView) findViewById(R.id.tv_1);
        tv3 = (TextView) findViewById(R.id.tv_3);
        myrecycleview = (MyRecycleView) findViewById(R.id.myrecycleview);
    }

    @Override
    public void initData() {

        MyRecycleView();


//        Param param = new Param();
//        param.put("pid",123);
//        ControlUtils.postsEveryTime("http://hyh2.281.com.cn/api.php/home/address/findtown", param, asdas.class, new ControlUtils.OnControlUtils<asdas>() {
//            @Override
//            public void onSuccess(String url, asdas asdas, ArrayList<asdas> list, String result, JSONObject jsonObject, JSONArray jsonArray) {
//
//            }
//
//            @Override
//            public void onFailure(String url) {
//
//            }
//        });

    }

    @Override
    public void setListeners() {



    }


    private void MyRecycleView() {
        // 使用重写后的线性布局管理器
        MyLinearLayoutManager manager = new MyLinearLayoutManager(this);
        myrecycleview.setLayoutManager(manager);

        integralAdapter = new IntegralAdapter(this, myrecycleview);
        myrecycleview.setAdapter(integralAdapter);
        // 刷新
        myrecycleview.setRefresh(true);

        integralAdapter.setOnRefresh(new MyBaseRecycleAdapter.OnRefresh() {
            @Override
            public void onRefresh() {
                ArrayList<IntegralBean> data = new ArrayList<IntegralBean>();
                for (int i = 0; i < 5; i++) {
                    data.add(new IntegralBean());
                }
                integralAdapter.setRefresh(data);
            }

            @Override
            public void onAddData() {
                ArrayList<IntegralBean> data = new ArrayList<IntegralBean>();
                for (int i = 0; i < 1; i++) {
                    data.add(new IntegralBean());
                }
                integralAdapter.setAddData(data);

            }
        });
    }



}

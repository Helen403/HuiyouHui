package com.huiyouhui.fragment;

import android.view.View;

import com.huiyouhui.R;
import com.huiyouhui.activity.PayDetailActivity;
import com.huiyouhui.adapter.PayRecordAllAdapter;
import com.huiyouhui.bean.PayRecordAllBean;
import com.huiyouhui.lib.MyRecycleView.MyLinearLayoutManager;
import com.huiyouhui.lib.base.BaseFragment;
import com.huiyouhui.lib.base.MyBaseRecycleAdapter;
import com.huiyouhui.lib.custemview.MyRecycleView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/10/21.
 */
public class PayRecordAllFragment extends BaseFragment {
    MyRecycleView myrecycleview;
    PayRecordAllAdapter payRecordAllAdapter;

    @Override
    public int getContentView() {
        return R.layout.fragment_pay_record_all;
    }

    @Override
    public void findViews() {
        myrecycleview = (MyRecycleView) contentView.findViewById(R.id.myrecycleview);
    }

    @Override
    public void initData() {

    }

    @Override
    public void setListeners() {

    }

    @Override
    protected void onAttachMyRecycleViewAdapter() {
        super.onAttachMyRecycleViewAdapter();

        // 使用重写后的线性布局管理器
        MyLinearLayoutManager manager = new MyLinearLayoutManager(getActivity());
        myrecycleview.setLayoutManager(manager);

        payRecordAllAdapter = new PayRecordAllAdapter(getActivity(), myrecycleview);
        myrecycleview.setAdapter(payRecordAllAdapter);
        // 刷新
        myrecycleview.setRefresh(true);

        payRecordAllAdapter.setOnRefresh(new MyBaseRecycleAdapter.OnRefresh() {
            @Override
            public void onRefresh() {
                ArrayList<PayRecordAllBean> data = new ArrayList<PayRecordAllBean>();
                for (int i = 0; i < 5; i++) {
                    data.add(new PayRecordAllBean());
                }
                payRecordAllAdapter.setRefresh(data);
            }

            @Override
            public void onAddData() {
                ArrayList<PayRecordAllBean> data = new ArrayList<PayRecordAllBean>();
                for (int i = 0; i < 1; i++) {
                    data.add(new PayRecordAllBean());
                }
                payRecordAllAdapter.setAddData(data);

            }
        });

        payRecordAllAdapter.setOnItemClickListener(new MyBaseRecycleAdapter.OnItemClickListener<PayRecordAllBean>() {
            @Override
            public void onItemClick(View view, int position, PayRecordAllBean payRecordAllBean) {
                goToActivityByClass(getActivity(), PayDetailActivity.class);

            }
        });

    }
}

package com.huiyouhui.fragment;

import com.huiyouhui.R;
import com.huiyouhui.adapter.RecommendMemberAdapter;
import com.huiyouhui.bean.RecommendMemberBean;
import com.huiyouhui.lib.MyRecycleView.MyLinearLayoutManager;
import com.huiyouhui.lib.base.BaseFragment;
import com.huiyouhui.lib.base.MyBaseRecycleAdapter;
import com.huiyouhui.lib.custemview.MyRecycleView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/10/21.
 */
public class RecommendMemberFragment extends BaseFragment {
    MyRecycleView myrecycleview;
    RecommendMemberAdapter recommendMemberAdapter;
    @Override
    public int getContentView() {
        return R.layout.fragment_recommend_member;
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

        recommendMemberAdapter = new RecommendMemberAdapter(getActivity(), myrecycleview);
        myrecycleview.setAdapter(recommendMemberAdapter);
        // 刷新
        myrecycleview.setRefresh(true);

        recommendMemberAdapter.setOnRefresh(new MyBaseRecycleAdapter.OnRefresh() {
            @Override
            public void onRefresh() {
                ArrayList<RecommendMemberBean> data = new ArrayList<RecommendMemberBean>();
                for (int i = 0; i < 5; i++) {
                    data.add(new RecommendMemberBean());
                }
                recommendMemberAdapter.setRefresh(data);
            }

            @Override
            public void onAddData() {
                ArrayList<RecommendMemberBean> data = new ArrayList<RecommendMemberBean>();
                for (int i = 0; i < 1; i++) {
                    data.add(new RecommendMemberBean());
                }
                recommendMemberAdapter.setAddData(data);
            }
        });
    }
}

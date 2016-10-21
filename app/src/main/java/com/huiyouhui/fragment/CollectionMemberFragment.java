package com.huiyouhui.fragment;

import com.huiyouhui.R;
import com.huiyouhui.adapter.CollectionMemberAdapter;
import com.huiyouhui.bean.CollectionMemberBean;
import com.huiyouhui.lib.MyRecycleView.MyLinearLayoutManager;
import com.huiyouhui.lib.base.BaseFragment;
import com.huiyouhui.lib.base.MyBaseRecycleAdapter;
import com.huiyouhui.lib.custemview.MyRecycleView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/10/21.
 */
public class CollectionMemberFragment extends BaseFragment {

    MyRecycleView myrecycleview;
    CollectionMemberAdapter collectionMemberAdapter;

    @Override
    public int getContentView() {
        return R.layout.fragment_collection_member;
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

        collectionMemberAdapter = new CollectionMemberAdapter(getActivity(), myrecycleview);
        myrecycleview.setAdapter(collectionMemberAdapter);
        // 刷新
        myrecycleview.setRefresh(true);

        collectionMemberAdapter.setOnRefresh(new MyBaseRecycleAdapter.OnRefresh() {
            @Override
            public void onRefresh() {
                ArrayList<CollectionMemberBean> data = new ArrayList<CollectionMemberBean>();
                for (int i = 0; i < 5; i++) {
                    data.add(new CollectionMemberBean());
                }
                collectionMemberAdapter.setRefresh(data);
            }

            @Override
            public void onAddData() {
                ArrayList<CollectionMemberBean> data = new ArrayList<CollectionMemberBean>();
                for (int i = 0; i < 1; i++) {
                    data.add(new CollectionMemberBean());
                }
                collectionMemberAdapter.setAddData(data);

            }
        });
    }
}

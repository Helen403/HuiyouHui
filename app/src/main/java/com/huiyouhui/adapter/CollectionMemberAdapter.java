package com.huiyouhui.adapter;

import android.content.Context;
import android.graphics.Color;

import com.huiyouhui.R;
import com.huiyouhui.bean.CollectionMemberBean;
import com.huiyouhui.lib.base.MyBaseRecycleAdapter;
import com.huiyouhui.lib.custemview.CircleImageView;
import com.huiyouhui.lib.custemview.MyRecycleView;

/**
 * Created by Administrator on 2016/10/21.
 */
public class CollectionMemberAdapter extends MyBaseRecycleAdapter<CollectionMemberBean> {
    public CollectionMemberAdapter(Context context, MyRecycleView mRecyclerView) {
        super(mRecyclerView);
    }

    @Override
    public int getContentView() {
        return R.layout.item_collection_member;
    }

    @Override
    public void onInitView(RecycleViewHolder holder, CollectionMemberBean collectionMemberBean, int position) {
        CircleImageView cir = holder.getViewById(R.id.iv_1);
        cir.setBorderColor(Color.parseColor("#00000000"));
        cir.setBorderWidth(0);
    }
}

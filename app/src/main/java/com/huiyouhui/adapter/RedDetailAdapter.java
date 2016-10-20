package com.huiyouhui.adapter;

import android.content.Context;
import android.graphics.Color;

import com.huiyouhui.R;
import com.huiyouhui.bean.RedDetailBean;
import com.huiyouhui.lib.base.MyBaseRecycleAdapter;
import com.huiyouhui.lib.custemview.CircleImageView;
import com.huiyouhui.lib.custemview.MyRecycleView;

/**
 * Created by Administrator on 2016/10/20.
 */
public class RedDetailAdapter extends MyBaseRecycleAdapter<RedDetailBean> {
    public RedDetailAdapter(Context context, MyRecycleView mRecyclerView) {
        super(context, mRecyclerView);
    }

    @Override
    public int getContentView() {
        return R.layout.item_red_detail;
    }

    @Override
    public void onInitView(RecycleViewHolder holder, RedDetailBean redDetailBean, int position) {
        CircleImageView cir = holder.getViewById(R.id.cir);
        cir.setBorderColor(Color.parseColor("#00000000"));
        cir.setBorderWidth(0);
    }
}

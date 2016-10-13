package com.huiyouhui.adapter;

import android.content.Context;

import com.huiyouhui.R;
import com.huiyouhui.bean.IntegralBean;
import com.huiyouhui.lib.base.MyBaseRecycleAdapter;
import com.huiyouhui.lib.custemview.MyRecycleView;

/**
 * Created by Administrator on 2016/10/13.
 */
public class IntegralAdapter extends MyBaseRecycleAdapter<IntegralBean> {

    public IntegralAdapter(Context context, MyRecycleView mRecyclerView) {
        super(context, mRecyclerView);
    }

    @Override
    public int getContentView() {
        return R.layout.item_integral;
    }

    @Override
    public void onInitView(RecycleViewHolder holder, IntegralBean integralBean, int position) {

    }
}

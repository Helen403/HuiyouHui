package com.huiyouhui.adapter;

import android.content.Context;

import com.huiyouhui.bean.SuperValueBean;
import com.huiyouhui.lib.base.MyBaseRecycleAdapter;
import com.huiyouhui.lib.custemview.MyRecycleView;

/**
 * Created by Administrator on 2016/10/20.
 */
public class SuperValueAdapter extends MyBaseRecycleAdapter<SuperValueBean> {
    public SuperValueAdapter(Context context, MyRecycleView mRecyclerView) {
        super(context, mRecyclerView);
    }

    @Override
    public int getContentView() {
        return 0;
    }

    @Override
    public void onInitView(RecycleViewHolder holder, SuperValueBean superValueBean, int position) {

    }
}

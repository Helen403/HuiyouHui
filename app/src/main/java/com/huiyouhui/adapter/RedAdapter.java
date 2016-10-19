package com.huiyouhui.adapter;

import android.content.Context;

import com.huiyouhui.bean.RedBean;
import com.huiyouhui.lib.base.MyBaseRecycleAdapter;
import com.huiyouhui.lib.custemview.MyRecycleView;

/**
 * Created by Administrator on 2016/10/19.
 */
public class RedAdapter extends MyBaseRecycleAdapter<RedBean> {
    public RedAdapter(Context context, MyRecycleView mRecyclerView) {
        super(context, mRecyclerView);
    }

    @Override
    public int getContentView() {
        return 0;
    }

    @Override
    public void onInitView(RecycleViewHolder holder, RedBean redBean, int position) {

    }
}

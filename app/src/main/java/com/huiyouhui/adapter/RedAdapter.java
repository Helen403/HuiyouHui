package com.huiyouhui.adapter;

import android.content.Context;

import com.huiyouhui.R;
import com.huiyouhui.bean.RedBean;
import com.huiyouhui.lib.base.MyBaseRecycleAdapter;
import com.huiyouhui.lib.custemview.MyRecycleView;

/**
 * Created by Administrator on 2016/10/19.
 */
public class RedAdapter extends MyBaseRecycleAdapter<RedBean> {
    public RedAdapter(Context context, MyRecycleView mRecyclerView) {
        super( mRecyclerView);
    }

    @Override
    public int getContentView() {
        return R.layout.item_red;
    }

    @Override
    public void onInitView(RecycleViewHolder holder, RedBean redBean, int position) {

    }
}

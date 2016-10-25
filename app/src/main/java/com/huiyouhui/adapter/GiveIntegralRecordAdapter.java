package com.huiyouhui.adapter;

import android.content.Context;

import com.huiyouhui.R;
import com.huiyouhui.bean.GiveIntegralRecordBean;
import com.huiyouhui.lib.base.MyBaseRecycleAdapter;
import com.huiyouhui.lib.custemview.MyRecycleView;

/**
 * Created by Administrator on 2016/10/13.
 */
public class GiveIntegralRecordAdapter extends MyBaseRecycleAdapter<GiveIntegralRecordBean> {

    public GiveIntegralRecordAdapter(Context context, MyRecycleView mRecyclerView) {
        super( mRecyclerView);
    }

    @Override
    public int getContentView() {
        return R.layout.item_give_integral_record;
    }

    @Override
    public void onInitView(RecycleViewHolder holder, GiveIntegralRecordBean giveIntegralRecordBean, int position) {

    }

}

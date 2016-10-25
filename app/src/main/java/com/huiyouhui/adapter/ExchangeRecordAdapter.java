package com.huiyouhui.adapter;

import android.content.Context;
import android.graphics.Color;

import com.huiyouhui.R;
import com.huiyouhui.bean.ExchangeRecordBean;
import com.huiyouhui.lib.base.MyBaseRecycleAdapter;
import com.huiyouhui.lib.custemview.CircleImageView;
import com.huiyouhui.lib.custemview.MyRecycleView;

/**
 * Created by Administrator on 2016/10/19.
 */
public class ExchangeRecordAdapter extends MyBaseRecycleAdapter<ExchangeRecordBean> {
    public ExchangeRecordAdapter(Context context, MyRecycleView mRecyclerView) {
        super( mRecyclerView);
    }

    @Override
    public int getContentView() {
        return R.layout.item_exchange_record;
    }

    @Override
    public void onInitView(RecycleViewHolder holder, ExchangeRecordBean exchangeRecordBean, int position) {
        CircleImageView cir = holder.getViewById(R.id.cir);
        cir.setBorderWidth(0);
        cir.setBorderColor(Color.parseColor("#00000000"));
    }
}

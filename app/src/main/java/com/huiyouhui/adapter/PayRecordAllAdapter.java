package com.huiyouhui.adapter;

import android.content.Context;
import android.graphics.Color;

import com.huiyouhui.R;
import com.huiyouhui.bean.PayRecordAllBean;
import com.huiyouhui.lib.base.MyBaseRecycleAdapter;
import com.huiyouhui.lib.custemview.CircleImageView;
import com.huiyouhui.lib.custemview.MyRecycleView;

/**
 * Created by Administrator on 2016/10/21.
 */
public class PayRecordAllAdapter extends MyBaseRecycleAdapter<PayRecordAllBean> {
    public PayRecordAllAdapter(Context context, MyRecycleView mRecyclerView) {
        super(context, mRecyclerView);
    }

    @Override
    public int getContentView() {
        return R.layout.item_pay_record_all;
    }

    @Override
    public void onInitView(RecycleViewHolder holder, PayRecordAllBean payRecordAllBean, int position) {
        CircleImageView cir = holder.getViewById(R.id.iv_1);
        cir.setBorderColor(Color.parseColor("#00000000"));
        cir.setBorderWidth(0);
    }
}

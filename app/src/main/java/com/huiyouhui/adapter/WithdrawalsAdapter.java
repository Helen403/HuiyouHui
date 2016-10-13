package com.huiyouhui.adapter;

import android.content.Context;

import com.huiyouhui.R;
import com.huiyouhui.bean.WithdrawalsBean;
import com.huiyouhui.lib.base.MyBaseRecycleAdapter;
import com.huiyouhui.lib.custemview.MyRecycleView;

/**
 * Created by Administrator on 2016/10/13.
 */
public class WithdrawalsAdapter extends MyBaseRecycleAdapter<WithdrawalsBean> {
    public WithdrawalsAdapter(Context context, MyRecycleView mRecyclerView) {
        super(context, mRecyclerView);
    }

    @Override
    public int getContentView() {
        return R.layout.item_withdrawals;
    }


    @Override
    public void onInitView(RecycleViewHolder holder, WithdrawalsBean withdrawalsBean, int position) {

    }
}

package com.huiyouhui.adapter;

import android.content.Context;

import com.huiyouhui.R;
import com.huiyouhui.bean.ChoiceShopBean;
import com.huiyouhui.lib.base.MyBaseRecycleAdapter;
import com.huiyouhui.lib.custemview.MyRecycleView;

/**
 * Created by Administrator on 2016/10/20.
 */
public class ChoiceShopAdapter extends MyBaseRecycleAdapter<ChoiceShopBean> {
    public ChoiceShopAdapter(Context context, MyRecycleView mRecyclerView) {
        super( mRecyclerView);
    }

    @Override
    public int getContentView() {
        return R.layout.item_choice_shop;
    }

    @Override
    public void onInitView(RecycleViewHolder holder, ChoiceShopBean choiceShopBean, int position) {

    }
}

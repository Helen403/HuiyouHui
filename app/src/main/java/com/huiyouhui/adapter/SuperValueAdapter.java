package com.huiyouhui.adapter;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.TextView;

import com.huiyouhui.R;
import com.huiyouhui.activity.SuperValueShopActivity;
import com.huiyouhui.bean.SuperValueBean;
import com.huiyouhui.lib.base.MyBaseRecycleAdapter;
import com.huiyouhui.lib.custemview.MyRecycleView;

/**
 * Created by Administrator on 2016/10/20.
 */
public class SuperValueAdapter extends MyBaseRecycleAdapter<SuperValueBean> {
    public SuperValueAdapter(Context context, MyRecycleView mRecyclerView) {
        super( mRecyclerView);
    }

    @Override
    public int getContentView() {
        return R.layout.item_super_value;
    }

    @Override
    public void onInitView(RecycleViewHolder holder, SuperValueBean superValueBean, int position) {
        TextView tv2 = holder.getViewById(R.id.tv_1);
        tv2.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG | Paint.ANTI_ALIAS_FLAG);//文件中间加下划线

        TextView tv3 = holder.getViewById(R.id.tv_3);
        tv3.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG | Paint.ANTI_ALIAS_FLAG);//文件中间加下划线


        TextView tv9 = holder.getViewById(R.id.tv_9);
        setOnListeners(tv9);
        setOnClick(new onClick() {
            @Override
            public void onClick(View v, int id) {
                switch (id) {
                    //点击撤销按钮
                    case R.id.tv_9:
                        SuperValueShopActivity activity = (SuperValueShopActivity) context;
                        activity.revokeShopView.setVisibility(View.VISIBLE);
                        break;
                }
            }
        });

    }
}

package com.huiyouhui.adapter;

import android.view.View;
import android.widget.TextView;

import com.huiyouhui.R;
import com.huiyouhui.activity.EditNoticeActivity;
import com.huiyouhui.bean.SetNoticeBean;
import com.huiyouhui.lib.base.MyLBaseRecycleAdapter;

/**
 * Created by Administrator on 2016/10/26.
 */
public class SetNoticeAdapter extends MyLBaseRecycleAdapter<SetNoticeBean> {
    @Override
    public int getContentView() {
        return R.layout.item_set_notice;
    }

    @Override
    public void onInitView(RecycleViewHolder holder, SetNoticeBean setNoticeBean, int position) {
        TextView tv = holder.getViewById(R.id.tv_3);
        setOnListeners(tv);
        setOnClick(new onClick() {
            @Override
            public void onClick(View v, int id) {
                switch (id) {
                    case R.id.tv_3:
                        goToActivityByClass(EditNoticeActivity.class);
                        break;
                }
            }
        });
    }
}

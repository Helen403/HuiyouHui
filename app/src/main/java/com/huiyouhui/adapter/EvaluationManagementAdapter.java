package com.huiyouhui.adapter;

import android.view.View;
import android.widget.TextView;

import com.huiyouhui.R;
import com.huiyouhui.activity.ReplyCommentActivity;
import com.huiyouhui.bean.EvaluationManagementBean;
import com.huiyouhui.lib.base.MyLBaseRecycleAdapter;

/**
 * Created by Administrator on 2016/10/25.
 */
public class EvaluationManagementAdapter extends MyLBaseRecycleAdapter<EvaluationManagementBean> {
    @Override
    public int getContentView() {
        return R.layout.item_evaluation_management;
    }

    @Override
    public void onInitView(RecycleViewHolder holder, EvaluationManagementBean evaluationManagementBean, int position) {
        TextView tv = holder.getViewById(R.id.tv_3);
        setOnListeners(tv);
        setOnClick(new onClick() {
            @Override
            public void onClick(View v, int id) {
                switch (id) {
                    case R.id.tv_3:
                        goToActivityByClass(ReplyCommentActivity.class);
                        break;
                }
            }
        });
    }
}

package com.huiyouhui.adapter;

import android.view.View;
import android.widget.TextView;

import com.huiyouhui.R;
import com.huiyouhui.bean.JobManBean;
import com.huiyouhui.lib.base.MyLBaseRecycleAdapter;

/**
 * Created by Administrator on 2016/10/26 0026.
 */
public class JobManAdapter extends MyLBaseRecycleAdapter<JobManBean> {
    private View mDialog;

    @Override
    public int getContentView() {
        mDialog = View.inflate(context, R.layout.view_delete_job, null);
        return R.layout.item_job_manage;
    }

    @Override
    public void onInitView(RecycleViewHolder holder, JobManBean jobManBean, int position) {
        final TextView tv1 = holder.getViewById(R.id.tv_1);
        setOnListeners(holder.getViewById(R.id.rl_1), holder.getViewById(R.id.rl_2), tv1, holder.getViewById(R.id.tv_2));
        setOnClick(new onClick() {
            @Override
            public void onClick(View v, int id) {
                switch (id) {
                    case R.id.rl_1:

                        break;
                    case R.id.rl_2:

                        break;
                    case R.id.tv_1:
                        tv1.setEnabled(!tv1.isEnabled());
                        break;
                    case R.id.tv_2:
                        tv1.setEnabled(!tv1.isEnabled());
                        break;

                }
            }
        });
    }
}

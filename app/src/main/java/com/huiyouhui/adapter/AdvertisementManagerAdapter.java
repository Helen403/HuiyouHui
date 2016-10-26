package com.huiyouhui.adapter;

import android.view.View;
import android.widget.TextView;

import com.huiyouhui.R;
import com.huiyouhui.activity.AdvertisementManagerActivity;
import com.huiyouhui.activity.EditAdvertisementActivity;
import com.huiyouhui.bean.AdvertisementManagerBean;
import com.huiyouhui.lib.base.MyLBaseRecycleAdapter;

/**
 * Created by Administrator on 2016/10/26.
 */
public class AdvertisementManagerAdapter extends MyLBaseRecycleAdapter<AdvertisementManagerBean> {
    @Override
    public int getContentView() {
        return R.layout.item_advertisement_manager;
    }

    @Override
    public void onInitView(RecycleViewHolder holder, AdvertisementManagerBean advertisementManagerBean, int position) {
        TextView tv = holder.getViewById(R.id.tv_3);
        TextView tvDel = holder.getViewById(R.id.tv_2);
        setOnListeners(tv, tvDel);
        setOnClick(new onClick() {
            @Override
            public void onClick(View v, int id) {
                switch (id) {
                    //编辑广告
                    case R.id.tv_3:
                        goToActivityByClass(EditAdvertisementActivity.class);
                        break;
                    //删除广告
                    case R.id.tv_2:
                        AdvertisementManagerActivity activity = (AdvertisementManagerActivity) context;
                        activity.delectAdvertisementView.setVisibility(View.VISIBLE);
                        break;
                }
            }
        });
    }
}

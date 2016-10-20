package com.huiyouhui.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.huiyouhui.R;
import com.huiyouhui.bean.ManagerShopBean;
import com.huiyouhui.constant.Constants;
import com.huiyouhui.lib.base.BaseApplication;
import com.huiyouhui.lib.base.MyBaseRecycleAdapter;
import com.huiyouhui.lib.custemview.MyRecycleView;

/**
 * Created by Administrator on 2016/10/20 0020.
 */
public class ShopManagerAdapter extends MyBaseRecycleAdapter<ManagerShopBean> {
    public ShopManagerAdapter(Context context, MyRecycleView mRecyclerView) {
        super(context, mRecyclerView);
    }

    @Override
    public int getContentView() {
        return R.layout.item_manager_shop;
    }

    @Override
    public void onInitView(RecycleViewHolder holder, ManagerShopBean managerShopBean, int position) {
        findViews(holder.getView());
        shopTitle.setText(managerShopBean.shopTitle);
        exchangePrice.setText("兑换价： " + managerShopBean.exchangePrice);
        finalPrice.setText("结算价： " + managerShopBean.finalPrice);
        currentState.setText(managerShopBean.currentState);
        sellNum.setText("已售： " + managerShopBean.sellNum);

        switch (managerShopBean.getOrderstate()) {
            case Constants.Song.Order_State_up:
                currentState.setTextColor(BaseApplication.context.getResources().getColor(R.color.Order_State_up));
                currentState.setShadowLayer(2, 3, 3, BaseApplication.context.getResources().getColor(R.color.Order_State_up));
                break;
            case Constants.Song.Order_State_down:
                currentState.setTextColor(BaseApplication.context.getResources().getColor(R.color.Order_State_down));
                currentState.setShadowLayer(2, 3, 3, BaseApplication.context.getResources().getColor(R.color.Order_State_down));
                break;
            case Constants.Song.Order_State_Loding:
                currentState.setTextColor(BaseApplication.context.getResources().getColor(R.color.Order_State_runling));
                currentState.setShadowLayer(2, 3, 3, BaseApplication.context.getResources().getColor(R.color.Order_State_runling));
                break;
        }
    }

    private View view;
    private ImageView imageUrl;
    private TextView shopTitle;
    private TextView exchangePrice;
    private TextView finalPrice;
    private TextView currentState;
    private TextView sellNum;

    private void findViews(View mRootView) {
        view = (View) mRootView.findViewById(R.id.view);
        imageUrl = (ImageView) mRootView.findViewById(R.id.imageUrl);
        shopTitle = (TextView) mRootView.findViewById(R.id.shopTitle);
        exchangePrice = (TextView) mRootView.findViewById(R.id.exchangePrice);
        finalPrice = (TextView) mRootView.findViewById(R.id.finalPrice);
        currentState = (TextView) mRootView.findViewById(R.id.currentState);
        sellNum = (TextView) mRootView.findViewById(R.id.sellNum);
    }

}

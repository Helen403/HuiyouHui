package com.huiyouhui.adapter;

import android.app.Dialog;
import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.huiyouhui.R;
import com.huiyouhui.activity.EditShopActivity;
import com.huiyouhui.bean.ManagerShopBean;
import com.huiyouhui.constant.Constants;
import com.huiyouhui.lib.base.BaseActivity;
import com.huiyouhui.lib.base.BaseApplication;
import com.huiyouhui.lib.base.MyBaseRecycleAdapter;
import com.huiyouhui.lib.custemview.MyRecycleView;

/**
 * Created by Administrator on 2016/10/20 0020.
 */
public class ShopManagerAdapter extends MyBaseRecycleAdapter<ManagerShopBean> {
    private TextView tv_click_1;
    private TextView tv_click_2;
    private TextView tv_click_3;
    private TextView tv_click_4;
    private BaseActivity mContext;
    private Dialog mDialog;
    private Toast mToast;

    public ShopManagerAdapter(Context context, MyRecycleView mRecyclerView) {
        super(context, mRecyclerView);
        mContext = (BaseActivity) context;
        View dialogView = mContext.getLayoutInflater().inflate(R.layout.view_delete, null);
        initDialog(dialogView);
        initToast();
    }

    private void initToast() {
        mToast = Toast.makeText(mContext, "", Toast.LENGTH_SHORT);
        mToast.setGravity(Gravity.CENTER, 0, 0);
        mToast.setText("删除成功");
    }

    private TextView tv1;
    private TextView finish;
    private TextView keepon;

    private void initDialog(final View dialogView) {
        tv1 = (TextView) dialogView.findViewById(R.id.tv_1);
        finish = (TextView) dialogView.findViewById(R.id.finish);
        keepon = (TextView) dialogView.findViewById(R.id.keepon);
        mDialog = new Dialog(mContext, R.style.alert_dialog);
        mDialog.setContentView(dialogView);
        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDialog.dismiss();
                mToast.show();
            }
        });
        keepon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDialog.dismiss();
            }
        });
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

        setOnListeners(tv_click_1, tv_click_2, tv_click_3, tv_click_4);
        setOnClick(new onClick() {
            @Override
            public void onClick(View v, int id) {
                switch (id) {
                    case R.id.tv_click_1:
                        mContext.goToActivityByClass(mContext, EditShopActivity.class);
                        break;
                    case R.id.tv_click_2:
                        break;
                    case R.id.tv_click_3:
                        break;
                    case R.id.tv_click_4:
                        mDialog.show();
                        break;
                }
            }
        });


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
        tv_click_1 = (TextView) mRootView.findViewById(R.id.tv_click_1);
        tv_click_2 = (TextView) mRootView.findViewById(R.id.tv_click_2);
        tv_click_3 = (TextView) mRootView.findViewById(R.id.tv_click_3);
        tv_click_4 = (TextView) mRootView.findViewById(R.id.tv_click_4);
    }

}

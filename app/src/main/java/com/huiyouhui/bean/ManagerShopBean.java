package com.huiyouhui.bean;

import com.huiyouhui.constant.Constants;

/**
 * Created by Administrator on 2016/10/20 0020.
 */
public class ManagerShopBean {
    public String imageUrl;
    public String shopTitle;
    public String exchangePrice;
    public String finalPrice;
    public String currentState;
    public String sellNum;

    public int getOrderstate() {
        switch (currentState) {
            case "已上架":
                return Constants.Song.Order_State_up;
            case "已下架":
                return Constants.Song.Order_State_down;
            case "待审核":
                return Constants.Song.Order_State_Loding;
            default:
                return Constants.Song.Order_State_Loding;
        }
    }
}

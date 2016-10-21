package com.huiyouhui.factroy;

import android.text.TextUtils;

import com.huiyouhui.activity.ProductManagerActivity;
import com.huiyouhui.activity.ShopSettingActivity;

/**
 * Created by Administrator on 2016/10/20 0020.
 */
public class ProjectFactroy {
    /**
     * 点击店铺管理后的处理逻辑，返回对应的activity
     *
     * @param modelName
     * @return
     */
    public static Class getClazzByModelName(String modelName) {
        if (TextUtils.isEmpty(modelName)) {
            throw new RuntimeException("model name not find !");
        }
        switch (modelName) {
            case "店铺设置":
                return ShopSettingActivity.class;
            case "商品管理":
                return ProductManagerActivity.class;
            case "财务管理":
                return ProductManagerActivity.class;
            case "买单记录":
                return ProductManagerActivity.class;
            case "会员管理":
                return ProductManagerActivity.class;
            case "公告设置":
                return ProductManagerActivity.class;
            case "评价管理":
                return ProductManagerActivity.class;
            case "广告管理":
                return ProductManagerActivity.class;
            case "招聘管理":
                return ProductManagerActivity.class;
            default:
                return null;
        }
    }
}

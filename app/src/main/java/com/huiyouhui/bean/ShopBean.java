package com.huiyouhui.bean;

/**
 * Created by Administrator on 2016/10/11.
 */
public class ShopBean {
    public int drawable;
    public String title;

    public ShopBean(int drawable, String title) {
        this.drawable = drawable;
        this.title = title;

    }

    @Override
    public String toString() {
        return "ShopBean{" +
                "drawable=" + drawable +
                ", title='" + title + '\'' +
                '}';
    }
}

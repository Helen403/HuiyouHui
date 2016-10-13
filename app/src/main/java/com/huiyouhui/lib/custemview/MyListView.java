package com.huiyouhui.lib.custemview;

import android.content.Context;
import android.widget.ListView;

/***
 * 解决只显示一行数据，scrollview 嵌套listview 或者 listview 嵌套 listview
 */
public final class MyListView extends ListView {

    public MyListView(Context context) {
        super(context);
    }

    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);
    }
}

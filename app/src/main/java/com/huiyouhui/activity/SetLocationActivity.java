package com.huiyouhui.activity;

import android.widget.ImageView;

import com.baidu.mapapi.map.MapView;
import com.huiyouhui.R;
import com.huiyouhui.lib.base.BaseActivity;

/**
 * Created by Administrator on 2016/10/24 0024.
 */
public class SetLocationActivity extends BaseActivity {
    private ImageView iv1;
    private MapView mMapView;


    @Override
    public int getContentView() {
        return R.layout.activity_set_location;
    }

    @Override
    public void findViews() {
        iv1 = (ImageView) findViewById(R.id.iv_1);
        //获取地图控件引用
        mMapView = (MapView) findViewById(R.id.mapView);
    }

    @Override
    public void initData() {
        setTitle("店铺坐标");
    }

    @Override
    public void setListeners() {

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        mMapView.onDestroy();
    }

    @Override
    public void onResume() {
        super.onResume();
        mMapView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mMapView.onPause();
    }
}

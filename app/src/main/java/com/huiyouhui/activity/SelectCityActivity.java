package com.huiyouhui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.huiyouhui.R;
import com.huiyouhui.constant.Constants;
import com.huiyouhui.lib.base.BaseActivity;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/10/24 0024.
 */
public class SelectCityActivity extends BaseActivity {
    private ListView mLvContent;
    private ArrayList<String> mDatas;
    private int mCurrentType = Constants.Song.select_province;

    @Override
    public int getContentView() {
        return R.layout.activity_select_city;
    }

    @Override
    public void findViews() {
        mLvContent = (ListView) findViewById(R.id.listview);
        mDatas = new ArrayList<String>();
    }


    @Override
    public void initData() {
        mCurrentType = getIntent().getExtras().getInt("type", Constants.Song.select_province);
        switch (mCurrentType) {
            case Constants.Song.select_province:
                setTitle("选择省份");
                requstProvince();
                break;
            case Constants.Song.select_citys:
                setTitle("选择城市");
                requstCitys();
                break;
            case Constants.Song.select_district:
                setTitle("选择地区");
                requstDistrict();
                break;
        }
    }

    /**
     * 请求地区信息
     */
    private void requstDistrict() {
        mDatas.add("东山区");
        mDatas.add("天河区");
        mDatas.add("白云区");
        mDatas.add("花都区");
        mLvContent.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mDatas));
    }

    /**
     * 请求城市信息
     */
    private void requstCitys() {
        mDatas.add("广州_1");
        mDatas.add("深圳_1");
        mDatas.add("佛山_1");
        mDatas.add("中山_1");
        mDatas.add("惠州_1");
        mDatas.add("广州_2");
        mDatas.add("深圳_2");
        mDatas.add("佛山_2");
        mDatas.add("中山_2");
        mDatas.add("惠州_2");
        mDatas.add("广州_3");
        mDatas.add("深圳_3");
        mDatas.add("佛山_3");
        mDatas.add("中山_3");
        mDatas.add("惠州_3");
        mLvContent.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mDatas));
    }

    /**
     * 请求省份信息
     */
    private void requstProvince() {
        mDatas.add("北京_1");
        mDatas.add("天津_1");
        mDatas.add("上海_1");
        mDatas.add("河北省_1");
        mDatas.add("山西省_1");
        mDatas.add("北京_2");
        mDatas.add("天津_2");
        mDatas.add("上海_2");
        mDatas.add("河北省_2");
        mDatas.add("山西省_2");
        mDatas.add("北京_3");
        mDatas.add("北京_3");
        mDatas.add("天津_3");
        mDatas.add("上海_3");
        mDatas.add("河北省_3");
        mDatas.add("山西省_3");
        mDatas.add("北京_4");
        mDatas.add("北京_4");
        mDatas.add("天津_4");
        mDatas.add("上海_4");
        mDatas.add("河北省_4");
        mDatas.add("山西省_4");
        mLvContent.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mDatas));
    }

    @Override
    public void setListeners() {
        final Bundle bundle = new Bundle();
        switch (mCurrentType) {
            case Constants.Song.select_province:
                bundle.putInt("type", Constants.Song.select_citys);
                break;
            case Constants.Song.select_citys:
                bundle.putInt("type", Constants.Song.select_district);
                break;
            case Constants.Song.select_district:

                break;
            default:
                break;
        }
        mLvContent.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (mCurrentType != Constants.Song.select_district) {
                    goToActivityByClass( SelectCityActivity.class, bundle);
                    finish();
                } else {
                    T("设置成功");
                    finish();
                }
            }
        });
    }
}

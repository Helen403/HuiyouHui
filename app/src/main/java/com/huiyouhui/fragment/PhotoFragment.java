package com.huiyouhui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.huiyouhui.R;
import com.huiyouhui.lib.base.LBaseAdapter;

import java.util.List;

/**
 * Created by Administrator on 2016/10/21 0021.
 */
public class PhotoFragment extends DialogFragment {


    private GridView mGridView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_photo,null);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        mGridView = (GridView) view.findViewById(R.id.gv_1);
        super.onViewCreated(view, savedInstanceState);
    }

    private class TestBean {
    }

    private class InnerAdapter extends LBaseAdapter<TestBean> {

        public InnerAdapter(Context context, int viewid, List<TestBean> objects) {
            super(context, viewid, objects);
        }

        @Override
        protected ViewHolder<TestBean> createHolder(View v) {
            return null;
        }

        @Override
        protected void bindHolder(ViewHolder<TestBean> h) {

        }
    }
}

package com.atguigu.yingyin.fragment;

import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.atguigu.yingyin.base.BaseFragment;

/**
 * Created by admin on 2017/1/16.
 */

public class RecyclerFragment extends BaseFragment {



    private TextView textView;
    @Override
    public View initView() {
        textView =new TextView(mContext);
        textView.setTextColor(Color.BLUE);
        textView.setGravity(Gravity.CENTER);
        textView.setTextSize(28);
        return textView;
    }
    @Override
    public void intitData() {
        super.intitData();
        textView.setText("RecyclerView刷新");
    }

    @Override
    public void onRefrshData() {
        super.onRefrshData();
        textView.setText("RecyclerView刷新");
    }
}

package com.atguigu.yingyin;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;

import com.atguigu.yingyin.base.BaseFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RadioGroup rg_main;

    private ArrayList<BaseFragment> fragments;

    //上下标位置页面的
    private Fragment tenpFragment;

    private int position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //默认选中本地视频

        rg_main = (RadioGroup) findViewById(R.id.rg_main);

        //设置RadioGroup的监听
      //  initListenter();
    }

    private void initListenter() {
        //设置RadioGroup选中状态变化的监听
        rg_main.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rb_local_video:
                        position = 0;
                        break;
                    case R.id.rb_local_audio:
                        position = 1;
                        break;
                    case R.id.rb_net_audio:
                        position = 2;
                        break;
                    case R.id.rb_net_video:
                        position = 3;
                        break;
                }

                //Fragment-当前的Fragment
  //                Fragment currentFragment = fragments.get(position);


    //            switchFragment(currentFragment);
            }
        });

        //默认选中本地视频
//        rg_main.check(R.id.rb_local_video);//onCheckedChanged
    }

    private void switchFragment(Fragment currentFragment) {

        if (currentFragment != tenpFragment) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            if (currentFragment != null) {

                if (!currentFragment.isAdded()) {
                    if (tenpFragment != null) {
                        ft.hide(tenpFragment);
                    }
                    ft.add(R.id.fl_mainc_content, currentFragment);
                } else {
                    if (tenpFragment != null) {
                        ft.hide(tenpFragment);
                    }
                    ft.show(currentFragment);
                }

            }
            ft.commit();
        }
        tenpFragment = currentFragment;

    }


}

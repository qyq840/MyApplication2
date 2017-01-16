package com.atguigu.yingyin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private RadioGroup rg_main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //默认选中本地视频

        rg_main.check(R.id.rb_local_video);
    }
}


package com.atguigu.yingyin.fragment;


import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.atguigu.yingyin.R;
import com.atguigu.yingyin.base.BaseFragment;
import com.atguigu.yingyin.bean.NetAudioBean;
import com.atguigu.yingyin.utils.Constant;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;


/**


 * 作用：网络视频

 */

public class NetAuaioFrament extends BaseFragment {

    private static final String TAG = NetAuaioFrament.class.getSimpleName();
    @Bind(R.id.listview)
    ListView listview;
    @Bind(R.id.progressbar)
    ProgressBar progressbar;
    @Bind(R.id.tv_nomedia)
    TextView tvNomedia;

    private NetAudioFragmentAdapter myAdapter;
    private List<NetAudioBean.ListBean> datas;
    @Override

    public View initView() {

        Log.e("TAG","网络视频ui初始化了。。");

        View view  = View.inflate(mContext, R.layout.fragment_net_video,null);

        //把view注入到xUtils3框中
        ButterKnife.bind(this,view);
        return view;

    }

     listview


    @Override
    public void intitData() {
        super.intitData();
        Log.e("TAG","网络视频数据初始化了。。");
        getDataFromNet();
    }

    /**

     * 使用xutils3联网请求数据

     */

    private void getDataFromNet() {

        //网络的路径

        RequestParams params  = new RequestParams(Constant.NET_URL);

        x.http().get(params, new Callback.CommonCallback<String>() {

            @Override

            public void onSuccess(String result) {



                Log.e("TA","xUtils3联网请求成功=="+result);

                Log.e("TAG","线程名称=="+Thread.currentThread().getName());

            }


            @Override

            public void onError(Throwable ex, boolean isOnCallback) {

                Log.e("TAG","xUtils3请求失败了=="+ex.getMessage());

            }

            @Override

            public void onCancelled(CancelledException cex) {


            }


            @Override

            public void onFinished() {

            }

        });



    }





}
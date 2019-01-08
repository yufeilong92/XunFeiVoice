package com.example.andy.testvoice;

import android.app.Application;

import com.example.andy.testvoice.basic.mVideo;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: testVoice
 * @Package com.example.andy.testvoice
 * @Description: todo
 * @author: L-BackPacker
 * @date: 2019.01.08 上午 9:43
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2019
 */
public class mApplication extends Application {

    private mVideo mVideoUtils;

    @Override
    public void onCreate() {
        super.onCreate();
        mVideoUtils = mVideo.get_Instance(this);
    }

    public mVideo getVideoInstance() {
        if (mVideoUtils == null) {
            return mVideo.get_Instance(this);
        }
        return mVideoUtils;
    }
}

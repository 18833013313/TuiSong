package bw.com.myapplication;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        JPushInterface.init(this);
        JPushInterface.setAlias(this,1,"bb");
    }
}

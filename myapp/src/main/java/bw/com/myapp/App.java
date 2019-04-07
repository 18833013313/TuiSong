package bw.com.myapp;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        JPushInterface.init(this);
        JPushInterface.setAlias(this,1,"cc");
    }
}

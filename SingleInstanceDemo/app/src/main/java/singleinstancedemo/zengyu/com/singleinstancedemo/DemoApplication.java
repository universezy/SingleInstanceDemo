package singleinstancedemo.zengyu.com.singleinstancedemo;

import android.app.Application;
import android.util.Log;

/**
 * Created by zengyu on 18-10-10.
 */
public class DemoApplication extends Application {
    private static final String TAG = "DemoApplication";

    @Override
    public void onCreate() {
        super.onCreate();

        Log.e(TAG, "process id = " + android.os.Process.myPid());
    }
}

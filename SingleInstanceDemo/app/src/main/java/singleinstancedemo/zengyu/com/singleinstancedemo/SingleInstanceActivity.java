package singleinstancedemo.zengyu.com.singleinstancedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SingleInstanceActivity extends AppCompatActivity {
    private static final String TAG = "SingleInstanceActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_instance);

        Log.e(TAG, "process id = " + android.os.Process.myPid() + ", task id = " + getTaskId());
    }
}

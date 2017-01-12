package sanocare.com.talk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

/**
 * @file_name AdaptationActivity.java
 * @description:  多设备适配介绍界面
 * @author zhongzhigang
 * created at 2017/1/9
 */

public class AdaptationActivity extends AppCompatActivity {

    private static final String TAG = "多设备适配介绍页面";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adaptation);
        Log.e(TAG, TAG + "----start onCreate~~~");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, TAG + "----start onStart~~~");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, TAG + "----start onRestart~~~");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, TAG + "----start onResume~~~");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, TAG + "----start onPause~~~");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, TAG + "----start onStop~~~");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, TAG + "----start onDestroy~~~");
    }
}

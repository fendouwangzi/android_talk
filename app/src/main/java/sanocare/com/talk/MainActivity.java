package sanocare.com.talk;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * @file_name MainActivity.java
 * @description:  主界面
 * @author zhongzhigang
 * created at 2017/1/9
 */

public class MainActivity extends BaseActivity implements View.OnClickListener{
    private static final String TAG = "主界面";
    private Button mBtn_layout;
    private Button mBtn_adaptation;
    private Button mBtn_custom_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
    }

    // End Of Content View Elements
    private void bindViews() {
        mBtn_layout = (Button) findViewById(R.id.btn_layout);
        mBtn_adaptation = (Button) findViewById(R.id.btn_adaptation);
        mBtn_custom_view = (Button) findViewById(R.id.btn_custom_view);
        mBtn_layout.setOnClickListener(this);
        mBtn_adaptation.setOnClickListener(this);
        mBtn_custom_view.setOnClickListener(this);
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

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_layout:
                startActivity(new Intent(MainActivity.this, SNLayoutActivity.class));
                break;
            case R.id.btn_adaptation:
                startActivity(new Intent(MainActivity.this, AdaptationActivity.class));
                break;
            case R.id.btn_custom_view:
            startActivity(new Intent(MainActivity.this, CustomViewActivity.class));
                break;
            default:
                break;
        }
    }
}

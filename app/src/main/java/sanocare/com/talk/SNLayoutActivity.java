package sanocare.com.talk;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * @file_name SNLayoutActivity.java
 * @description:  布局介绍页面
 * @author zhongzhigang
 * created at 2017/1/9
 */

public class SNLayoutActivity extends BaseActivity implements View.OnClickListener{

    private static final String TAG = "布局介绍页面";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snlayout);
        Button framelayoutBtn = (Button) findViewById(R.id.btn_framelayout);
        Button absolutelayoutBtn = (Button) findViewById(R.id.btn_absolutelayout);
        Button tablelayoutBtn = (Button) findViewById(R.id.btn_tablelayout);
        Button linearlayoutBtn = (Button) findViewById(R.id.btn_linearlayout);
        Button relativelayoutBtn = (Button) findViewById(R.id.btn_relativelayout);
        Button gridLayoutBtn = (Button) findViewById(R.id.btn_gridLayout);
        framelayoutBtn.setOnClickListener(this);
        absolutelayoutBtn.setOnClickListener(this);
        tablelayoutBtn.setOnClickListener(this);
        linearlayoutBtn.setOnClickListener(this);
        relativelayoutBtn.setOnClickListener(this);
        gridLayoutBtn.setOnClickListener(this);
        ((TextView)findViewById(R.id.right_btn)).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_framelayout:
                startActivity(new Intent(SNLayoutActivity.this, FrameLayoutActivity.class));
                break;
            case R.id.btn_absolutelayout:
                startActivity(new Intent(SNLayoutActivity.this, AbsoluteLayoutActivity.class));
                break;
            case R.id.btn_tablelayout:
                startActivity(new Intent(SNLayoutActivity.this, TableLayoutActivity.class));
                break;
            case R.id.btn_linearlayout:
                startActivity(new Intent(SNLayoutActivity.this, LinearLayoutActivity.class));
                break;
            case R.id.btn_relativelayout:
                startActivity(new Intent(SNLayoutActivity.this, RelativeLayoutActivity.class));
                break;
            case R.id.right_btn:
                startActivity(new Intent(SNLayoutActivity.this, NestingActivity.class));
            case R.id.btn_gridLayout:
                startActivity(new Intent(SNLayoutActivity.this, GridLayoutActivity.class));
            default:
                break;
        }
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

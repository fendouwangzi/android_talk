package sanocare.com.talk;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * @file_name BaseActivity.java
 * @description:  基础activity
 * @author zhongzhigang
 * created at 2017/1/9
 */

public class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
    }

}

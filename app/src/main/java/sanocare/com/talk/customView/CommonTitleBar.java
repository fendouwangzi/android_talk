package sanocare.com.talk.customView;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import sanocare.com.talk.R;

/**
 * Created by zhongzhigang on 16/10/31.
 */
public class CommonTitleBar extends RelativeLayout {
    private TextView mLeftBtn;
    private TextView mRightBtn;
    private TextView mTopTitleSmall;
    private TextView mTopTitle;
    private ImageView mLeftImg;
    private ImageView mRightImg;
    private String mLeftBtnText;
    private String mRightBtnText;
    private int mLeftImageRes;
    private int mRightImageRes;
    private String mTopTitleString;
    private String mTopTitleSmallString;

    public CommonTitleBar(Context context) {
        super(context);
        initView(null);
    }

    public CommonTitleBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(attrs);
    }

    public CommonTitleBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(attrs);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public CommonTitleBar(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initView(attrs);
    }

    private void initView(AttributeSet attrs) {
        LayoutInflater.from(getContext()).inflate(R.layout.common_title_bar, this, true);
        mLeftBtn = (TextView) findViewById(R.id.left_btn);
        mRightBtn = (TextView) findViewById(R.id.right_btn);
        mTopTitleSmall = (TextView) findViewById(R.id.top_title_small);
        mTopTitle = (TextView) findViewById(R.id.top_title);
        mLeftImg = (ImageView) findViewById(R.id.left_img);
        mRightImg = (ImageView) findViewById(R.id.right_img);
        TypedArray typedArray = getResources().obtainAttributes(attrs, R.styleable.CommonTitleBar);
        mLeftBtnText = typedArray.getString(R.styleable.CommonTitleBar_leftBtnText);
        mLeftBtn.setText(mLeftBtnText);
        mLeftBtn.setVisibility(TextUtils.isEmpty(mLeftBtnText) ? GONE : VISIBLE);

        mRightBtnText = typedArray.getString(R.styleable.CommonTitleBar_rightBtnText);
        mRightBtn.setText(mRightBtnText);
        mRightBtn.setVisibility(TextUtils.isEmpty( mRightBtnText) ? GONE : VISIBLE);

        mLeftImageRes = typedArray.getResourceId(R.styleable.CommonTitleBar_leftDrawable, 0);
        if (mLeftImageRes != 0) {
            mLeftImg.setImageResource(mLeftImageRes);
        }
        mLeftImg.setVisibility(mLeftImageRes == 0 ? GONE : VISIBLE);

        mRightImageRes = typedArray.getResourceId(R.styleable.CommonTitleBar_rightDrawable, 0);
        if (mRightImageRes != 0) {
            mRightImg.setImageResource(mRightImageRes);
        }
        mRightImg.setVisibility(mRightImageRes == 0 ? GONE : VISIBLE);

        mTopTitleString = typedArray.getString(R.styleable.CommonTitleBar_topTitle);
        mTopTitle.setText(mTopTitleString);
        mTopTitle.setVisibility(TextUtils.isEmpty(mTopTitleString) ? GONE : VISIBLE);

        mTopTitleSmallString = typedArray.getString(R.styleable.CommonTitleBar_topTitleSmall);
        mTopTitleSmall.setText(mTopTitleSmallString);
        mTopTitleSmall.setVisibility(TextUtils.isEmpty(mTopTitleSmallString) ? GONE : VISIBLE);

        /**设置为back图标时设置添加点击返回的事件*/
        if (mLeftImg.getVisibility() == VISIBLE && mLeftImageRes == R.mipmap.ic_back) {
            mLeftImg.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    ((Activity) getContext()).onBackPressed();
                }
            });
        }
    }

    public TextView getLeftBtn() {
        return mLeftBtn;
    }

    public TextView getRightBtn() {
        return mRightBtn;
    }

    public ImageView getLeftImg() {
        return mLeftImg;
    }

    public ImageView getRightImg() {
        return mRightImg;
    }

    public TextView getmTopTitle() {
        return mTopTitle;
    }

    public TextView getmTopTitleSmall() {
        return mTopTitleSmall;
    }

    public void setTopTitle(String mTopTitleString){
        mTopTitle.setText(mTopTitleString);
        mTopTitle.setVisibility(View.VISIBLE);
    }

    public void setTopTitleSmall(String mTopTitleSmallString){
        mTopTitleSmall.setText(mTopTitleSmallString);
        mTopTitleSmall.setVisibility(View.VISIBLE);
    }

}

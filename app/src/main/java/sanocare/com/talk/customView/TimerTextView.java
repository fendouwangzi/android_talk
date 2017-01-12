package sanocare.com.talk.customView;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class TimerTextView extends TextView implements Runnable {

	public TimerTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	private boolean run = false;
	private long time = 0L;

	public void setTimes(long time) {
		this.time = time;
	}

	public boolean isRun() {
		return run;
	}

	public void beginRun() {
		this.run = true;
		run();
	}

	public void stopRun() {
		this.setEnabled(true);
		this.run = false;
	}

	@Override
	public void run() {
		if (run) {
			--time;
			this.setText(time+"秒后重发");

			if (time <= 0) {
				this.setEnabled(true);
				setText("获取验证码");
				stopRun();
			} else {
				 postDelayed(this, 1000);
			}
		} else {
			removeCallbacks(this);
		}
	}

}

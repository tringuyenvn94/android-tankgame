package NIIT.Android3.TankGame;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class SplashScreenActivity extends Activity implements Runnable{
	
	private ImageView backgroudImage;
	SoundPool slpashSoundPool;
	int slpashSoundPoolId;
	boolean active = true;
	int slpashTime = 300;
	Thread slpashThread;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.splashscreen);
		
		backgroudImage = (ImageView)findViewById(R.id.splash_Img);
		backgroudImage.setBackgroundResource(R.drawable.splash);
		
		slpashSoundPool = new SoundPool(10, AudioManager.STREAM_MUSIC, 10);
		slpashSoundPoolId = slpashSoundPool.load(getBaseContext(), R.raw.splash,1);
		
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		active = true;
		slpashTime = 300;
		super.onResume();
	}
	
	@Override
	public void onWindowFocusChanged(boolean hasFocus) {
		// TODO Auto-generated method stub
		if(slpashThread == null){
			slpashThread = new Thread(this);
			slpashThread.start();
		}
		super.onWindowFocusChanged(hasFocus);
	}
	
	public void run() {
		// TODO Auto-generated method stub
		try{
			while(active && slpashTime > 0){
				slpashTime = slpashTime -10;
				slpashThread.sleep(300);
				slpashSoundPool.play(slpashSoundPoolId, 0f, 1.0f, 1, 0, 0.3f);
			}
		}catch (Exception e) {
			// TODO: handle exception
		}finally{
			// bat ra 1 giao dien chuong trinh chinh;
			startActivity(new Intent(getBaseContext(), MenuActivity.class));
			
			// su dung phuong thuc de destroy activity hien tai
			finish();
		}
	}
	
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		if(event.getAction() == MotionEvent.ACTION_DOWN){
			active = false;
		}
		return super.onTouchEvent(event);
	}
}

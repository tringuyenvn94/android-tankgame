package NIIT.Android3.TankGame.Interface;

import org.apache.http.client.entity.UrlEncodedFormEntity;

import NIIT.Android3.TankGame.R;
import NIIT.Android3.TankGame.R.id;
import NIIT.Android3.TankGame.R.layout;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MenuActivity extends Activity {

	private ImageView imageMenuNewGame;
	private ImageView imageMenuHighScore;
	private ImageView imageMenuOptions;
	private ImageView imageMenuAboutUs;
	private ImageView imageMenuHelp;
	private ImageView imageMenuExit;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.menu);

		imageMenuNewGame = (ImageView) findViewById(R.id.menu_newgame);
		imageMenuHighScore = (ImageView) findViewById(R.id.menu_highscore);
		imageMenuHighScore.setOnTouchListener(new OnTouchListener() {

			public boolean onTouch(View v, MotionEvent event) {

				setContentView(R.layout.highscore);
				return false;
			}
		});

		imageMenuOptions = (ImageView) findViewById(R.id.menu_options);
		imageMenuAboutUs = (ImageView) findViewById(R.id.menu_aboutus);
		imageMenuHelp = (ImageView) findViewById(R.id.menu_help);
		imageMenuExit = (ImageView) findViewById(R.id.menu_exit);

	}
}
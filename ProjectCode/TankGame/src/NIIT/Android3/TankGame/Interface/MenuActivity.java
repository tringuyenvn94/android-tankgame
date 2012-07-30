package NIIT.Android3.TankGame.Interface;

import java.util.Set;

import org.apache.http.client.entity.UrlEncodedFormEntity;

import NIIT.Android3.TankGame.R;
import NIIT.Android3.TankGame.R.id;
import NIIT.Android3.TankGame.R.layout;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
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
		imageMenuAboutUs.setOnTouchListener(new OnTouchListener() {

			public boolean onTouch(View v, MotionEvent event) {
				setContentView(R.layout.about);
				return false;
			}
		});
		imageMenuHelp = (ImageView) findViewById(R.id.menu_help);
		imageMenuHelp.setOnTouchListener(new OnTouchListener() {

			public boolean onTouch(View v, MotionEvent event) {
				setContentView(R.layout.help);
				return false;
			}
		});
		imageMenuExit = (ImageView) findViewById(R.id.menu_exit);
		imageMenuExit.setOnTouchListener(new OnTouchListener() {

			public boolean onTouch(View v, MotionEvent event) {
				switch (v.getId()) {
				case R.id.menu_exit:
					menu_exit();

					break;

				default:
					break;
				}
				return false;
			}

			private void menu_exit() {
				AlertDialog.Builder alertDialog = new AlertDialog.Builder(
						(MenuActivity.this));

				alertDialog.setMessage("Are you sure you want to exit?");

				alertDialog.setPositiveButton("OK",
						new DialogInterface.OnClickListener() {

							public void onClick(DialogInterface arg0, int arg1) {
								MenuActivity.this.finish();

							}
						});
				alertDialog.setNegativeButton("No",
						new DialogInterface.OnClickListener() {

							public void onClick(DialogInterface dialog,
									int which) {
								dialog.cancel();

							}
						});

				alertDialog.show();

			}
		});

	}
}
package NIIT.Android3.TankGame;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

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
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        
        setContentView(R.layout.menu);
        
        imageMenuNewGame = (ImageView)findViewById(R.id.menu_newgame);
        imageMenuHighScore = (ImageView)findViewById(R.id.menu_highscore);
        imageMenuOptions = (ImageView)findViewById(R.id.menu_options);
        imageMenuAboutUs = (ImageView)findViewById(R.id.menu_aboutus);
        imageMenuHelp = (ImageView)findViewById(R.id.menu_help);
        imageMenuExit = (ImageView)findViewById(R.id.menu_exit);
        
    }
}
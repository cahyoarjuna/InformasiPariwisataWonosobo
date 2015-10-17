package com.infopariwisata;

import com.infopariwisata.R;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Window;

public class Splash extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

	requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.splash_layout);
		Thread timer =new Thread(){
			public void run(){
				try{
					sleep(3000);
				}catch (InterruptedException e){
					e.printStackTrace();
			}finally{
				//activity yang akan dijalankan setelah splashscreen selesai
						Intent i = new Intent(Splash.this,MenuUtamaActivity.class);
				startActivity(i);
			    Splash.this.finish();
			}
		}
	};
	timer.start();
}
}

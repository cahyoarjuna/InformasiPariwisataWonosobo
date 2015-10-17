package com.infopariwisata;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class MenuUtamaActivity extends Activity {
	Button btn_tentang, btn_wisata, btn_budaya, btn_kuliner, btn_hotel,
			btn_peta;
	EditText text;
	Intent i1, i2, i3, i4, i5, i6;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.menu_utama);
		i1 = new Intent(this, Tentang.class);
		i2 = new Intent(this, ListTempatWisata.class);
		i3 = new Intent(this, Hotel.class);
		i4 = new Intent(this, Peta.class);
		i5 = new Intent(this, ListBudaya.class);
		i6 = new Intent(this, ListKuliner.class);

		btn_tentang = (Button) this.findViewById(R.id.btn_tentang);

		btn_wisata = (Button) this.findViewById(R.id.btn_wisata);

		btn_hotel = (Button) this.findViewById(R.id.btn_hotel);

		btn_peta = (Button) this.findViewById(R.id.btn_peta);
		
		btn_budaya = (Button) this.findViewById(R.id.btn_budaya);

		btn_kuliner = (Button) this.findViewById(R.id.btn_kuliner);

		/**
		 * Handling all button click events
		 * */

		// Listening to Tentang button click
		btn_tentang.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				startActivity(i1);
			}
		});

		btn_wisata.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				startActivity(i2);
			}
		});

		btn_hotel.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				startActivity(i3);
			}
		});

		btn_peta.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				startActivity(i4);
			}
		});
		
		btn_budaya.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				startActivity(i5);
			}
		});

		btn_kuliner.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				startActivity(i6);
			}
		});

	}
public boolean onKeyDown(int keyCode, KeyEvent event) {
		
		if (keyCode==KeyEvent.KEYCODE_BACK){
			new AlertDialog.Builder(this)
			.setTitle("Info Pariwisata Wonosobo")
			.setMessage("Keluar dari aplikasi ?")
			.setPositiveButton("YA", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					MenuUtamaActivity.this.finish();
					finish();
				}
			})
			
		.setNegativeButton("TIDAK", null).show();
				
		return true;
		}else{
			return super.onKeyDown(keyCode, event);
		}
		
	}

}

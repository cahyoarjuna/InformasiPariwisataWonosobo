package com.infopariwisata;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class ListWisata extends Activity{
	
	Button btn_alam, btn_budaya, btn_kuliner;
	Intent i, i2, i3;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.list_wisata_layout);
		
		i = new Intent(this, ListTempatWisata.class);
		i2 = new Intent(this, ListBudaya.class);
		i3 = new Intent(this, ListKuliner.class);

		btn_alam = (Button) this.findViewById(R.id.btn_wisata_alam);

		btn_budaya = (Button) this.findViewById(R.id.btn_wisata_budaya);

		btn_kuliner = (Button) this.findViewById(R.id.btn_wisata_kuliner);

		/**
		 * Handling all button click events
		 * */

		// Listening to Tentang button click
		btn_alam.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				startActivity(i);
			}
		});

		btn_budaya.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				startActivity(i2);
			}
		});

		btn_kuliner.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				startActivity(i3);
			}
		});
	}

}

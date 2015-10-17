package com.infopariwisata;

import java.sql.Blob;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

public class KetWisata extends Activity {
	/** Called when the activity is first created. */
	TextView textView, textdesk;
	int im = 0;
	String jud;
	int gbr;
	ImageView view;
	Blob gambar;

	@Override
	public void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.ket_wisata);

		textView = (TextView) findViewById(R.id.judulwisata);
		view = (ImageView) findViewById(R.id.imagedetailwisata);
		Typeface tf = Typeface.createFromAsset(getAssets(),"fonts/MYRIADAS.TTF");
		textdesk = (TextView) findViewById(R.id.deskripsi);
		
		Intent intent = getIntent();
		jud = intent.getStringExtra("judul");
		gbr = intent.getIntExtra("dataIM", 0);
		textView.setText(jud);
		view.setImageResource(gbr);
		textdesk.setText(intent.getStringExtra("deskripsi"));

		Intent imgIntent = new Intent(this, ImageShow.class);
		imgIntent.putExtra("gbr", im);
	}

}

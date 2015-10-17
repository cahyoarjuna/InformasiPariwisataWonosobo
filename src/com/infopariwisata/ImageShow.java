package com.infopariwisata;

import java.sql.Blob;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class ImageShow extends Activity {
	int gbr;
	ImageView view;
	Blob gambar;

	@Override
	public void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		setContentView(R.layout.image_show);
		view = (ImageView) findViewById(R.id.imageshow);
		Intent intent = getIntent();
		gbr = intent.getIntExtra("dataIMshow", 0);
		view.setImageResource(gbr);
	}
}
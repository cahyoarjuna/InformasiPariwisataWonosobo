package com.infopariwisata;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.infopariwisata.R;

public class Kuliner extends Activity {
	Button btnkewisata3;
	 Intent i;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_wisata_kuliner);
        btnkewisata3 = (Button)this.findViewById(R.id.btn_wisata_kuliner);
        i = new Intent(this, ListKuliner.class);
        btnkewisata3.setOnClickListener(new OnClickListener() {
        	@Override
			public void onClick(View arg0) {
            
			startActivity(i);	
			}
		});
        
    i =new Intent(this,ListKuliner.class);
       
    }
}
package com.infopariwisata;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.infopariwisata.ListBudaya;
import com.infopariwisata.R;

public class Budaya extends Activity {
	Button btnkewisata2;
	 Intent i;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_wisata_budaya);
        btnkewisata2 = (Button)this.findViewById(R.id.btn_wisata_budaya);
        i = new Intent(this, ListBudaya.class);
        btnkewisata2.setOnClickListener(new OnClickListener() {
        	@Override
			public void onClick(View arg0) {
            
			startActivity(i);	
			}
		});
        
    i =new Intent(this,ListBudaya.class);
       
    }
}
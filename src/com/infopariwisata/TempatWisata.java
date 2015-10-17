package com.infopariwisata;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import com.infopariwisata.R;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;

public class TempatWisata extends Activity {
	Button btnkewisataalam;
	Intent i;
	
		
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_wisata_alam);
        btnkewisataalam = (Button)this.findViewById(R.id.btn_wisata_alam);
        
      
        i = new Intent(this, ListTempatWisata.class);
        btnkewisataalam.setOnClickListener(new OnClickListener() {
        	@Override
			public void onClick(View arg0) {
			startActivity(i);	
			}
		});
        
    i =new Intent(this,ListTempatWisata.class);
       
    }
    public static String ambilResource(Resources resources, int resId) {
		InputStream rawResource = resources.openRawResource(resId);
	    String content = ubahKeString(rawResource);
	    try {rawResource.close();} catch (IOException e) {}
		return content;
	}
	
	private static String ubahKeString(InputStream in) {
	    String l;
	    BufferedReader r = new BufferedReader(new InputStreamReader(in));
	    StringBuilder s = new StringBuilder();
	    try {
	        while ((l = r.readLine()) != null) {
	            s.append(l + "\n");
	        }
	    } catch (IOException e) {} 
	    return s.toString();
	    }
	
}


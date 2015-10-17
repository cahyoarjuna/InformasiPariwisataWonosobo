package com.infopariwisata;



import android.os.Bundle;
import android.app.Activity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Hotel extends Activity {
	WebView mWebView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.web_view_layout);

		mWebView = (WebView) findViewById(R.id.webView1);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.loadUrl("http://www.tripadvisor.co.id");
        mWebView.setWebViewClient(new HelloWebViewClient());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.web_view, menu);
		return true;
	}
	 private class HelloWebViewClient extends WebViewClient{
	     @Override
	     public boolean shouldOverrideUrlLoading(WebView view, String url) {
	      view.loadUrl(url);
	      return true;
	     }
}
	 public boolean onKeyDown(int keyCode, KeyEvent event) {
	     if((keyCode == KeyEvent.KEYCODE_BACK) && mWebView.canGoBack()){
	      mWebView.goBack();
	      return true;
	     }
	     return super.onKeyDown(keyCode, event);
	    }
}


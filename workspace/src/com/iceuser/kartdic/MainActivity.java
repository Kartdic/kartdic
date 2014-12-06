package com.iceuser.kartdic;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.net.Uri;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		
        ActionBar actionBar = getActionBar();
        actionBar.hide();
        
        Button kartdicbtn=(Button)findViewById(R.id.kartdic);
        kartdicbtn.setOnClickListener(new OnClickListener()
        {
        	public void onClick(View v)
        	{
        		Intent intent = new Intent(MainActivity.this, EngineListActivity.class);
        		startActivity(intent);
        	}
        });
        Button rarecafebtn=(Button)findViewById(R.id.rarecafelink);
        rarecafebtn.setOnClickListener(new OnClickListener()
        {
        	public void onClick(View v)
        	{
        		Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.cafe.naver.com/llrarell"));
        		startActivity(intent);
        	}
        });
    }
}

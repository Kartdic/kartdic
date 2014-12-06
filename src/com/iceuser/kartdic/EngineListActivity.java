package com.iceuser.kartdic;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class EngineListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engine_list);
		
        ActionBar actionBar = getActionBar();
        actionBar.hide();
        
        Button button=(Button)findViewById(R.id.engine9);
        button.setOnClickListener(new OnClickListener()
        {
        	public void onClick(View v)
        	{
        		Intent intent = new Intent(EngineListActivity.this, Engine9Activity.class);
        		startActivity(intent);
        	}
        });
    }
}

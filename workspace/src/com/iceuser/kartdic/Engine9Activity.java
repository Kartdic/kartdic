package com.iceuser.kartdic;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Engine9Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engine9);
		
        ActionBar actionBar = getActionBar();
        actionBar.hide();
        
        ImageButton driftbtn=(ImageButton)findViewById(R.id.engine9_drift);
        driftbtn.setOnClickListener(new OnClickListener()
        {
        	public void onClick(View v)
        	{
        		Intent intent = new Intent(Engine9Activity.this, Engine9DriftActivity.class);
        		startActivity(intent);
        	}
        });
		ImageButton fox9btn=(ImageButton)findViewById(R.id.engine9_fox9);
        fox9btn.setOnClickListener(new OnClickListener()
        {
        	public void onClick(View v)
        	{
        		Intent intent = new Intent(Engine9Activity.this, Engine9Fox9Activity.class);
        		startActivity(intent);
        	}
        });
		ImageButton broombtn=(ImageButton)findViewById(R.id.engine9_broom);
        broombtn.setOnClickListener(new OnClickListener()
        {
        	public void onClick(View v)
        	{
        		Intent intent = new Intent(Engine9Activity.this, Engine9BroomActivity.class);
        		startActivity(intent);
        	}
        });
		ImageButton devilstaffbtn=(ImageButton)findViewById(R.id.engine9_devilstaff);
		devilstaffbtn.setOnClickListener(new OnClickListener()
        {
        	public void onClick(View v)
        	{
        		Intent intent = new Intent(Engine9Activity.this, Engine9DevilstaffActivity.class);
        		startActivity(intent);
        	}
        });
		ImageButton cotton9lebtn=(ImageButton)findViewById(R.id.engine9_cotton9le);
		cotton9lebtn.setOnClickListener(new OnClickListener()
        {
        	public void onClick(View v)
        	{
        		Intent intent = new Intent(Engine9Activity.this, Engine9Cotton9leActivity.class);
        		startActivity(intent);
        	}
        });
		ImageButton cotton9btn=(ImageButton)findViewById(R.id.engine9_cotton9);
		cotton9btn.setOnClickListener(new OnClickListener()
        {
        	public void onClick(View v)
        	{
        		Intent intent = new Intent(Engine9Activity.this, Engine9Cotton9Activity.class);
        		startActivity(intent);
        	}
        });
		ImageButton proto9btn=(ImageButton)findViewById(R.id.engine9_proto9);
		proto9btn.setOnClickListener(new OnClickListener()
        {
        	public void onClick(View v)
        	{
        		Intent intent = new Intent(Engine9Activity.this, Engine9Proto9Activity.class);
        		startActivity(intent);
        	}
        });
    }
}

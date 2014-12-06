package com.iceuser.kartdic;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;

public class Engine9Cotton9leActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_engine9_cotton9le);
		
        ActionBar actionBar = getActionBar();
        actionBar.hide();
	}
}

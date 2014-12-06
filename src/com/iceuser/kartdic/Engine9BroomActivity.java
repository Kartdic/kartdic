package com.iceuser.kartdic;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;

public class Engine9BroomActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_engine9_broom);
		
        ActionBar actionBar = getActionBar();
        actionBar.hide();
	}
}

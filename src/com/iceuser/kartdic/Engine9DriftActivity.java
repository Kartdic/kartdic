package com.iceuser.kartdic;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;

public class Engine9DriftActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_engine9_drift);
		
        ActionBar actionBar = getActionBar();
        actionBar.hide();
	}
}

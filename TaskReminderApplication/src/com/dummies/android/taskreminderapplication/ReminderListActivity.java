package com.dummies.android.taskreminderapplication;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;

public class ReminderListActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.reminder_list);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.reminder_list, menu);
		return true;
	}

}

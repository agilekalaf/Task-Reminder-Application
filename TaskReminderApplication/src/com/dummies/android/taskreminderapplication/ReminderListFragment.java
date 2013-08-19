package com.dummies.android.taskreminderapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class ReminderListFragment extends ListFragment {
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		setEmptyText(getResources().getString(R.string.no_reminders));
	}
	
	private ListAdapter mAdapter;
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		String[] items = new String[] {"Foo","Bar","Fizz","Bin"};
		mAdapter = new ArrayAdapter<String>(getActivity(),R.layout.reminder_row,R.id.text1,items);
		setListAdapter(mAdapter);
		registerForContextMenu(getListView());
	}
	
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		Intent i = new Intent(getActivity(),ReminderEditActivity.class);
		i.putExtra(ReminderProvider.COLUMN_ROWID, id);
		startActivity(i);
	}
	
	@Override
	public void onCreateContextMenu(ContextMenu menu, View v, ContextMenuInfo menuInfo) {
		super.onCreateContextMenu(menu, v, menuInfo);
	}
}

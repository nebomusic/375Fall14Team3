package com.example.informationhubapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class ActivityDaughter extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity_daughter);
	}
	@Override
	protected void onResume() {
		super.onResume();
		setContentView(R.layout.activity_activity_daughter);
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_daughter, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
//	public void handleClick(View v) {
//		Intent intent = new Intent(this, ActivityDMed.class);
//		startActivity(intent);
//	}
//	public void handleClick(View v) {
//		Intent intent = new Intent(this, ActivityDFin.class);
//		startActivity(intent);
//		)
//	public void handleClick(View v) {
//		Intent intent = new Intent(this, ActivityDOth.class);
//		startActivity(intent);
	
}

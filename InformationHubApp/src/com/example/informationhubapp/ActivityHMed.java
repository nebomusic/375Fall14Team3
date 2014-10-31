package com.example.informationhubapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityHMed extends Activity {
	private TextView textView1;
	private EditText editText;
	private Button buttonAddInfo;
	private Button buttonReset;
	private Button buttonDate;
	private EditText editDate;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity_hmed);
		editText= (EditText)findViewById(R.id.editText);
		buttonAddInfo= (Button)findViewById(R.id.buttonAddInfo);
		buttonReset= (Button)findViewById(R.id.buttonReset);
		textView1= (TextView)findViewById (R.id.textView1);
		buttonDate= (Button) findViewById (R.id.buttonDate);
		editDate= (EditText)findViewById (R.id.editDate);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_hmed, menu);
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
	
	public void displayInfo(){
		String Info = editText.getText().toString();
		String Date = editDate. getText().toString();
		String Display = Info +""+ Date;
		textView1.setText(Display);
	}
}

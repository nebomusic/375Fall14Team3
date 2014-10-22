package com.example.informationhubapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.Spinner;
import android.widget.TextView;

public class AddFamily extends Activity {
	
	private FamilyMember familyMember;
	
	private RadioButton radioMale;
	private RadioButton radioFemale;
	private SeekBar seekAge;
	private TextView textAge;
	private EditText editBirthday;
	private EditText editWeight;
	private EditText editHeight;
	private Spinner spinnerColor;
	private Button btnSubmit;
	private Button btnPerson1;
	private Button btnPerson2;
	private Button btnPerson3;
	private Button btnPerson4;
	private Button btnPerson5;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_family);
		
		familyMember = new FamilyMember();
		
		radioMale = (RadioButton)findViewById(R.id.radioMale);
		radioFemale = (RadioButton)findViewById(R.id.radioFemale);
		seekAge = (SeekBar)findViewById(R.id.seekAge);
		textAge = (TextView)findViewById(R.id.textAge);
		editBirthday = (EditText)findViewById(R.id.editBirthday);
		editWeight = (EditText)findViewById(R.id.editWeight);
		editHeight = (EditText)findViewById(R.id.editHeight);
		spinnerColor = (Spinner)findViewById(R.id.spinnerColor);
		btnSubmit = (Button)findViewById(R.id.btnSubmit);
		btnPerson1 = (Button)findViewById(R.id.btnPerson1);
		btnPerson2 = (Button)findViewById(R.id.btnPerson2);
		btnPerson3 = (Button)findViewById(R.id.btnPerson3);
		btnPerson4 = (Button)findViewById(R.id.btnPerson4);
		btnPerson5 = (Button)findViewById(R.id.btnPerson5);
		
		seekAge.setMax(100);
		seekAge.setProgress(0);
		seekAge.setOnSeekBarChangeListener(seekAgeChangeListener);
		
		ArrayAdapter<CharSequence> colorAdapter = ArrayAdapter.createFromResource(this,
				R.array.color_array, android.R.layout.simple_spinner_dropdown_item);
		colorAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerColor.setAdapter(colorAdapter);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add_family, menu);
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
	
	private OnSeekBarChangeListener seekAgeChangeListener = new OnSeekBarChangeListener () {

		@Override
		public void onProgressChanged(SeekBar seekBar, int progress,
				boolean fromUser) {
			
			int age = seekAge.getProgress();
			textAge.setText(age);
			
		}

		@Override
		public void onStartTrackingTouch(SeekBar seekBar) {
			
		}

		@Override
		public void onStopTrackingTouch(SeekBar seekBar) {
			
		}
		
	};
	
	public void btnSubmitClicked(View v) {
		// Gender
		if (radioMale.isChecked()) {
			familyMember.setGender(true);
		}
		if (radioFemale.isChecked()) {
			familyMember.setGender(false);
		}
		// Age
		int age = seekAge.getProgress();
		familyMember.setAge(age);
		// Birthday
		Editable birthday = editBirthday.getText();
		String birthdayString = String.valueOf(birthday);
		familyMember.setBirthday(birthdayString);
		// Weight
		Editable weight = editWeight.getText();
		String weightString = String.valueOf(weight);
		familyMember.setWeight(weightString);
		// Height
		Editable height = editHeight.getText();
		String heightString = String.valueOf(height);
		familyMember.setHeight(heightString);
		// Color
		familyMember.setColor(String.valueOf(spinnerColor.getSelectedItem()));
		// Switch Intents
		Intent intentMain = new Intent(this, MainActivity.class);
		startActivity(intentMain);
		// Change Main Activity
		if (btnPerson1.getVisibility() == View.INVISIBLE) {
			btnPerson1.setVisibility(View.VISIBLE);
			// TODO ADD NAME!!!!!!!!!!!!!!!!!
		}
	}
	
}

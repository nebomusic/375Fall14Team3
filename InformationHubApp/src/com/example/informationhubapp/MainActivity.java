package com.example.informationhubapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.SeekBar.OnSeekBarChangeListener;


public class MainActivity extends Activity {
	
	private FamilyMember familyMember;
	private FamilyList familyList;
	
	private EditText editName;
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
	private Button btnAddFamily;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        screenMain();
        
        familyMember = new FamilyMember();
        familyList = new FamilyList();
		
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    @Override
    public void onResume() {
    	super.onResume();
    	setContentView(R.layout.activity_main);
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
		public void onProgressChanged(SeekBar seekAge, int progress,
				boolean fromUser) {
			
			int age = seekAge.getProgress();
			String ageString = String.valueOf(age);
			textAge.setText(ageString);
			
		}

		@Override
		public void onStartTrackingTouch(SeekBar seekAge) {
			
		}

		@Override
		public void onStopTrackingTouch(SeekBar seekAge) {
			
		}
		
	};
	
	public void btnSubmitClicked(View v) {
		
		// Add Family Member
		familyList.addFamilyMember(familyMember);
		
		// Name
		String name = editName.getText().toString();
		familyMember.setName(name);
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
		String birthday = editBirthday.getText().toString();
		familyMember.setBirthday(birthday);
		// Weight
		String weight = editWeight.getText().toString();
		familyMember.setWeight(weight);
		// Height
		String height = editHeight.getText().toString();
		familyMember.setHeight(height);
		// Color
		familyMember.setColor(String.valueOf(spinnerColor.getSelectedItem()));
		// Change Main Activity
		screenMain();
		// BtnPerson5 VISIBLE
		if (btnPerson5.getVisibility() == View.VISIBLE) {
			btnAddFamily.setVisibility(View.INVISIBLE);
		}
		// BtnPerson5 INVISIBLE
		if (btnPerson5.getVisibility() == View.INVISIBLE) {
			// BtnPerson4 VISIBLE
			if (btnPerson4.getVisibility() == View.VISIBLE) {
				btnPerson5.setVisibility(View.VISIBLE);
				btnPerson5.setText(name + "'s Info");
				String color = familyMember.getColor();
				if (color.equals("Red")) {
					btnPerson5.setBackgroundColor(Color.RED);
				}
				if (color.equals("Blue")) {
					btnPerson5.setBackgroundColor(Color.RED);
				}
				if (color.equals("Cyan")) {
					btnPerson5.setBackgroundColor(Color.CYAN);
				}
				if (color.equals("Yellow")) {
					btnPerson5.setBackgroundColor(Color.YELLOW);
				}
				if (color.equals("Green")) {
					btnPerson5.setBackgroundColor(Color.GREEN);
				}
				if (color.equals("Magenta")) {
					btnPerson5.setBackgroundColor(Color.MAGENTA);
				}
								
						} // end BtnPerson4 VISIBLE
			// BtnPerson4 INVISIBLE
			if (btnPerson4.getVisibility() == View.INVISIBLE) {
				// BtnPerson3 VISIBLE
				if (btnPerson3.getVisibility() == View.VISIBLE) {
					btnPerson4.setVisibility(View.VISIBLE);
					btnPerson4.setText(name + "'s Info");
					String color = familyMember.getColor();
					if (color.equals("Red")) {
						btnPerson4.setBackgroundColor(Color.RED);
					}
					if (color.equals("Blue")) {
						btnPerson4.setBackgroundColor(Color.RED);
					}
					if (color.equals("Cyan")) {
						btnPerson4.setBackgroundColor(Color.CYAN);
					}
					if (color.equals("Yellow")) {
						btnPerson4.setBackgroundColor(Color.YELLOW);
					}
					if (color.equals("Green")) {
						btnPerson4.setBackgroundColor(Color.GREEN);
					}
					if (color.equals("Magenta")) {
						btnPerson4.setBackgroundColor(Color.MAGENTA);
					}
				}
				// BtnPerson3 INVISIBLE
				if (btnPerson3.getVisibility() == View.INVISIBLE) {
					// BtnPerson2 VISIBLE
					if (btnPerson2.getVisibility() == View.VISIBLE) {
						btnPerson3.setVisibility(View.VISIBLE);
						btnPerson3.setText(name + "'s Info");
						String color = familyMember.getColor();
						if (color.equals("Red")) {
							btnPerson3.setBackgroundColor(Color.RED);
						}
						if (color.equals("Blue")) {
							btnPerson3.setBackgroundColor(Color.RED);
						}
						if (color.equals("Cyan")) {
							btnPerson3.setBackgroundColor(Color.CYAN);
						}
						if (color.equals("Yellow")) {
							btnPerson3.setBackgroundColor(Color.YELLOW);
						}
						if (color.equals("Green")) {
							btnPerson3.setBackgroundColor(Color.GREEN);
						}
						if (color.equals("Magenta")) {
							btnPerson3.setBackgroundColor(Color.MAGENTA);
						}
					}
					// BtnPerson2 INVISIBLE
					if (btnPerson2.getVisibility() == View.INVISIBLE) {
						// BtnPerson1 VISIBLE
						if (btnPerson1.getVisibility() == View.VISIBLE) {
							btnPerson2.setVisibility(View.VISIBLE);
							btnPerson2.setText(name + "'s Info");
							String color = familyMember.getColor();
							if (color.equals("Red")) {
								btnPerson2.setBackgroundColor(Color.RED);
							}
							if (color.equals("Blue")) {
								btnPerson2.setBackgroundColor(Color.RED);
							}
							if (color.equals("Cyan")) {
								btnPerson2.setBackgroundColor(Color.CYAN);
							}
							if (color.equals("Yellow")) {
								btnPerson2.setBackgroundColor(Color.YELLOW);
							}
							if (color.equals("Green")) {
								btnPerson2.setBackgroundColor(Color.GREEN);
							}
							if (color.equals("Magenta")) {
								btnPerson2.setBackgroundColor(Color.MAGENTA);
							}
						}
						// BtnPerson1 INVISIBLE
						if (btnPerson1.getVisibility() == View.INVISIBLE) {
							btnPerson1.setVisibility(View.VISIBLE);
							btnPerson1.setText(name + "'s Info");
							String color = familyMember.getColor();
							if (color.equals("Red")) {
								btnPerson1.setBackgroundColor(Color.RED);
							}
							if (color.equals("Blue")) {
								btnPerson1.setBackgroundColor(Color.RED);
							}
							if (color.equals("Cyan")) {
								btnPerson1.setBackgroundColor(Color.CYAN);
							}
							if (color.equals("Yellow")) {
								btnPerson1.setBackgroundColor(Color.YELLOW);
							}
							if (color.equals("Green")) {
								btnPerson1.setBackgroundColor(Color.GREEN);
							}
							if (color.equals("Magenta")) {
								btnPerson1.setBackgroundColor(Color.MAGENTA);
							}
						}
					}
				}
			}
		}
	}
								
				
		
		
			
			


	
	private void screenMain() {
		setContentView(R.layout.activity_main);
		
		btnSubmit = (Button)findViewById(R.id.btnSubmit);
		btnPerson1 = (Button)findViewById(R.id.btnPerson1);
		btnPerson2 = (Button)findViewById(R.id.btnPerson2);
		btnPerson3 = (Button)findViewById(R.id.btnPerson3);
		btnPerson4 = (Button)findViewById(R.id.btnPerson4);
		btnPerson5 = (Button)findViewById(R.id.btnPerson5);
		btnAddFamily = (Button)findViewById(R.id.btnAddFamily);
	}
	
	private void screenAdd() {
		setContentView(R.layout.activity_add_family);
		
		editName = (EditText)findViewById(R.id.editName);
		radioMale = (RadioButton)findViewById(R.id.radioMale);
		radioFemale = (RadioButton)findViewById(R.id.radioFemale);
		seekAge = (SeekBar)findViewById(R.id.seekAge);
		textAge = (TextView)findViewById(R.id.textAge);
		editBirthday = (EditText)findViewById(R.id.editBirthday);
		editWeight = (EditText)findViewById(R.id.editWeight);
		editHeight = (EditText)findViewById(R.id.editHeight);
		spinnerColor = (Spinner)findViewById(R.id.spinnerColor);
		
		seekAge.setMax(100);
		seekAge.setProgress(5);
		seekAge.setOnSeekBarChangeListener(seekAgeChangeListener);
			
		ArrayAdapter<CharSequence> colorAdapter = ArrayAdapter.createFromResource(this,
				R.array.color_array, android.R.layout.simple_spinner_dropdown_item);
		colorAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerColor.setAdapter(colorAdapter);
	        
	}
	
	public void btnAddFamilyClicked(View v) {
		screenAdd();
	}
	
	
	
	// Function to switch Intents
	public void handleClick(View v) {
		// which button was clicked
		switch (v.getId()) {
		case R.id.buttonActivityHusband:
			// Create new Intent
			Intent intentOne = new Intent (this, ActivityHusband.class);
			// Start intent
			startActivity(intentOne);
			break;
		case R.id.buttonActivityWife:
			Intent intentTwo = new Intent (this, ActivityWife.class);
			startActivity(intentTwo);
			break;
		case R.id.buttonActivityDaughter:
			Intent intentThree = new Intent (this, ActivityDaughter.class);
			startActivity(intentThree);
			break;
		}
	}
}

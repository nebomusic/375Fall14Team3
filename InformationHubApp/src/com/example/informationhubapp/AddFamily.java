package com.example.informationhubapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
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

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_family);
		
		familyMember = new FamilyMember();
		
		editName = (EditText)findViewById(R.id.editName);
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
		seekAge.setProgress(5);
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
		public void onProgressChanged(SeekBar seekAge, int progress,
				boolean fromUser) {
			
			int age = seekAge.getProgress();
			textAge.setText(age);
			
		}

		@Override
		public void onStartTrackingTouch(SeekBar seekAge) {
			
		}

		@Override
		public void onStopTrackingTouch(SeekBar seekAge) {
			
		}
		
	};
	
	public void btnSubmitClicked(View v) {
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
		// Switch Intents
		Intent intentMain = new Intent(this, MainActivity.class);
		startActivity(intentMain);
		// Change Main Activity
		if (btnPerson1.getVisibility() == View.INVISIBLE) {
			btnPerson1.setVisibility(View.VISIBLE);
			btnPerson1.setText(name + "'s Info");
			String color = String.valueOf(spinnerColor.getSelectedItem());
			if (color == "Red") {
				btnPerson1.setBackgroundColor(Color.RED);
			}
			if (color == "Blue") {
				btnPerson1.setBackgroundColor(Color.BLUE);
			}
			if (color == "Cyan") {
				btnPerson1.setBackgroundColor(Color.CYAN);
			}
			if (color == "Green") {
				btnPerson1.setBackgroundColor(Color.GREEN);
			}
			if (color == "Yellow") {
				btnPerson1.setBackgroundColor(Color.YELLOW);
			}
			if (color == "Magenta") {
				btnPerson1.setBackgroundColor(Color.MAGENTA);
			}
		} // end if
		
		if (btnPerson1.getVisibility() == View.VISIBLE) {
			if (btnPerson2.getVisibility() == View.INVISIBLE) {
				btnPerson2.setVisibility(View.VISIBLE);
				String color = String.valueOf(spinnerColor.getSelectedItem());
				btnPerson2.setText(name + "'s Info");
				if (color == "Red") {
					btnPerson2.setBackgroundColor(Color.RED);
				}
				if (color == "Blue") {
					btnPerson2.setBackgroundColor(Color.BLUE);
				}
				if (color == "Cyan") {
					btnPerson2.setBackgroundColor(Color.CYAN);
				}
				if (color == "Green") {
					btnPerson2.setBackgroundColor(Color.GREEN);
				}
				if (color == "Yellow") {
					btnPerson2.setBackgroundColor(Color.YELLOW);
				}
				if (color == "Magenta") {
					btnPerson2.setBackgroundColor(Color.MAGENTA);
				}
			} // end if
			
			if (btnPerson2.getVisibility() == View.VISIBLE) {
				if (btnPerson3.getVisibility() == View.INVISIBLE) {
					btnPerson3.setVisibility(View.VISIBLE);
					String color = String.valueOf(spinnerColor.getSelectedItem());
					btnPerson3.setText(name + "'s Info");
					if (color == "Red") {
						btnPerson3.setBackgroundColor(Color.RED);
					}
					if (color == "Blue") {
						btnPerson3.setBackgroundColor(Color.BLUE);
					}
					if (color == "Cyan") {
						btnPerson3.setBackgroundColor(Color.CYAN);
					}
					if (color == "Green") {
						btnPerson3.setBackgroundColor(Color.GREEN);
					}
					if (color == "Yellow") {
						btnPerson3.setBackgroundColor(Color.YELLOW);
					}
					if (color == "Magenta") {
						btnPerson3.setBackgroundColor(Color.MAGENTA);
					}
				} // end if
				if (btnPerson3.getVisibility() == View.VISIBLE) {
					if (btnPerson4.getVisibility() == View.INVISIBLE) {
						btnPerson4.setVisibility(View.VISIBLE);
						String color = String.valueOf(spinnerColor.getSelectedItem());
						btnPerson4.setText(name + "'s Info");
						if (color == "Red") {
							btnPerson4.setBackgroundColor(Color.RED);
						}
						if (color == "Blue") {
							btnPerson4.setBackgroundColor(Color.BLUE);
						}
						if (color == "Cyan") {
							btnPerson4.setBackgroundColor(Color.CYAN);
						}
						if (color == "Green") {
							btnPerson4.setBackgroundColor(Color.GREEN);
						}
						if (color == "Yellow") {
							btnPerson4.setBackgroundColor(Color.YELLOW);
						}
						if (color == "Magenta") {
							btnPerson4.setBackgroundColor(Color.MAGENTA);
						}
					} // end if
					if (btnPerson4.getVisibility() == View.VISIBLE) {
						if (btnPerson5.getVisibility() == View.INVISIBLE) {
							btnPerson5.setVisibility(View.VISIBLE);
							String color = String.valueOf(spinnerColor.getSelectedItem());
							btnPerson5.setText(name + "'s Info");
							if (color == "Red") {
								btnPerson5.setBackgroundColor(Color.RED);
							}
							if (color == "Blue") {
								btnPerson5.setBackgroundColor(Color.BLUE);
							}
							if (color == "Cyan") {
								btnPerson5.setBackgroundColor(Color.CYAN);
							}
							if (color == "Green") {
								btnPerson5.setBackgroundColor(Color.GREEN);
							}
							if (color == "Yellow") {
								btnPerson5.setBackgroundColor(Color.YELLOW);
							}
							if (color == "Magenta") {
								btnPerson5.setBackgroundColor(Color.MAGENTA);
							}
						} // end if
						if (btnPerson5.getVisibility() == View.VISIBLE) {
							btnSubmit.setVisibility(View.INVISIBLE);
						}
					}
				}
			}
		}
	}
	
}

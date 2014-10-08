package com.example.coffeeapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Main extends Activity {
	// Field to hold Order data
	private Orders orders;
	private Drink currentDrink;
	
	// Fields for User Inteface Objects
	private Button btnHot;
	private Button btnCoffee;
	private Button btnFrap;
	private Button btnExpres;
	private Button btnTall;
	private Button btnGrande;
	private Button btnVenti;
	private Spinner spinnerFlavor;
	private Spinner spinnerDairy;
	private Button btnAddDrink;
	private Button btnResetDrink;
	private TextView textDrinksAdded;
	private TextView textCurrentDrink;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// Initialize Orders
		orders = new Orders();
		currentDrink = new Drink();
		
		// Bind to XML
		btnHot = (Button)findViewById(R.id.btnHot);
		btnCoffee = (Button)findViewById(R.id.btnCoffee);
		btnFrap = (Button)findViewById(R.id.btnFrap);
		btnExpres = (Button)findViewById(R.id.btnExpres);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
}

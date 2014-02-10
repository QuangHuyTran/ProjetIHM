package com.example.projetihm;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ListingPlat extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.listingplat);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.plat, menu);
		return true;
	}

}

package com.example.projetihm;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ListingCourse extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.listingcourse);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.listing_course, menu);
		return true;
	}

}

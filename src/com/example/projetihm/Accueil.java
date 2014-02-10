package com.example.projetihm;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Accueil extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.accueil);
		Button BoutonAgenda = (Button) findViewById(R.id.agenda);
		  BoutonAgenda.setOnClickListener(new OnClickListener() {
					
		  @Override
		  public void onClick(View v) {
			Intent intent = new Intent(Accueil.this, Calendrier.class);
			startActivity(intent);
			}
		});
		  Button BoutonRecette = (Button) findViewById(R.id.recettes);
		  BoutonRecette.setOnClickListener(new OnClickListener() {
					
		  @Override
		  public void onClick(View v) {
			Intent intent = new Intent(Accueil.this, Recette.class);
			startActivity(intent);
			}
		});
		  Button BoutonMenus = (Button) findViewById(R.id.menus);
		  BoutonMenus.setOnClickListener(new OnClickListener() {
					
		  @Override
		  public void onClick(View v) {
			Intent intent = new Intent(Accueil.this, PlanningMenu.class);
			startActivity(intent);
			}
		});
		  Button BoutonRepas = (Button) findViewById(R.id.repas);
		  BoutonRepas.setOnClickListener(new OnClickListener() {
					
		  @Override
		  public void onClick(View v) {
			Intent intent = new Intent(Accueil.this, PlanningSemaine.class);
			startActivity(intent);
			}
		});
		  Button BoutonPlat = (Button) findViewById(R.id.plat);
		  BoutonPlat.setOnClickListener(new OnClickListener() {
					
		  @Override
		  public void onClick(View v) {
			Intent intent = new Intent(Accueil.this, ListingPlat.class);
			startActivity(intent);
			}
		});
		  Button BoutonCourse = (Button) findViewById(R.id.course);
		  BoutonCourse.setOnClickListener(new OnClickListener() {
					
		  @Override
		  public void onClick(View v) {
			Intent intent = new Intent(Accueil.this, ListingCourse.class);
			startActivity(intent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.accueil, menu);
		return true;
	}

}

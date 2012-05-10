package com.seatreserve;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GroupListActivity extends Activity {
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	    setContentView(R.layout.grouplist);
	    
	    
	}
	
	public void createGrp (View v) {
		startActivity(new Intent("com.seatreserve.CREATE_GROUP"));
	}

}

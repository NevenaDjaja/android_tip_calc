package com.example.android_tip_calc;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	public EditText etTip;
	public TextView tvTip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etTip = (EditText) findViewById(R.id.etTip);
        tvTip = (TextView) findViewById(R.id.tvTip);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void tenTip(View v) {
    	setLabel(tipValue()*0.1);   	
    }
    public void fifteenTip(View v) {
    	setLabel(tipValue()*0.15);	
    }
    public void twentyTip(View v) {
    	setLabel(tipValue()*0.2);	
    }
    
    // helpers
    public double tipValue() {
    	return Double.parseDouble(etTip.getText().toString());	
    }
    
    public void setLabel(double tip) {
    	tvTip.setText("Tip is:");
    	tvTip.append(String.format("\t\t$%.2f",tip));
    }
    
}

package com.mycompany.myapp3;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.animation.*;
import android.view.animation.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
	public void exe(View vi){
		Toast.makeText(this,"You are alredy dead",Toast.LENGTH_SHORT).show();
		TextView tx= (TextView) findViewById(R.id.mt1);
		tx.setText("you can never die ,because you were never alive in the first place");
	}
	public void onYes(View view){
		Toast.makeText(this,"Not everyone is sunshine and flowers!!",Toast.LENGTH_LONG).show();
		finish();
	}
	public void onNo(View view){
		TranslateAnimation var=new TranslateAnimation(0,0,0,10000);
		var.setDuration(10000);
		view.startAnimation(var);
		TextView ta=(TextView) findViewById(R.id.mt1);
		ta.setText("you are dead inside ,just like me");
		Toast.makeText(this,"No needs to get out,we have technology",Toast.LENGTH_LONG).show();
		
	}
}

----------------------------------------------------------------------------
/*
public void onNo(View view){
		TranslateAnimation var=new TranslateAnimation(0,0,0,10000);
		var.setDuration(10000);
		view.startAnimation(var);
		TextView ta=(TextView) findViewById(R.id.mt1);
		ta.setText("you are dead inside ,just like me");
		Toast.makeText(this,"No needs to get out,we have technology",Toast.LENGTH_LONG).show();
		
	}
*/

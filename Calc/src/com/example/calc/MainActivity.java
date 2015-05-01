package com.example.calc;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;

public class MainActivity extends Activity {

	int Memo;
	String Operation;
	EditText mDisplay;
	
	void Append(String s) {
		
		String s1 = mDisplay.getText().toString();
		mDisplay.setText(s1 + s);
		
	}
	
	void Delete() {

		String s = mDisplay.getText().toString();
		s = s.substring(0, s.length() - 1); 
		mDisplay.setText(s);
		
	}
	
	void Comma() {
		
		String s = mDisplay.getText().toString();
		s = s.replace(',', '\0') + ',';
		mDisplay.setText(s);
	}
	
	void Clear() {
		
		mDisplay.setText("");
		
	}
	
	
	void SetButtonListener(int ID) {

		Button vButton = (Button)findViewById(ID);
		vButton.setOnClickListener(new View.OnClickListener()
		{
			@Override
            public void onClick(View BV) {
				switch (BV.getId()) {
				case R.id.btn_0:	
					Append("0");
					break;
				case R.id.btn_1:	
					Append("1");
					break;
				case R.id.btn_2:	
					Append("2");
					break;
				case R.id.btn_3:	
					Append("3");
					break;
				case R.id.btn_4:	
					Append("4");
					break;
				case R.id.btn_5:	
					Append("5");
					break;
				case R.id.btn_6:	
					Append("6");
					break;
				case R.id.btn_7:	
					Append("7");
					break;
				case R.id.btn_8:	
					Append("8");
					break;
				case R.id.btn_9:	
					Append("9");
					break;
				case R.id.btn_com:
					Comma();
					break;
				case R.id.btn_del:	
					Delete();
					break;
				case R.id.btn_div:	
					break;
				case R.id.btn_eql:	
					break;
				case R.id.btn_inv:	
					break;
				case R.id.btn_min:	
					break;
				case R.id.btn_mul:	
					break;
				case R.id.btn_pls:	
					break;
				case R.id.btn_res:	
					Clear();
					break;
				};
            }
		});	
	}
	
	
	void LinkGUI() {
		
		mDisplay = (EditText)findViewById(R.id.Display);
        SetButtonListener(R.id.btn_0);
        SetButtonListener(R.id.btn_1);
        SetButtonListener(R.id.btn_2);
        SetButtonListener(R.id.btn_3);
        SetButtonListener(R.id.btn_4);
        SetButtonListener(R.id.btn_5);
        SetButtonListener(R.id.btn_6);
        SetButtonListener(R.id.btn_7);
        SetButtonListener(R.id.btn_8);
        SetButtonListener(R.id.btn_9);
        SetButtonListener(R.id.btn_com);
        SetButtonListener(R.id.btn_del);
        SetButtonListener(R.id.btn_div);
        SetButtonListener(R.id.btn_eql);
        SetButtonListener(R.id.btn_inv);
        SetButtonListener(R.id.btn_min);
        SetButtonListener(R.id.btn_mul);
        SetButtonListener(R.id.btn_pls);
        SetButtonListener(R.id.btn_res);
	
	}
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinkGUI();
        
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


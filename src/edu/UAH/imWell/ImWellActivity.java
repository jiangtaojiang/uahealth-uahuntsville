package edu.UAH.imWell;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ImWellActivity extends Activity {
	Button btnConfigure;
	Button btnLogin;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        btnConfigure = (Button)findViewById(R.id.btnConfig);
        btnConfigure.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent("edu.UAH.Configure"));				
			}
		});
        btnLogin = (Button)findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent("edu.UAH.Sensor"));			
			}
		});
    }
}
/**
 * 
 */
package edu.UAH.imWell;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

public class SensorActivity extends Activity {
	public Handler m_pUiHandler;
	public TextView txtHR;
	public TextView txtRR;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sensor);
        
        // Get the Ui components
        txtHR = (TextView)findViewById(R.id.txtHR);
        txtRR = (TextView)findViewById(R.id.txtRR);
        /*
         * How to use the handler
         * 
         * Message msg = new Message();
         * Bundle bnd = new Bundle();
         * bnd.putInt("datatype", 0);
         * bnd.putInt("HR", 99);
         * msg.setData(bnd);
         * m_pUiHandler.sendMessage(msg);
         * 
         * */
        m_pUiHandler = new Handler() {
        	public void handleMessage(Message msg) {
        		super.handleMessage(msg);
        		Bundle bnd = msg.getData();
        		int type = bnd.getInt("datatype");
        		switch(type)
        		{
        			// HR data
        			case 0:
        				int iHR = bnd.getInt("HR");
        				// Update the Ui
        				String sHR = Integer.toString(iHR);
        				txtHR.setText(sHR);
        				break;
        			// RR
        			case 1:
        				int iRR = bnd.getInt("RR");
        				// Update the Ui
        				String sRR = Integer.toString(iRR);
        				txtRR.setText(sRR);
        				break;
        			default: break;
        		}
        	}
        };
    }
}

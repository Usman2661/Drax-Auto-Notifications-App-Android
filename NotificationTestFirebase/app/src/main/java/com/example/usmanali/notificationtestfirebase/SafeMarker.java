package com.example.usmanali.notificationtestfirebase;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class SafeMarker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_safe_marker);


        Button submitButton = (Button)findViewById(R.id.button2);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TelephonyManager telemamanger = (TelephonyManager)getSystemService(Context.TELEPHONY_SERVICE);
                String getSimSerialNumber = telemamanger.getSimSerialNumber();

                TextView mTextView = (TextView) findViewById(R.id.textView2);
                mTextView.setText(getSimSerialNumber);




            }
        });
    }
}

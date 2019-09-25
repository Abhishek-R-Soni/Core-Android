package com.example.firsttest;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.widget.Button;
import android.widget.EditText;

public class TelephonyActivity extends AppCompatActivity {
    EditText txtmsg;
    Button btnshow;
    TelephonyManager tm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telephony);

        txtmsg = findViewById(R.id.txtmsg);
        btnshow = findViewById(R.id.btnShow);

        tm = (TelephonyManager)getSystemService(Context.TELEPHONY_SERVICE);

        if(ActivityCompat.checkSelfPermission(this,Manifest.permission.READ_PHONE_STATE) !=
        PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.READ_PHONE_STATE}),101);

        String IMEINumber = tm.getDeviceId();
        String SubsccribedId = tm.getSubscriberId();
        String SIMSerialNumber = tm.getSimSerialNumber();
        int phoneStatus = tm.getCallState();
        String strPhonetype = "";
        String status = null;
        int phoneType = tm.getPhoneType();}
    }
}

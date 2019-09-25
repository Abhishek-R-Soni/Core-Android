package com.example.firsttest;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntentDemoActivity extends AppCompatActivity {

    public Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_demo);
    }

    public void onClick(View view) {
        try{
            switch (view.getId()){
                case R.id.btnChm:
                    i = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.google.com"));
                    startActivity(i);
                    break;
                case R.id.btnMap:
                    i = new Intent(Intent.ACTION_VIEW,Uri.parse("geo:22.680699,72.879563?z=16"));
                    startActivity(i);
                    break;
            }
        }
        catch (Exception e){

        }
    }
}

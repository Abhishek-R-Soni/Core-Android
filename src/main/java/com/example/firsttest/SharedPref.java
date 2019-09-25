package com.example.firsttest;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SharedPref extends AppCompatActivity {
    EditText txtname, txtscore;
    Button btnsave;
    TextView lblmsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_pref);
        txtname = findViewById(R.id.txtname);
        txtscore = findViewById(R.id.txtscore);
        btnsave = findViewById(R.id.btnsave);
        lblmsg = findViewById(R.id.lblmsg);

        // to store data
        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sp = getPreferences(Activity.MODE_PRIVATE);
                SharedPreferences.Editor ed = sp.edit();

                ed.putString("player",txtname.getText().toString());
                ed.putInt("score",Integer.parseInt(txtscore.getText().toString()));

                ed.commit();
                txtname.setText("");
                txtscore.setText("");


                // to fatch data
                if (sp.contains("player")){
                    lblmsg.setText(sp.getString("player",""));
                }
                else {
                    lblmsg.setText("try again...");
                }
            }
        });
    }
}

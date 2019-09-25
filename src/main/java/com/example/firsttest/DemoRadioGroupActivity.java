package com.example.firsttest;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class DemoRadioGroupActivity extends AppCompatActivity {

    EditText msg;
    RadioGroup rcolor;
    RadioGroup ralign;
    RadioGroup rsize;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_radio_group);

        msg = findViewById(R.id.msg);
        rcolor = findViewById(R.id.rcolor);
        ralign = findViewById(R.id.ralign);
        rsize = findViewById(R.id.rsize);

        rcolor.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                        case R.id.rdRed:
                            msg.setTextColor(Color.RED);
                            break;

                    case R.id.rdBlue:
                        msg.setTextColor(Color.BLUE);
                        break;

                    case R.id.rdGreen:
                        msg.setTextColor(Color.GREEN);
                        break;
                }
            }
        });

        ralign.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.rdLeft:
                        msg.setGravity(Gravity.LEFT);
                        break;

                    case R.id.rdCenter:
                        msg.setGravity(Gravity.CENTER);
                        break;

                    case R.id.rdRight:
                        msg.setGravity(Gravity.RIGHT);
                        break;
                }
            }
        });

        rsize.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.rdf:
                        String s = msg.getText().toString();
                        msg.setTextSize(s.charAt(0));
                        Toast.makeText(getApplicationContext(),s.charAt(0),Toast.LENGTH_LONG).show();
                        break;

                    case R.id.rds:
                        msg.setTextSize(7.0f);
                        break;

                    case R.id.rdn:
                        msg.setTextSize(9.0f);
                        break;
                }
            }
        });
    }
}

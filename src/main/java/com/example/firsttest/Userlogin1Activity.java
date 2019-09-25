package com.example.firsttest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Userlogin1Activity extends AppCompatActivity {
    EditText uname,pswd,score;
    Button submit;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userlogin1);
        uname = findViewById(R.id.uname);
        pswd = findViewById(R.id.pswd);
        score = findViewById(R.id.score);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(),UserLogin2Activity.class);
                i.putExtra("key1",uname.getText().toString());
                i.putExtra("key2",pswd.getText().toString());
                i.putExtra("key3",score.getText());
                startActivity(i);
            }
        });

    }
}

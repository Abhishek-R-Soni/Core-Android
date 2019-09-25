package com.example.firsttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class UserLogin2Activity extends AppCompatActivity {
    TextView msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login2);
        msg = findViewById(R.id.msg);

        Bundle b = getIntent().getExtras();

        String uname = b.getString("key1");
        String pswd = b.getString("key2");
        int Sc = b.getInt("key3");

        msg.setText("Name : " + uname + "\n" + "Password : " + pswd + "\n" +"Score : " + Sc);
    }
}

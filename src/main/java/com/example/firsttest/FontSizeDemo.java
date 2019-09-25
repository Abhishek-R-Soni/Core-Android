package com.example.firsttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FontSizeDemo extends AppCompatActivity {

    static float i = 30.10f;
    static float j = 30.10f;
    Button incre;
    Button decre;
    TextView msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_font_size_demo);

        msg = findViewById(R.id.msg);
        incre = (Button)findViewById(R.id.incre);
        decre = (Button) findViewById(R.id.decre);
        msg.setTextSize(i);

        incre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i += 30.10f;
                msg.setTextSize(i);
                //msg.setTextSize();
                //Toast.makeText(getApplicationContext(),"Increased",Toast.LENGTH_LONG).show();
            }
        });

        decre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                j -=  30.10f;
                msg.setTextSize(j);

                //Toast.makeText(getApplicationContext(),"Increased",Toast.LENGTH_LONG).show();
            }
        });
    }
}

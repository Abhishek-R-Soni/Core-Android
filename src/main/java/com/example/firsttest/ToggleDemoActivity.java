package com.example.firsttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ToggleButton;

public class ToggleDemoActivity extends AppCompatActivity {

    EditText msg;
    ToggleButton tb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_demo);

        msg = findViewById(R.id.msg);
        tb = findViewById(R.id.tb);

        tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tb.isChecked())
                    msg.setEnabled(true);
                else
                    msg.setEnabled(false);
            }
        });
    }
}

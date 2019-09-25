package com.example.firsttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import java.io.*;

public class Internal_Storage_demo extends AppCompatActivity {
    EditText txtfile, txtdata;
    Button btnsave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internal__storage_demo);
        txtdata = findViewById(R.id.txtdata);
        txtfile = findViewById(R.id.txtfile);
        btnsave = findViewById(R.id.btnsave);
    }
}

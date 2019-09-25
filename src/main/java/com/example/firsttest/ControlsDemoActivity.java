package com.example.firsttest;

import android.content.Context;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;

public class ControlsDemoActivity extends AppCompatActivity {

    Button display;
    EditText pincode;
    EditText name;
    EditText email;
    AutoCompleteTextView state;
    MultiAutoCompleteTextView city;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controls_demo);

        String cities[] = {"Nadiad", "Mumbai", "Kota"};
        String states[] = {"Gujarat", "Rajasthan", "Maharashtra"};

        display = findViewById(R.id.display);
        pincode = findViewById(R.id.pincode);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        state = findViewById(R.id.state);
        city = findViewById(R.id.city);

        ArrayAdapter s = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,states);
        state.setAdapter(s);

        ArrayAdapter c = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,cities);
        city.setAdapter(c);
        city.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());

        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = name.getText().toString() + pincode.getText().toString() + email.getText().toString() + city.getText().toString() + state.getText().toString() ;
                Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_LONG).show();
            }
        });
    }
}

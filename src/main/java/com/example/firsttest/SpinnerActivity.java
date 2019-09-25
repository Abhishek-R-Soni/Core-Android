package com.example.firsttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class SpinnerActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner splang;
    Spinner sptopic;
    EditText msg;
    String tpc[] = {"History", "Operators", "Array"};
    String tpjava[] = {"Inheritance", "Encapsulation", "Data hiding"};
    String tppy[] = {"dunder_method", "Class and Objects"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        splang = findViewById(R.id.splang);
        sptopic = findViewById(R.id.sptopic);
        msg = findViewById(R.id.msg);

        splang.setOnItemSelectedListener(this);
        sptopic.setOnItemSelectedListener(this);

        ArrayAdapter ad = ArrayAdapter.createFromResource(this,R.array.lang_list,android.R.layout.select_dialog_item);
        splang.setAdapter(ad);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String src[] = null;
        int obj = parent.getId();

        if(obj == R.id.splang){
            String txt = parent.getItemAtPosition(position).toString();

            switch (txt){
                case "C":
                    src = tpc;
                    break;

                case "Java":
                    src = tpjava;
                    break;

                case "Python":
                    src = tppy;
                    break;
            }

            ArrayAdapter ad2 = new ArrayAdapter(this,android.R.layout.simple_list_item_checked,src);
            sptopic.setAdapter(ad2);
            sptopic.setClickable(false);

        }
        else{
            String txt = parent.getItemAtPosition(position).toString();
            msg.setText(txt + " Selected...!");
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}

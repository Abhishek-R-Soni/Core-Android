package com.example.firsttest;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Toast;

public class DatabaseActivity extends AppCompatActivity{

    EditText txtCity,txtDist,txtZipcode;
    Button btnSave, btnInsert;
    SQLiteDatabase DBCity = null;
    String table = "CITY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database);

        txtCity = findViewById(R.id.txtCity);
        txtDist = findViewById(R.id.txtDistrict);
        txtZipcode = findViewById(R.id.txtZipcode);
        btnSave = findViewById(R.id.btnSave);
        btnInsert = findViewById(R.id.btnInsert);

        txtCity.requestFocus();
    }

    public void createDatabase(View v){

        try{
            DBCity = this.openOrCreateDatabase("City",Context.MODE_PRIVATE,null);
            DBCity.execSQL("create table if not exists " + table + "(city varchar, Zipcode varchar, District varchar);");
            Toast.makeText(this,"Created...",Toast.LENGTH_LONG).show();
        }
        catch (Exception e){
            Toast.makeText(this,"Error in Database Creation...",Toast.LENGTH_LONG).show();
        }
    }

    public void insertData(View v){
        try {
            DBCity = this.openOrCreateDatabase("City", Context.MODE_PRIVATE, null);
            DBCity.execSQL("insert into " + table + "(city, Zipcode, District)" + "values ('" + txtCity.getText().toString() + "', " + txtZipcode.getText().toString() + ", " + txtDist.getText().toString() + ");");
            Toast.makeText(this, "Inserted...", Toast.LENGTH_LONG).show();
            txtCity.setText("");
            txtDist.setText("");
            txtZipcode.setText("");
        }
        catch (Exception e){
            Toast.makeText(this,"Error...",Toast.LENGTH_LONG).show();
        }
    }
}

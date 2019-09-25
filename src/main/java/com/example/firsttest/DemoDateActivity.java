package com.example.firsttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import org.w3c.dom.Text;

import java.util.Calendar;

public class DemoDateActivity extends AppCompatActivity implements DatePicker.OnDateChangedListener {

    DatePicker dp;
    TextView show;
    TimePicker tp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_date);
        Calendar now = Calendar.getInstance();

        dp = findViewById(R.id.dp);
        tp = findViewById(R.id.tp);
        show = findViewById(R.id.show);

        dp.setOnDateChangedListener(this);
    }

    public void disTime(View view) {
        tp.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                String time = "hours:" + hourOfDay + minute;
                show.append(time);
            }
        });
    }

    @Override
    public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
        show.setText("Date is : " + dayOfMonth + monthOfYear + year);
        show.append("\n");
    }
}

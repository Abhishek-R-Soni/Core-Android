package com.example.firsttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class RattingBarActivity extends AppCompatActivity {

    RatingBar rbPer, rbBd, rbDes;
    TextView msg;
    float r1 = 0,r2 = 0,r3 = 0,rat = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratting_bar);

        rbPer = findViewById(R.id.rbPer);
        rbBd = findViewById(R.id.rbBd);
        rbDes = findViewById(R.id.rbDeg);
        msg = findViewById(R.id.msg);

        rbDes.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                r1 = rating;
                rat = ((r1 + r2 + r3)/3);
                msg.setText(Float.toString(rat));
            }
        });

        rbBd.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                r2 = rating;
                rat = ((r1 + r2 + r3)/3);
                msg.setText(Float.toString(rat));
            }
        });

        rbPer.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                r3 = rating;
                rat = ((r1 + r2 + r3)/3);
                msg.setText(Float.toString(rat));
            }
        });


    }
}

package com.example.firsttest;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ProgressBarActivity extends AppCompatActivity {

    ProgressBar install;
    int status = 0;
    TextView msg;
    Handler hand;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);

        install = findViewById(R.id.Install);
        msg = findViewById(R.id.msg);
        Thread t = new Thread(new Task());
        t.start();
        hand = new Handler();
    }

    private class Task implements Runnable {
        public void run(){
            while (status < 100){
                status++;

                hand.post(new Runnable() {
                    @Override
                    public void run() {
                        install.setProgress(status);
                        msg.setText(status + "/" + install.getMax());
                    }
                });

                try{
                    Thread.sleep(200);
                }
                catch (Exception e){

                }
                if (status == 100){
                    msg.setText("Missin Accomplished...!");
                }
            }
        }
    }
}

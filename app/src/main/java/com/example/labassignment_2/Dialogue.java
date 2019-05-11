package com.example.labassignment_2;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Dialogue extends AppCompatActivity {

    myThread t1;
    myThread t2;
    Handler handler;

    TextView loadTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialogue);

        loadTxt = findViewById(R.id.loadTxt);

}


}

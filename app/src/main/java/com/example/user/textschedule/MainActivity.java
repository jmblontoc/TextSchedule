package com.example.user.textschedule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvTexts;
    TextView tvSchedule;
    TextView tvAutoReply;
    TextView tvStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvTexts = (RecyclerView) findViewById(R.id.rv_text);

        //insert data on Recycler View
    }
}

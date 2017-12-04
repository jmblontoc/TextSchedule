package com.example.user.textschedule;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

public class StatusActivity extends AppCompatActivity {

    TextView tvSchedule;
    TextView tvAutoReply;
    ImageButton addBtn;
    LinearLayout lyGaming;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);

        tvSchedule = (TextView) findViewById(R.id.schedule_link);
        tvAutoReply = (TextView) findViewById(R.id.autoreply_link);
        addBtn = (ImageButton) findViewById(R.id.add_btn);
        lyGaming = (LinearLayout) findViewById(R.id.ly_gaming);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setClass(getBaseContext(), AddStatus.class);
                startActivityForResult(i,0);
            }
        });

        tvSchedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setClass(getBaseContext(), MainActivity.class);
                startActivityForResult(i,0);
            }
        });

        lyGaming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setClass(getBaseContext(), ViewStatus.class);
                startActivityForResult(i,0);
            }
        });

        tvAutoReply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setClass(getBaseContext(), AutoReplyActivity.class);
                startActivityForResult(i,0);
            }
        });
    }
}

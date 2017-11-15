package com.example.user.textschedule;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class AutoReplyActivity extends AppCompatActivity {

    ImageButton addBtn;
    View sample;
    ImageView deleteBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.auto_replies_index);

        addBtn = (ImageButton) findViewById(R.id.add_btn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setClass(getBaseContext(), AddAutoReply.class);
                startActivityForResult(i,0);
            }
        });

        sample = findViewById(R.id.sample_view);
        sample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setClass(getBaseContext(), EditAutoReply.class);
                startActivityForResult(i,0);
            }
        });

        deleteBtn = (ImageView) findViewById(R.id.delete_btn);
        deleteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DeleteDialog dd = new DeleteDialog();

                dd.show(getSupportFragmentManager(), "");
            }
        });
    }
}

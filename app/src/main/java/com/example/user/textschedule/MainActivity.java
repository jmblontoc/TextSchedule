package com.example.user.textschedule;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageButton btnAdd, btnDelete;
    RecyclerView rvTexts;
    TextView tvSchedule;
    TextView tvAutoReply;
    TextView tvStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*rvTexts = (RecyclerView) findViewById(R.id.rv_text);*/

        //insert data on Recycler View

        btnAdd = (ImageButton) findViewById(R.id.add_btn);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setClass(getBaseContext(), AddSchedule.class);
                startActivityForResult(i,0);
            }
        });
        btnDelete = (ImageButton) findViewById(R.id.delete_btn);
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setClass(getBaseContext(), DeleteSchedule.class);
                startActivityForResult(i,0);
            }
        });
    }
}

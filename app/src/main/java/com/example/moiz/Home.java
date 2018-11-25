package com.example.moiz.hyefa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frag_manager_dashboard);



        LinearLayout linearLayout = (LinearLayout)findViewById(R.id.announcement);


        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), Announcement.class);
                startActivityForResult(intent, 0);
            }
        });

        LinearLayout linearLayout1 = (LinearLayout)findViewById(R.id.distributor);


        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), Distributor.class);
                startActivityForResult(intent, 0);
            }
        });

        LinearLayout linearLayout2 = (LinearLayout)findViewById(R.id.employee);


        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), Employee.class);
                startActivityForResult(intent, 0);
            }
        });

        LinearLayout linearLayout3 = (LinearLayout)findViewById(R.id.taskdetails);


        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), TaskDetail.class);
                startActivityForResult(intent, 0);
            }
        });
    }
}

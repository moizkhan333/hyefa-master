package com.example.moiz.hyefa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Loginas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginas);

        LinearLayout linearLayout = (LinearLayout)findViewById(R.id.loginmanager);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), Login.class);
                startActivityForResult(intent, 0);
            }
        });


        LinearLayout linearLayout1 = (LinearLayout)findViewById(R.id.loginemployee);
        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), Login.class);
                startActivityForResult(intent, 0);
            }
        });


        LinearLayout linearLayout2 = (LinearLayout)findViewById(R.id.logindistributor);
        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), Login.class);
                startActivityForResult(intent, 0);
            }
        });


    }
}

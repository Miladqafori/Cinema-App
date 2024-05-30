package com.example.ticketbaz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class tighi_info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tighi_info);
        Button btn = findViewById(R.id.btnbuy);
        TextView txt = findViewById(R.id.txt);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String moviname = txt.getText().toString().trim();
                Intent in = new Intent(tighi_info.this, selectActivity.class);
                in.putExtra("filmname", moviname);
                startActivity(in);
                finish();
            }
        });
    }
}
package com.example.ticketbaz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Final_signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_signup);

        Button btn =findViewById(R.id.btnvorod);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go_to_main = new Intent(Final_signup.this,MainActivity.class);
                startActivity(go_to_main);
                finish();
            }
        });
    }
}
package com.example.ticketbaz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Page04 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page04);

        Intent recivedata = getIntent();
        String filmname = recivedata.getStringExtra("filmname");
        String radif =recivedata.getStringExtra("radif");
        String sandal =recivedata.getStringExtra("sandali");

        TextView moviname =findViewById(R.id.moviname);
        TextView radife =findViewById(R.id.radif);
        TextView sandali =findViewById(R.id.sandali);

        moviname.setText(filmname);
        radife.setText(radif);
        sandali.setText(sandal);

    }
}
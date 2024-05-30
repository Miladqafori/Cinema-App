package com.example.ticketbaz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class selectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        TextView edtmoviname = findViewById(R.id.txt);
        EditText edtradif = findViewById(R.id.Edtradif);
        EditText edtsandali = findViewById(R.id.Edtsandali);
        Intent recivedata = getIntent();
        String filmname = recivedata.getStringExtra("filmname");
        edtmoviname.setText(filmname);


        CheckBox ch1 = findViewById(R.id.checkBox);
        Button btn = findViewById(R.id.btnsabt);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String moviname = edtmoviname.getText().toString().trim();
                String radif = edtradif.getText().toString().trim();
                String sandali = edtsandali.getText().toString().trim();
                if (ch1.isChecked()) {
                    Intent intent = new Intent(selectActivity.this, Page04.class);

                    intent.putExtra("filmname", moviname);
                    intent.putExtra("radif", radif);
                    intent.putExtra("sandali", sandali);

                    startActivity(intent);
                    Toast.makeText(selectActivity.this, "خرید شما با موفقیت انجام شد", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(selectActivity.this, "قبل از خرید قوانین را مطالعه کنید", Toast.LENGTH_SHORT).show();
                }
            }
        });
        Button btnnext = findViewById(R.id.btn_next);
        Button btnback = findViewById(R.id.btn_back);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(selectActivity.this, Page01.class);
                startActivity(back);
            }
        });
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(selectActivity.this, Page04.class);
                startActivity(next);
            }
        });
    }
}
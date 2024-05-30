package com.example.ticketbaz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText Username = findViewById(R.id.username);
        EditText Password = findViewById(R.id.password);
        Button login = findViewById(R.id.vorod);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = Username.getText().toString().trim();
                String password = Password.getText().toString().trim();

                SharedPreferences sharedPreferences = getSharedPreferences("Mydb", Context.MODE_PRIVATE);

                String savedusername = sharedPreferences.getString("username", "");
                String savedpassword = sharedPreferences.getString("password", "");

                if (username.equals(savedusername) && password.equals(savedpassword)) {
                    Toast.makeText(MainActivity.this, "ورود با موفقیت انجام شد", Toast.LENGTH_SHORT).show();
                    Intent gopage1 = new Intent(MainActivity.this, Page01.class);
                    startActivity(gopage1);
                    finish();
                } else {
                    Toast.makeText(MainActivity.this, "نام کاربری یا کلمه عبور اشتباه است", Toast.LENGTH_SHORT).show();
                }
            }
        });
        TextView txt_signup = findViewById(R.id.without);
        txt_signup.setOnClickListener(e -> {
            Intent navigate = new Intent(MainActivity.this, First_signup.class);
            startActivity(navigate);
            finish();
        });
    }
}
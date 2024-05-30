package com.example.ticketbaz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupMenu;

public class Page01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page01);

        ImageView Menu = findViewById(R.id.menu);
        ImageView hotel = findViewById(R.id.HOTEL);
        ImageView fosil = findViewById(R.id.fosil);
        ImageView tighi = findViewById(R.id.tighi);
        ImageView vorod = findViewById(R.id.vorood);
        Button btnnext = findViewById(R.id.btn_next);
        Button btnback = findViewById(R.id.btn_back);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(Page01.this, HelpTicket.class);
                startActivity(back);
            }
        });
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(Page01.this, selectActivity.class);
                startActivity(next);
            }
        });

        Menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu menu = new PopupMenu(Page01.this, Menu);
                menu.getMenu().add("خرید بلیط");
                menu.getMenu().add("خروج از حساب کاربری");
                menu.getMenu().add("خروج از برنامه");
                menu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        switch (menuItem.getTitle().toString()) {
                            case "خرید بلیط":
                                Intent buyticket = new Intent(Page01.this, selectActivity.class);
                                startActivity(buyticket);
                                break;

                            case "خروج از حساب کاربری":
                                Intent logout = new Intent(Page01.this, MainActivity.class);
                                startActivity(logout);
                                break;

                            case "خروج از برنامه":
                                System.exit(0);
                        }
                        return true;
                    }
                });
                menu.show();
            }
        });
        hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hotelmovie = new Intent(Page01.this, HOTEL_INFO.class);
                startActivity(hotelmovie);
            }
        });
        fosil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fosil = new Intent(Page01.this, fosil_info.class);
                startActivity(fosil);
            }
        });
        vorod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vorood = new Intent(Page01.this, vorrod_info.class);
                startActivity(vorood);
            }
        });
        tighi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tighi = new Intent(Page01.this, tighi_info.class);
                startActivity(tighi);
            }
        });
    }
}
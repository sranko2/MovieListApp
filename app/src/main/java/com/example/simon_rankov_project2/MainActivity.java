package com.example.simon_rankov_project2;

import java.util.ArrayList;
import java.util.Arrays;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView1 = findViewById(R.id.image1);
        TextView textView1 = findViewById(R.id.text1);
        TextView textView2 = findViewById(R.id.text1);
        registerForContextMenu(imageView1);
        registerForContextMenu(textView1);
        registerForContextMenu(textView2);

        RelativeLayout relClick1 = (RelativeLayout)findViewById(R.id.relLayout1);
        relClick1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ViewImageActivity.class);
                intent.putExtra("MovieID", 1);
                startActivity(intent);
            }
        });
        RelativeLayout relClick2 = (RelativeLayout)findViewById(R.id.relLayout2);
        relClick2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ViewImageActivity.class);
                intent.putExtra("MovieID", 2);
                startActivity(intent);
            }
        });
        RelativeLayout relClick3 = (RelativeLayout)findViewById(R.id.relLayout3);
        relClick3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ViewImageActivity.class);
                intent.putExtra("MovieID", 3);
                startActivity(intent);
            }
        });
        RelativeLayout relClick4 = (RelativeLayout)findViewById(R.id.relLayout4);
        relClick4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ViewImageActivity.class);
                intent.putExtra("MovieID", 4);
                startActivity(intent);
            }
        });
        RelativeLayout relClick5 = (RelativeLayout)findViewById(R.id.relLayout5);
        relClick5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ViewImageActivity.class);
                intent.putExtra("MovieID", 5);
                startActivity(intent);
            }
        });
        RelativeLayout relClick6 = (RelativeLayout)findViewById(R.id.relLayout6);
        relClick6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ViewImageActivity.class);
                intent.putExtra("MovieID", 6);
                startActivity(intent);
            }
        });

    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.context_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.option_1:

                return true;
            case R.id.option_2:

                return true;
            default:
                return super.onContextItemSelected(item);
        }


    }
}

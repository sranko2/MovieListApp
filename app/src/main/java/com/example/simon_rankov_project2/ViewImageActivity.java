package com.example.simon_rankov_project2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ViewImageActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        int id = intent.getIntExtra("MovieID", 0);
        ImageView imageView = new ImageView(getApplicationContext());

        if(id == 1){
            imageView.setImageResource(R.drawable.therevenant);
            setContentView(imageView);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.imdb.com/title/tt1663202/?ref_=ttls_li_tt"));
                    startActivity(browserIntent);
                }
            });
        }
        else if(id == 2){
            imageView.setImageResource(R.drawable.greenbook);
            setContentView(imageView);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.imdb.com/title/tt6966692/?ref_=ttls_li_tt"));
                    startActivity(browserIntent);
                }
            });
        }
        else if(id == 3){
            imageView.setImageResource(R.drawable.hacksawridge);
            setContentView(imageView);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.imdb.com/title/tt2119532/?ref_=ttls_li_tt"));
                    startActivity(browserIntent);
                }
            });
        }
        else if(id == 4){
            imageView.setImageResource(R.drawable.logan);
            setContentView(imageView);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.imdb.com/title/tt3315342/?ref_=ttls_li_tt"));
                    startActivity(browserIntent);
                }
            });
        }
        else if(id == 5){
            imageView.setImageResource(R.drawable.mollysgame);
            setContentView(imageView);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.imdb.com/title/tt4209788/?ref_=ttls_li_tt"));
                    startActivity(browserIntent);
                }
            });
        }
        else{
            imageView.setImageResource(R.drawable.theinvisibleguest);
            setContentView(imageView);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.imdb.com/title/tt4857264/?ref_=ttls_li_tt"));
                    startActivity(browserIntent);
                }
            });
        }
    }
}

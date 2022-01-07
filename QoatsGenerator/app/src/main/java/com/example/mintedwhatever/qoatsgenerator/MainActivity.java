package com.example.mintedwhatever.qoatsgenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button QuotesGen;
        final ImageView Quotes;

        QuotesGen = (Button) findViewById(R.id.Quote);
        Quotes = (ImageView) findViewById(R.id.Image1);

        final int ImageArray [] = new int[]{
                R.drawable.quote1,
                R.drawable.quote2,
                R.drawable.quote3,
                R.drawable.quote4,
                R.drawable.quote5

        };

        QuotesGen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random r = new Random();
                int Number = r.nextInt(4);
                int resourceID =  ImageArray[Number];
                Quotes.setImageResource(resourceID);
            }
        });

    }
}

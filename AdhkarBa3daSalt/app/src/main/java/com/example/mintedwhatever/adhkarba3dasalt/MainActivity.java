package com.example.mintedwhatever.adhkarba3dasalt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.nio.channels.ClosedByInterruptException;

public class MainActivity extends AppCompatActivity {

    Button Tasbih;
    TextView ViewCounter;
    TextView Douaa;
    int i ;

    int Position ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Tasbih = (Button) findViewById(R.id.CountBtn);
        ViewCounter = (TextView) findViewById(R.id.Counter);
        Douaa = (TextView) findViewById(R.id.Douaa);
        Position = 1;
        i =1;


        Tasbih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (Position == 1  ){
                    i --;
                    Douaa.setText(R.string.douaa1);
                    ViewCounter.setText(""+i);
                    if ( i < 1 ) {
                        Position = 2;
                        i=2;
                        ViewCounter.setText(""+i+1);
                    }
                }
                if (Position == 2  ){
                    i --;
                    Douaa.setText(R.string.douaa2);
                    ViewCounter.setText(""+i);
                    if ( i <1 ) {
                        Position = 3;
                        i=4;
                        ViewCounter.setText(""+i);
                    }
                }
                if (Position == 3 ) {
                    i--;
                    Douaa.setText(R.string.douaa3);
                    ViewCounter.setText("" + i);
                    if (i <1) {
                        Position = 4;
                        i = 34;
                        ViewCounter.setText("" + i);
                    }
                } if (Position == 4  ){
                    i--;
                    Douaa.setText(R.string.douaa4);
                    ViewCounter.setText(""+i);
                    if (i <1) {
                        Position = 5;
                        i = 2;
                        ViewCounter.setText("" + i);
                    }
                }

                if ( Position == 5 ){
                    i--;
                    Douaa.setText(R.string.douaa5);
                    ViewCounter.setText(""+i);
                    if (i < 1 ){
                        Douaa.setText("لقد اتممت أذكار بعد السلام من الصلاة تقبل الله صلاتكم");
                        ViewCounter.setText("");
                    }
                }

            }
        });





        }





    }









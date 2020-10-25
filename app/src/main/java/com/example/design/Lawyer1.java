package com.example.design;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Lawyer1 extends AppCompatActivity {
    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.law1);
        addListenerOnButton();

    }

    public void addListenerOnButton() {


        button = (Button) findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(Lawyer1.this,
                        "OnClickListener : back",

                        Toast.LENGTH_SHORT).show();
                Intent j = new Intent(Lawyer1.this, MainActivity.class);
                startActivity(j);

            }

        });
        button2.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(Lawyer1.this,
                        "OnClickListener :law1 ",

                        Toast.LENGTH_SHORT).show();

                    Intent i = new Intent(Lawyer1.this, Rajesh.class);
                    startActivity(i);

            }
        });
        button3.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(Lawyer1.this,
                        "OnClickListener :law1 ",

                        Toast.LENGTH_SHORT).show();

                Intent i = new Intent(Lawyer1.this, Pathak.class);
                startActivity(i);

            }
        });
        button4.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(Lawyer1.this,
                        "OnClickListener :law1 ",

                        Toast.LENGTH_SHORT).show();

                Intent i = new Intent(Lawyer1.this, Pavan.class);
                startActivity(i);

            }
        });

    }

}
package com.example.design;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Lawyer4 extends AppCompatActivity {
    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.law4);
        addListenerOnButton();

    }

    public void addListenerOnButton()
    {


        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(Lawyer4.this,
                        "OnClickListener : ",

                        Toast.LENGTH_SHORT).show();
                Intent j = new Intent(Lawyer4.this, MainActivity.class);
                startActivity(j);
            }

        });
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(Lawyer4.this,
                        "OnClickListener : ",

                        Toast.LENGTH_SHORT).show();
                Intent j = new Intent(Lawyer4.this, Shahid.class);
                startActivity(j);
            }

        });
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(Lawyer4.this,
                        "OnClickListener : ",

                        Toast.LENGTH_SHORT).show();
                Intent j = new Intent(Lawyer4.this, Indu.class);
                startActivity(j);
            }

        });
        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(Lawyer4.this,
                        "OnClickListener : ",

                        Toast.LENGTH_SHORT).show();
                Intent j = new Intent(Lawyer4.this, Anu.class);
                startActivity(j);
            }

        });
    }
}

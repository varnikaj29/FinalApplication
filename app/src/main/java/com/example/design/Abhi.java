package com.example.design;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Abhi extends AppCompatActivity {
    Button button5;
    Button button6;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abhi);
        addListenerOnButton();

    }
    public void addListenerOnButton()
    {


        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);

        button5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                Toast.makeText(Abhi.this,
                        "OnClickListener : Abhi ",

                        Toast.LENGTH_SHORT).show();
                Intent j = new Intent(Abhi.this, Lawyer5.class);
                startActivity(j);

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                Toast.makeText(Abhi.this,
                        "OnClickListener: SET",

                        Toast.LENGTH_SHORT).show();
                Intent j = new Intent(Abhi.this, Appointment.class);
                startActivity(j);

            }
        });
    }
}
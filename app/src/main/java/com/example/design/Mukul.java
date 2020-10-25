package com.example.design;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Mukul extends AppCompatActivity {
    Button button5;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mukul);
        addListenerOnButton();

    }
    public void addListenerOnButton()
    {


        button5 = (Button) findViewById(R.id.button5);

        button5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                Toast.makeText(Mukul.this,
                        "OnClickListener : Mukul",

                        Toast.LENGTH_SHORT).show();
                Intent j = new Intent(Mukul.this, Lawyer5.class);
                startActivity(j);

            }
        });
    }
}
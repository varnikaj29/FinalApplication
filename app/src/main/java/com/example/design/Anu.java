package com.example.design;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Anu extends AppCompatActivity {
    Button button5;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anu);
        addListenerOnButton();

    }
    public void addListenerOnButton()
    {


        button5 = (Button) findViewById(R.id.button5);

        button5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                Toast.makeText(Anu.this,
                        "OnClickListener : ANU ",

                        Toast.LENGTH_SHORT).show();
                Intent j = new Intent(Anu.this, Lawyer4.class);
                startActivity(j);

            }
        });
    }
}
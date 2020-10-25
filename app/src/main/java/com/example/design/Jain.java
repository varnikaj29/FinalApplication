package com.example.design;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Jain extends AppCompatActivity {
    Button button5;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jain);
        addListenerOnButton();

    }
    public void addListenerOnButton()
    {


        button5 = (Button) findViewById(R.id.button5);

        button5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                Toast.makeText(Jain.this,
                        "OnClickListener : Tarendra ",

                        Toast.LENGTH_SHORT).show();
                Intent j = new Intent(Jain.this, Lawyer2.class);
                startActivity(j);

            }
        });
    }
}
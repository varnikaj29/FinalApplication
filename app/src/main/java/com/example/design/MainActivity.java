package com.example.design;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner1, spinner2;
    private Button btnSubmit;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addItemsOnSpinner2();
        addListenerOnButton();
        addListenerOnSpinnerItemSelection();
    }

    // add items into spinner dynamically
    public void addItemsOnSpinner2() {

        spinner2 =  findViewById(R.id.spinner2);
        List<String> list = new ArrayList<>();
        list.add("Civil");
        list.add("Criminal");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(dataAdapter);
    }

    public void addListenerOnSpinnerItemSelection() {
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner1.setOnItemSelectedListener(new CustomOnItemSelectedListener());
    }

    // get the selected dropdown list value
    public void addListenerOnButton() {

        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this,
                        "OnClickListener : " +
                                "\nSpinner 1 : " + String.valueOf(spinner1.getSelectedItem()) +
                                "\nSpinner 2 : " + String.valueOf(spinner2.getSelectedItem()),
                        Toast.LENGTH_SHORT).show();
                if (spinner1.getSelectedItem().toString().equals("Durg") && spinner2.getSelectedItem().toString().equals("Civil")) {
                    Intent i = new Intent(MainActivity.this, Lawyer1.class);
                    startActivity(i);
                }
                if (spinner1.getSelectedItem().toString().equals("Durg") && spinner2.getSelectedItem().toString().equals("Criminal")) {
                    Intent j = new Intent(MainActivity.this, Lawyer2.class);
                    startActivity(j);
                }
                if (spinner1.getSelectedItem().toString().equals("Raipur") && spinner2.getSelectedItem().toString().equals("Civil")) {
                    Intent k = new Intent(MainActivity.this, Lawyer3.class);
                    startActivity(k);
                }
                if (spinner1.getSelectedItem().toString().equals("Raipur") && spinner2.getSelectedItem().toString().equals("Criminal")) {
                    Intent l = new Intent(MainActivity.this, Lawyer4.class);
                    startActivity(l);
                }
                if (spinner1.getSelectedItem().toString().equals("Bhilai") && spinner2.getSelectedItem().toString().equals("Civil")) {
                    Intent m = new Intent(MainActivity.this, Lawyer5.class);
                    startActivity(m);
                }
                if (spinner1.getSelectedItem().toString().equals("Bhilai") && spinner2.getSelectedItem().toString().equals("Criminal")) {
                    Intent n = new Intent(MainActivity.this, Lawyer6.class);
                    startActivity(n);
                }
            }

        });
    }

}


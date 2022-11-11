package com.example.containers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_ir_radio_group;
    Button btn_ir_box_model;
    Button btn_ir_table;
    Button btn_ir_overlap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_ir_radio_group = (Button) findViewById(R.id.btn_ir_radio_group);
        btn_ir_radio_group.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent actividad_radio_group = new Intent(MainActivity.this, Radio_Group.class);
                MainActivity.this.startActivity(actividad_radio_group);
            }
        });

        btn_ir_box_model = (Button) findViewById(R.id.btn_ir_box_model);
        btn_ir_box_model.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent actividad_box_model = new Intent(MainActivity.this, Box_Model.class);
                MainActivity.this.startActivity(actividad_box_model);
            }
        });

        btn_ir_table = (Button) findViewById(R.id.btn_ir_table);
        btn_ir_table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent actividad_table = new Intent(MainActivity.this, Table.class);
                MainActivity.this.startActivity(actividad_table);
            }
        });

        btn_ir_overlap = (Button) findViewById(R.id.btn_ir_overlap);
        btn_ir_overlap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent actividad_overlap = new Intent(MainActivity.this, Overlap.class);
                MainActivity.this.startActivity(actividad_overlap);
            }
        });


    }



}
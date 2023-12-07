package com.example.home3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.home3.R.id;

public class grid_item2 extends AppCompatActivity {
TextView textView;
ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_item2);
        textView= findViewById(R.id.griddata2);
        imageView=findViewById(R.id.imageView2);
        Intent intent= getIntent();
        textView.setText(intent.getStringExtra("name"));
        imageView.setImageResource(intent.getIntExtra("image",0));
    }
}
package com.example.home3;

import static java.security.AccessController.*;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.home3.databinding.ActivityGridItemBinding;
import com.example.home3.databinding.ActivityMainBinding;

import java.security.AccessController;

public class grid_item extends AppCompatActivity {
ActivityGridItemBinding binding;
   TextView textView;
   ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityGridItemBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        replceFragment(new product1info());
        binding.linearLayout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(),product1info.class);
                replceFragment(new product1info());
//            startActivity(intent);
            }
        });
        textView= findViewById(R.id.protext1);
        imageView=findViewById(R.id.imageView);

        Intent intent= getIntent();
        textView.setText(intent.getStringExtra("name"));
        imageView.setImageResource(intent.getIntExtra("image",0));




        //public View onCreate(@NonNull LayoutInflater inflater, ViewGroup container,
                // Bundle savedInstanceState){


    }

    private void replceFragment(Fragment fragment) {

        FragmentManager fragmentManager= getSupportFragmentManager();
         FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
         fragmentTransaction.replace(R.id.linearLayout,fragment);
//         fragmentTransaction.addToBackStack(null);

        binding.cardcscreen1.setVisibility(View.GONE);
        binding.cardscreen2.setVisibility(View.VISIBLE);
        fragmentTransaction.commit();
    }


}
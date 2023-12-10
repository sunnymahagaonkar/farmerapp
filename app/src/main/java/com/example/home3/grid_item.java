package com.example.home3;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.home3.databinding.ActivityGridItemBinding;

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
                Log.d("ClickEvent", "CardView clicked");
                replceFragment(new product1info());
//           startActivity(intent);
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
        Log.d("ClickEvent", "CardView clicked");
        FragmentManager fragmentManager= getSupportFragmentManager();
         FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
         fragmentTransaction.replace(R.id.cardscreen2,fragment);
//         fragmentTransaction.addToBackStack(null);

        binding.productscreen.setVisibility(View.GONE);
        binding.cardscreen2.setVisibility(View.VISIBLE);
        fragmentTransaction.commit();
    }



}
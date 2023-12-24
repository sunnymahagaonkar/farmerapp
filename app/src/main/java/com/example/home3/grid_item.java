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
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.home3.Adapters.ProductListAdapter;
import com.example.home3.databinding.ActivityGridItemBinding;

import java.util.ArrayList;
import java.util.List;

public class grid_item extends AppCompatActivity {
ActivityGridItemBinding binding;
   TextView textView;
   ImageView imageView;


   List<String> productList_ = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityGridItemBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        productList_.add("kajdhf");
        productList_.add("jhdf");
        productList_.add("kajdhf");
        productList_.add("jhdf");
        productList_.add("kajdhf");
        productList_.add("jhdf");
        productList_.add("kajdhf");
        productList_.add("jhdf");
        productList_.add("kajdhf");
        productList_.add("jhdf");
        productList_.add("kajdhf");
        productList_.add("jhdf");

        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        ProductListAdapter productListAdapter = new ProductListAdapter(productList_);
        binding.productList.setAdapter(productListAdapter);
        binding.productList.setLayoutManager(layoutManager);

    }



}
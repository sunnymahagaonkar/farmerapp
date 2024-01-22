package com.example.home3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.home3.Adapters.ProductListAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class grid_item extends AppCompatActivity
{
    RecyclerView recview;
    ProductListAdapter productListAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_item);

        recview=(RecyclerView)findViewById(R.id.recyclerView);
        recview.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<ProductDataModel> options =
                new FirebaseRecyclerOptions.Builder<ProductDataModel>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("students"), ProductDataModel.class)
                        .build();

        productListAdapter=new ProductListAdapter(options);
        recview.setAdapter(productListAdapter);

    }

    @Override
    protected void onStart() {
        super.onStart();
        productListAdapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        productListAdapter.stopListening();
    }
}
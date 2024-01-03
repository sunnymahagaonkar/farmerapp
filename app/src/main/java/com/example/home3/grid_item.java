package com.example.home3;


import android.os.Bundle;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.home3.Adapters.ProductListAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import java.util.ArrayList;

public class grid_item extends AppCompatActivity {
    //ActivityGridItemBinding binding;
    RecyclerView recyclerView;
    DatabaseReference databaseReference;
    ProductListAdapter productListAdapter;
    //ArrayList<String> productList_ = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //binding = ActivityGridItemBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_grid_item);
        //ArrayAdapter<String> myarrayAdapter = new ArrayAdapter<>(grid_item.this, android.R.layout.simple_list_item_1);
        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<ProductDataModel> options =
                new FirebaseRecyclerOptions.Builder<ProductDataModel>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("students"), ProductDataModel.class)
                        .build();

        productListAdapter= new ProductListAdapter(options);
        recyclerView.setAdapter(productListAdapter);

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
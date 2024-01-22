package com.example.home3;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import com.example.home3.databinding.FragmentAddfragBinding;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class addfrag extends Fragment {

    EditText t1, t2, t3, t4;
    FragmentAddfragBinding fragmentAddfragBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                         Bundle savedInstanceState) {
        //super.onCreate(savedInstanceState);
        // Inflate the layout for this fragment

        fragmentAddfragBinding = FragmentAddfragBinding.inflate(inflater, container, false);
        //fragmentAddfragBinding = FragmentAddfragBinding.inflate(getLayoutInflater());
        //t1 = t1.findViewById(R.id.product_name);
//        name=fragmentAddfragBinding.product_name;




        fragmentAddfragBinding.dataadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               process(view);
            }
        });
        return fragmentAddfragBinding.getRoot();
    }

    private static addfrag newInstance() {
        return  null;
    }


    public void process(View view) {
        t1 = fragmentAddfragBinding.addname;
        t2 = fragmentAddfragBinding.addcourse;
        t3 = fragmentAddfragBinding.addlocation;
        t4 = fragmentAddfragBinding.addid;

        String name = t1.getText().toString().trim();
        String course = t2.getText().toString().trim();
        String location = t3.getText().toString().trim();
        String product_id = t4.getText().toString().trim();

        DataHolder dataHolder = new DataHolder(name, course, location);

        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        DatabaseReference node = firebaseDatabase.getReference("students");

        // Use push() to generate a unique key for each entry
        node.child(product_id).setValue(dataHolder);

        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");

        Toast.makeText(getContext(), "DATA STORED SUCCESSFULLY", Toast.LENGTH_SHORT).show();
    }

}




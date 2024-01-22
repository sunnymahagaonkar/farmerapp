package com.example.home3;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.home3.databinding.FragmentPersonfragBinding;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class personfrag extends Fragment {
    TextView pname,pemail,ppassword,pmobile,padd,ppostal;
    FragmentPersonfragBinding fragmentPersonfragBinding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         fragmentPersonfragBinding=FragmentPersonfragBinding.inflate(inflater,container, false);
         fragmentPersonfragBinding.editbtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 editprofile(view);
             }
         });
        return fragmentPersonfragBinding.getRoot();
    }

    public void editprofile(View view) {
        pname=fragmentPersonfragBinding.profName;
        pemail=fragmentPersonfragBinding.profEmail;
        ppassword=fragmentPersonfragBinding.profPassword;
        pmobile=fragmentPersonfragBinding.mobnoname;
        padd=fragmentPersonfragBinding.addressname;
        ppostal=fragmentPersonfragBinding.postalname;

        String name =pname.getText().toString().trim();
        String email =pemail.getText().toString().trim();
        String password =ppassword.getText().toString().trim();
        String mobile =pmobile.getText().toString().trim();
        String address =padd.getText().toString().trim();
        String postal =ppostal.getText().toString().trim();

        ProfileHolder profileHolder=new ProfileHolder(name,email,password,mobile,address,postal);
        FirebaseDatabase firebaseDatabase=FirebaseDatabase.getInstance();
        DatabaseReference node=firebaseDatabase.getReference("profiledata");

        node.child(name).setValue(profileHolder);

        pname.setText("");
        pemail.setText("");
        ppassword.setText("");
        pmobile.setText("");
        padd.setText("");
        ppostal.setText("");

        Toast.makeText(getContext(), "profile edit successfully", Toast.LENGTH_SHORT).show();

    }
}
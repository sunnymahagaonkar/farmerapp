package com.example.home3.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.home3.ProductDataModel;
import com.example.home3.R;
//import com.example.home3.databinding.ProductCardViewBinding;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class ProductListAdapter extends FirebaseRecyclerAdapter<ProductDataModel,ProductListAdapter.myviewholder> {


    public ProductListAdapter(FirebaseRecyclerOptions<ProductDataModel> options) {
        super(options);
    }


    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view=
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_card_view, parent, false);
        //ProductCardViewBinding binding = ProductCardViewBinding.inflate(inflater);

        return new myviewholder(view);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull ProductDataModel productDataModel) {
        holder.name.setText(productDataModel.getName());
        //holder.price.setText(String.valueOf(productDataModel.getPrice()));
        holder.course.setText(productDataModel.getCourse());


    }

    public void startListening() {
    }

    public void stopListening() {
    }

    public class myviewholder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView name, price, course;

        public myviewholder(@NonNull View itemView) {
            super(itemView);
            //img = (ImageView) itemView.findViewById(R.id.imageView);
           name = (TextView) itemView.findViewById(R.id.product_name);
            //price = (TextView) itemView.findViewById(R.id.price1);
            course = (TextView) itemView.findViewById(R.id.course1);

        }
    }
}

package com.example.home3.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

//import com.bumptech.glide.Glide;
import com.example.home3.ProductDataModel;
import com.example.home3.R;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

//import de.hdodenhof.circleimageview.CircleImageView;

public class ProductListAdapter extends FirebaseRecyclerAdapter<ProductDataModel,ProductListAdapter.myviewholder>
{
    public ProductListAdapter(@NonNull FirebaseRecyclerOptions<ProductDataModel> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull ProductDataModel model)
    {
        holder.name.setText(model.getName());
        holder.course.setText(model.getCourse());
        holder.location.setText(model.getLocation());
        //Glide.with(holder.img.getContext()).load(model.getPurl()).into(holder.img);
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.product_card_view,parent,false);
        return new myviewholder(view);
    }

    class myviewholder extends RecyclerView.ViewHolder
    {
        //CircleImageView img;
        TextView name,course,location;
        public myviewholder(@NonNull View itemView)
        {
            super(itemView);
            //img=(CircleImageView)itemView.findViewById(R.id.img1);
            name=(TextView)itemView.findViewById(R.id.product_name);
            course=(TextView)itemView.findViewById(R.id.course);
            location=(TextView)itemView.findViewById(R.id.location);
        }
    }
}

package com.example.home3.Adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.home3.databinding.ProductCardViewBinding;

import java.util.List;

public class ProductListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<String> productList_;

    public ProductListAdapter(List<String> productList) {
        productList_ = productList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ProductCardViewBinding binding = ProductCardViewBinding.inflate(inflater);

        return new CardViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        CardViewHolder viewHolder = (CardViewHolder) holder;
        viewHolder.binding_.productName.setText(getItem(position));
    }

    private String getItem(int position) {
       return productList_.get(position);
    }


    @Override
    public int getItemCount() {
        return productList_.size();
    }

    private class CardViewHolder extends RecyclerView.ViewHolder {
        ProductCardViewBinding binding_;
        public CardViewHolder(ProductCardViewBinding binding) {
            super(binding.getRoot());
            binding_ = binding;
        }
    }
}

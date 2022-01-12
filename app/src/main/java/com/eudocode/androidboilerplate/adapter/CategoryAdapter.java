package com.eudocode.androidboilerplate.adapter;

import static com.eudocode.androidboilerplate.network.RetrofitIntence.IMG_BASE_URL;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.eudocode.androidboilerplate.R;
import com.eudocode.androidboilerplate.model.CategoryModel;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.MyViewHolder> {

    List<CategoryModel> categoryList;
    Context mContext;

    public CategoryAdapter(List<CategoryModel> categoryList, Context context) {
        this.categoryList = categoryList;
        this.mContext = context;
    }

    @NonNull
    @Override
    public CategoryAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_item, parent, false);
        return new CategoryAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryAdapter.MyViewHolder holder, int position) {

        String image_link = IMG_BASE_URL + categoryList.get(position).getFeaturedImage();
        Glide.with(mContext)
                .load(image_link)
                .centerCrop()
                .placeholder(R.drawable.product)
                .into(holder.featuredImage);


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("TAG", "Click: "+position);
            }
        });


    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView productName;
        ImageView featuredImage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            featuredImage = itemView.findViewById(R.id.category_image);
        }
    }
}

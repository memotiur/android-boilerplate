package com.eudocode.androidboilerplate.adapter;

import static com.eudocode.androidboilerplate.network.RetrofitIntence.IMG_BASE_URL;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.eudocode.androidboilerplate.R;
import com.eudocode.androidboilerplate.activity.ProductDetailsActivity;
import com.eudocode.androidboilerplate.fragments.ProductDetailsFragment;
import com.eudocode.androidboilerplate.model.ProductModel;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.MyViewHolder> {

    List<ProductModel> productList;
    Context mContext;

    public ProductAdapter(List<ProductModel> productList, Context context) {
        this.productList = productList;
        this.mContext = context;
    }

    @NonNull
    @Override
    public ProductAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_item, parent, false);
        return new ProductAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdapter.MyViewHolder holder, int position) {
        holder.productName.setText(productList.get(position).getProductName());
        String image_link = IMG_BASE_URL + productList.get(position).getFeaturedImage();
        Glide.with(mContext)
                .load(image_link)
                .centerCrop()
                .placeholder(R.drawable.product)
                .into(holder.featuredImage);


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, ProductDetailsActivity.class);
                intent.putExtra("product_data", productList.get(position));
                mContext.startActivity(intent);


               /* AppCompatActivity activity = (AppCompatActivity) view.getContext();
                Fragment myFragment = new ProductDetailsFragment();

                Bundle args = new Bundle();
                args.putSerializable("product_data", productList.get(position));
                //args.putString("YourKey", "YourValue");
                myFragment.setArguments(args);


                activity.getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fframe_container, myFragment)
                        .addToBackStack(null)
                        .commit();*/

                Log.d("TAG", "Click: " + position);
            }
        });


    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView productName;
        ImageView featuredImage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            productName = itemView.findViewById(R.id.product_name);
            featuredImage = itemView.findViewById(R.id.product_image);
        }
    }
}

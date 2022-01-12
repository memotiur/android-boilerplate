package com.eudocode.androidboilerplate.adapter;

import static com.eudocode.androidboilerplate.network.RetrofitIntence.BASE_URL;
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
import com.eudocode.androidboilerplate.model.SliderModel;
import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.List;

public class SliderAdapter extends SliderViewAdapter<SliderAdapter.SliderAdapterViewHolder> {

    // list for storing urls of images.
    private final List<SliderModel> mSliderItems;

    // Constructor
    public SliderAdapter(Context context, List<SliderModel> sliderDataList) {
        this.mSliderItems = sliderDataList;
    }

    // We are inflating the slider_layout
    // inside on Create View Holder method.
    @Override
    public SliderAdapterViewHolder onCreateViewHolder(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.slider_item, null);
        return new SliderAdapterViewHolder(inflate);
    }

    // Inside on bind view holder we will
    // set data to item of Slider View.
    @Override
    public void onBindViewHolder(SliderAdapterViewHolder viewHolder, final int position) {

        final SliderModel sliderItem = mSliderItems.get(position);



        // Glide is use to load image
        // from url in your imageview.
        String image_link = IMG_BASE_URL + sliderItem.getSliderImage();

        Glide.with(viewHolder.itemView)
                .load(image_link)
                .fitCenter()
                .into(viewHolder.slider_image);
    }

    // this method will return
    // the count of our list.
    @Override
    public int getCount() {
        return mSliderItems.size();
    }

    static class SliderAdapterViewHolder extends SliderViewAdapter.ViewHolder {
        // Adapter class for initializing
        // the views of our slider view.
        View itemView;
        ImageView slider_image;

        public SliderAdapterViewHolder(View itemView) {
            super(itemView);
            slider_image = itemView.findViewById(R.id.slider_image);
            this.itemView = itemView;
        }
    }
}

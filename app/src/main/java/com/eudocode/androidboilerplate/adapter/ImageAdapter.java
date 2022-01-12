package com.eudocode.androidboilerplate.adapter;

import static com.eudocode.androidboilerplate.network.RetrofitIntence.IMG_BASE_URL;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.eudocode.androidboilerplate.R;
import com.eudocode.androidboilerplate.model.ImageModel;
import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.List;

public class ImageAdapter extends SliderViewAdapter<ImageAdapter.ImageAdapterViewHolder> {

    // list for storing urls of images.
    private final List<ImageModel> mSliderItems;

    // Constructor
    public ImageAdapter(Context context, List<ImageModel> sliderDataList) {
        this.mSliderItems = sliderDataList;
    }

    // We are inflating the slider_layout
    // inside on Create View Holder method.
    @Override
    public ImageAdapter.ImageAdapterViewHolder onCreateViewHolder(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.slider_item, null);
        return new ImageAdapter.ImageAdapterViewHolder(inflate);
    }

    // Inside on bind view holder we will
    // set data to item of Slider View.
    @Override
    public void onBindViewHolder(ImageAdapter.ImageAdapterViewHolder viewHolder, final int position) {

        final ImageModel sliderItem = mSliderItems.get(position);


        // Glide is use to load image
        // from url in your imageview.
        String image_link = IMG_BASE_URL + sliderItem.getImage();

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

    static class ImageAdapterViewHolder extends SliderViewAdapter.ViewHolder {
        // Adapter class for initializing
        // the views of our slider view.
        View itemView;
        ImageView slider_image;

        public ImageAdapterViewHolder(View itemView) {
            super(itemView);
            slider_image = itemView.findViewById(R.id.slider_image);
            this.itemView = itemView;
        }
    }
}
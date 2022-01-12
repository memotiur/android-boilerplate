package com.eudocode.androidboilerplate.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.eudocode.androidboilerplate.R;
import com.eudocode.androidboilerplate.ui.PlaceOrderActivity;

public class OrderHistoryFragment extends Fragment {

    Button btnNext;
    Fragment fragment;

    public OrderHistoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_order_history, container, false);

        btnNext = view.findViewById(R.id.next);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fragment = new ProductDetailsFragment();
                loadFragment(fragment);

                //startActivity(new Intent(getActivity(), PlaceOrderActivity.class));
            }
        });


        return view;
    }


    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
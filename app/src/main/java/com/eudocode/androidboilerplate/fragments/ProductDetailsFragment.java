package com.eudocode.androidboilerplate.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.eudocode.androidboilerplate.R;
import com.eudocode.androidboilerplate.model.ProductModel;


public class ProductDetailsFragment extends Fragment {

    ProductModel productModel;
    Button btnNext;
    Fragment fragment;

    public ProductDetailsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {




        View view = inflater.inflate(R.layout.fragment_product_details, container, false);
        btnNext = view.findViewById(R.id.next);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fragment = new ProfileFragment();
                loadFragment(fragment);

                //startActivity(new Intent(getActivity(), PlaceOrderActivity.class));
            }
        });


        /*Receive Single Data*/
        //String value = getArguments().getString("YourKey");

        /*Bundle bundle = getArguments();
        productModel = (ProductModel) bundle.getSerializable("product_data");

        Log.d("TAG", "onCreateView: " + productModel.getProductName());
*/

        // Inflate the layout for this fragment
        return view;
    }

    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fframe_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
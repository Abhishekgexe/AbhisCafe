package com.example.abhiscafe.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.abhiscafe.R;
import com.example.abhiscafe.adapters.FeaturedAdapter;
import com.example.abhiscafe.adapters.FeaturedVerAdapter;
import com.example.abhiscafe.models.FeaturedModel;
import com.example.abhiscafe.models.FeaturedVerModel;

import java.util.ArrayList;
import java.util.List;

public class ThirdFragment extends Fragment {

    /////////////Featured Hor RecyclerView
    List<FeaturedModel> featuredModelList;
    RecyclerView recyclerView;
    FeaturedAdapter featuredAdapter;

    /////////////Featured Ver RecyclerView
    List<FeaturedVerModel> featuredVerModelList;
    RecyclerView recyclerView2;
    FeaturedVerAdapter featuredVerAdapter;


    public ThirdFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);


        /////////////Featured Hor RecyclerView

        recyclerView = view.findViewById(R.id.featured_hor_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false));
        featuredModelList = new ArrayList<>();

        featuredModelList.add(new FeaturedModel(R.drawable.chb, "Vannila Ice Cream", "10:00am - 23:00pm", "Chicken Hyedrabadi Biryani","North-Indian"));
        featuredModelList.add(new FeaturedModel(R.drawable.cl, "Vannila Ice Cream", "10:00am - 23:00pm", "Chicken Lollipop","Chinese"));
        featuredModelList.add(new FeaturedModel(R.drawable.sb, "Vannila Ice Cream", "10:00am - 23:00pm", "Sizziling Brownie","Sweets"));

        featuredAdapter = new FeaturedAdapter(featuredModelList);
        recyclerView.setAdapter(featuredAdapter);

        /////////////Featured Ver RecyclerView

        recyclerView2 = view.findViewById(R.id.featured_ver_rec);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));
        featuredVerModelList = new ArrayList<>();

        featuredVerModelList.add(new FeaturedVerModel(R.drawable.gj, "Falooda", "Gulab jamun", "Featured 1", "4.2","10:00am-8:00pm"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.ccc, "Falooda", "Cold coffee", "Featured 2", "4.5","10:00am-8:00pm"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.latte, "Falooda", "Latte", "Featured 3", "4.8","10:00am-8:00pm"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.capp, "Falooda", "Cappucciono", "Featured 1", "4.2","10:00am-8:00pm"));


        featuredVerAdapter = new FeaturedVerAdapter(featuredVerModelList);
        recyclerView2.setAdapter(featuredVerAdapter);

        return view;
    }
}
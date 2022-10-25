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

public class FirstFragment extends Fragment {

    /////////////Featured Hor RecyclerView
    List<FeaturedModel> featuredModelList;
    RecyclerView recyclerView;
    FeaturedAdapter featuredAdapter;

    /////////////Featured Ver RecyclerView
    List<FeaturedVerModel> featuredVerModelList;
    RecyclerView recyclerView2;
    FeaturedVerAdapter featuredVerAdapter;


    public FirstFragment() {
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

        featuredModelList.add(new FeaturedModel(R.drawable.vk, "Vannila Ice Cream", "10:00am - 23:00pm", "Veg Kholapuri","Indian Cuisine"));
        featuredModelList.add(new FeaturedModel(R.drawable.ctb, "Vannila Ice Cream", "10:00am - 23:00pm", "Chicken tikka biryani","Indian Cuisine"));
        featuredModelList.add(new FeaturedModel(R.drawable.cl, "Vannila Ice Cream", "10:00am - 23:00pm", "Chicken Lollipop","Chinese Starter"));

        featuredAdapter = new FeaturedAdapter(featuredModelList);
        recyclerView.setAdapter(featuredAdapter);

        /////////////Featured Ver RecyclerView

        recyclerView2 = view.findViewById(R.id.featured_ver_rec);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));
        featuredVerModelList = new ArrayList<>();

        featuredVerModelList.add(new FeaturedVerModel(R.drawable.pizza2,"Duble Cheese Pizza","Double Cheese Pizza","Pizzas","4.8","10am-8pm"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.pizza3, "Chicken Kheema Pizza", "Chicken Kheema Pizza", "Veg Cheese Pizza", "4.5", "10am-8pm"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.pizza4, "Chefs Special Pizza", "Chefs Special Pizza", "Chef's Special Pizza", "4.9", "10am-8pm"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.pizza1," Cheese Pizza","Double Cheese Pizza","Pizzas","4.8","10am-8pm"));


        featuredVerAdapter = new FeaturedVerAdapter(featuredVerModelList);
        recyclerView2.setAdapter(featuredVerAdapter);

        return view;
    }
}
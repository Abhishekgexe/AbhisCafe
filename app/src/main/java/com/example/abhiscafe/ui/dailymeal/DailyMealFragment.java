package com.example.abhiscafe.ui.dailymeal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.abhiscafe.R;
import com.example.abhiscafe.adapters.DailyMealAdapter;
import com.example.abhiscafe.models.DailyMealModel;

import java.util.ArrayList;
import java.util.List;

public class DailyMealFragment extends Fragment {

    RecyclerView recyclerView;
    List<DailyMealModel> dailyMealModels;
    DailyMealAdapter dailyMealAdapter;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.daily_meal_fragment,container,false);

        recyclerView = root.findViewById(R.id.daily_meal_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dailyMealModels = new ArrayList<>();

        dailyMealModels.add(new DailyMealModel(R.drawable.breakfast,"Breakfast","25% OFF","Try our chefs choice to start your day with!","breakfast"));
        dailyMealModels.add(new DailyMealModel(R.drawable.lunch,"Lunch","50% OFF","Get your mid-day hungers solution here!","lunch"));
        dailyMealModels.add(new DailyMealModel(R.drawable.dinner,"Dinner","20% OFF","Get your dinner done right, Click here!","dinner"));
        dailyMealModels.add(new DailyMealModel(R.drawable.sweets,"Sweets","35% OFF","Sugars paradise","sweets"));
        dailyMealModels.add(new DailyMealModel(R.drawable.coffe,"Coffee","20% OFF","Just coffee!!!","coffee"));

        dailyMealAdapter = new DailyMealAdapter(getContext(),dailyMealModels);
        recyclerView.setAdapter(dailyMealAdapter);
        dailyMealAdapter.notifyDataSetChanged();

        return root;
    }
}
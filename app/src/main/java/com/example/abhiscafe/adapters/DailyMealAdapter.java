package com.example.abhiscafe.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.abhiscafe.R;
import com.example.abhiscafe.activities.DetailedDailyMealActivity;
import com.example.abhiscafe.models.DailyMealModel;

import java.util.List;

public class DailyMealAdapter extends RecyclerView.Adapter<DailyMealAdapter.ViewHolder> {

    Context context;
    List<DailyMealModel> list;

    public DailyMealAdapter(Context context, List<DailyMealModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.daily_meal_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.imageView.setImageResource(list.get(holder.getAdapterPosition()).getImage());
        holder.name.setText(list.get(holder.getAdapterPosition()).getName());
        holder.discount.setText(list.get(holder.getAdapterPosition()).getDiscount());
        holder.description.setText(list.get(holder.getAdapterPosition()).getDescription());

        holder.itemView.setOnClickListener(view -> {
            Intent intent = new Intent(context, DetailedDailyMealActivity.class);
            intent.putExtra("type",list.get(holder.getAdapterPosition()).getType());
            context.startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class  ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name,description,discount;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageview);
            name = itemView.findViewById(R.id.textView10);
            description = itemView.findViewById(R.id.textView11);
            discount = itemView.findViewById(R.id.discount);

        }
    }
}

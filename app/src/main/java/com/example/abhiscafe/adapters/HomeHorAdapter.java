package com.example.abhiscafe.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.abhiscafe.R;
import com.example.abhiscafe.models.HomeHorModel;
import com.example.abhiscafe.models.HomeVerModel;

import java.util.ArrayList;

public class HomeHorAdapter extends RecyclerView.Adapter<HomeHorAdapter.ViewHolder> {


    UpdateVerticalRec updateVerticalRec;
    Activity activity;
    ArrayList<HomeHorModel> list;


    boolean check = true;
    boolean select = true;
    int row_index = -1;


    public HomeHorAdapter(UpdateVerticalRec updateVerticalRec, Activity activity, ArrayList<HomeHorModel> list) {
        this.updateVerticalRec = updateVerticalRec;
        this.activity = activity;
        this.list = list;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_horizontal_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.imageView.setImageResource(list.get(holder.getAdapterPosition()).getImage());
        holder.name.setText(list.get(holder.getAdapterPosition()).getName());

        if (check) {
            ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
            homeVerModels.add(new HomeVerModel(R.drawable.pizza1, " Double Cheese Pizza", "10:00am - 23:00pm", "4.8", "₹289"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza2, "Chicken Pepperoni Pizza", "10:00am - 23:00pm", "4.7", "₹449"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza3, "Veg Cheese Pizza", "10:00am - 23:00pm", "4.5", "₹199"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza4, "Chef's Special Pizza", "8:00am -10:00pm", "4.9", "₹599"));

            updateVerticalRec.callBack(holder.getAdapterPosition(), homeVerModels);
            check = false;
        }
            holder.cardView.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    row_index = holder.getAdapterPosition();
                    notifyDataSetChanged();
//                    //Toast.makeText(activity.getApplicationContext(), String.valueOf(row_index), Toast.LENGTH_LONG).show();
                    if (row_index == 0) {
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza1, " Double Cheese Pizza", "10:00am - 23:00pm", "4.8", "₹289"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza2, "Chicken Pepperoni Pizza", "10:00am - 23:00pm", "4.7", "₹449"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza3, "Veg Cheese Pizza", "10:00am - 23:00pm", "4.5", "₹199"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza4, "Chef's Special Pizza", "8:00am -10:00pm", "4.9", "₹599"));

                        updateVerticalRec.callBack(holder.getAdapterPosition(), homeVerModels);
                    }

                    else if (row_index == 1) {
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.burger1, "Chicken Burger", "10:00am - 22:00pm", "4.9", "₹129"));
                        homeVerModels.add(new HomeVerModel(R.drawable.burger2, "Chicken Ham Cheese Burger", "10:00am - 19:00pm", "4.5", "₹189"));
                        homeVerModels.add(new HomeVerModel(R.drawable.burger4, "Paneer Tikka Burger", "10:00am - 22:00pm", "4.4", "₹99"));

                        updateVerticalRec.callBack(holder.getAdapterPosition(), homeVerModels);
                    }

                    else if (row_index == 2) {
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.fries1, "Indian Masala Fries", "10:00am - 22:00pm", "4.9", "₹119"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fries2, "Peri Peri Fries", "10:00am - 22:00pm", "4.5", "₹149"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fries3, "Indi-Mexican Fries", "10:00am - 22:00pm", "4.2", "₹139"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fries4, "Cheesey Cheese Fries", "10:00am - 22:00pm", "4.0", "₹`149"));

                        updateVerticalRec.callBack(holder.getAdapterPosition(), homeVerModels);
                    }

                    else if (row_index == 3) {
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.ch_ice, "Chocalate Ice Cream", "10:00am - 23:00pm", "4.9", "₹99"));
                        homeVerModels.add(new HomeVerModel(R.drawable.icecream2, "ButterScotch Ice Cream", "10:00am - 23:00pm", "4.5", "₹129"));
                        homeVerModels.add(new HomeVerModel(R.drawable.icecream3, "Vannila Ice Cream", "10:00am - 23:00pm", "4.7", "₹99"));

                        updateVerticalRec.callBack(holder.getAdapterPosition(), homeVerModels);
                    }

                    else if (row_index == 4) {
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich1, "Veg Cheese Grill Sandwich", "10:00am - 20:00pm", "4.7", "₹199"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich2, "Cheese Sandwich", "10:00am - 20:00pm", "4.8", "₹149"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich3, "Plain Toast Sandwich", "10:00am - 20:00pm", "4.4", "₹129"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich4, "Melting Cheese Sandwich", "10:00am - 20:00pm", "4.6", "₹219"));

                        updateVerticalRec.callBack(holder.getAdapterPosition(), homeVerModels);
                    }
                }

            });
        if (select) {
            if (holder.getAdapterPosition() == 0){
                holder.cardView.setBackgroundResource(R.drawable.change_bg);
                select = false;
            }
        }
        else {
            if (row_index == holder.getAdapterPosition()) {
                holder.cardView.setBackgroundResource(R.drawable.change_bg);
            } else {
                holder.cardView.setBackgroundResource(R.drawable.default_bg);

            }

        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {


        ImageView imageView;
        TextView name;
        CardView cardView;
        

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.hor_img);
            name = itemView.findViewById(R.id.hor_text);
            cardView = itemView.findViewById(R.id.cardView);

        }
    }
}

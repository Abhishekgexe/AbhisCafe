package com.example.abhiscafe.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.abhiscafe.R;
import com.example.abhiscafe.models.DetailedDailyModel;

import java.util.List;

public class DetailedDailyAdapter extends RecyclerView.Adapter<DetailedDailyAdapter.ViewHolder> {


    List<DetailedDailyModel> list;
    private ItemListner clickListener;
    private Context mContext;



    public DetailedDailyAdapter(List<DetailedDailyModel> list,Context context) {

        this.list = list;
        this.mContext = context;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        Button addedtocart = parent.findViewById(R.id.addss);
//        addedtocart.setOnClickListener(this);
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.detailed_daily_meal_item,parent,false));




    }





    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {


        holder.imageView.setImageResource ( list.get ( position ) .getImage ( ) ) ;
        holder.price.setText ( list.get ( position ) .getPrice ( ) ) ;
        holder.name.setText ( list.get ( position ) .getName ( ) ) ;
        holder.description.setText ( list.get ( position ) .getDescription ( ) ) ;
        holder.timing.setText ( list.get ( position ) .getTiming ( ) ) ;
        holder.rating.setText ( list.get ( position ) .getRating ( ) ) ;



    }



    @Override
    public int getItemCount() {
        return list.size();
    }

    public void setClickListener(ItemListner itemClickListener) {
        this.clickListener = itemClickListener;

    }


//    @Override
//    public void onClick(View v) {
//
//
//
//
//    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView imageView;
        TextView name,price,description,rating,timing,button;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.detailed_img);
            name = itemView.findViewById(R.id.detailed_name);
            price = itemView.findViewById(R.id.detailed_price);
            description = itemView.findViewById(R.id.detailed_des);
            rating = itemView.findViewById(R.id.detailed_rating);
            timing = itemView.findViewById(R.id.detailed_timing);
            button = itemView.findViewById(R.id.addss);
            button.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            Toast.makeText(v.getContext(), "Added to Cart", Toast.LENGTH_SHORT).show();
        }
    }


}

// interface ClickHandler {
//    void onMyButtonClicked(final int position);
//}

package com.example.abhiscafe.adapters;

import  android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.abhiscafe.R;
import com.example.abhiscafe.models.CartModel;
import com.example.abhiscafe.models.HomeVerModel;
import com.example.abhiscafe.ui.ManagementCart;

import java.util.ArrayList;
import java.util.List;

public class    CartAdapter extends RecyclerView.Adapter<CartAdapter.ViewHolder>{
//    private ArrayList<HomeVerModel> homeVerModels;
//    private ManagementCart managementCart;
//
//    public CartAdapter(ArrayList<HomeVerModel> homeVerModels, ManagementCart managementCart) {
//        this.homeVerModels = homeVerModels;
//        this.managementCart = managementCart;
//    }
//
//
//    @Override
//    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View inflate=LayoutInflater.from(parent.getContext()).inflate(R.layout.home_vertical_item,parent,false);
//        return new ViewHolder(inflate);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        holder.title.setText(homeVerModels.get(position).getName());
//        int drawableResourceId=holder.itemView.getContext().getResources().getIdentifier(homeVerModels.get(position).getImage()
//                ,"drawable",holder.itemView.getContext().getPackageName());
//
//
//
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return homeVerModels.size();
//    }
//
//    public class ViewHolder extends RecyclerView.ViewHolder{
//
//        TextView title;
//        ImageView pic;
//        public ViewHolder(@NonNull View itemView) {
//            super(itemView);
//            title=itemView.findViewById(R.id.name);
//            pic=itemView.findViewById(R.id.ver_img);
//
//        }
//    }
//
//}

    List<CartModel> list;

    public CartAdapter(List<CartModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.mycart_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());
        holder.rating.setText(list.get(position).getRating());
        holder.price.setText(list.get(position).getPrice());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name,rating,price;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.detailed_img);
            name = itemView.findViewById(R.id.detailed_name);
            rating = itemView.findViewById(R.id.detailed_rating);
            price = itemView.findViewById(R.id.textView14);
        }

    }
}

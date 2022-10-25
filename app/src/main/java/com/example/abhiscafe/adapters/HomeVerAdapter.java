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
import com.example.abhiscafe.models.HomeVerModel;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.zip.Inflater;

public class HomeVerAdapter extends RecyclerView.Adapter<HomeVerAdapter.ViewHolder> {

    private BottomSheetDialog bottomSheetDialog;
    private Button addtocart;


    Context context;
    ArrayList<HomeVerModel> list;

    public HomeVerAdapter(Context context, ArrayList<HomeVerModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_vertical_item, parent, false));

    }



    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        final String mName = list.get(position).getName();
        final String mTiming = list.get(position).getTiming();
        final String mRating = list.get(position).getRating();
        final String mPrice = list.get(position).getPrice();
        final int mImage = list.get(position).getImage();

        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());
        holder.timing.setText(list.get(position).getTiming());
        holder.rating.setText(list.get(position).getRating());
        holder.price.setText(list.get(position).getPrice());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                bottomSheetDialog = new BottomSheetDialog(context,R.style.BottomSheetTheme);

                    View sheetView = LayoutInflater.from(context).inflate(R.layout.bottom_sheet_layout, null);
                    sheetView.findViewById(R.id.add_to_cart).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Toast.makeText(context, "Added to Cart", Toast.LENGTH_SHORT).show();
                            bottomSheetDialog.dismiss();
                        }






//                        addtocart=(Button)findViewById(R.id.addtocartbtn);
//                        addtocart.setOnClickListener(new View.OnClickListener() {
//                            @Override
//                            public void onClick(View v) {
//                                Cart cart=new Cart();
//                                cart.setId(id);
//                                cart.setImageid(imageurl);
//                                cart.setName(prname);
//                                cart.setPrice(prprice);
//                                if (MainActivity.myDatabase.cartDao().isAddToCart(id)!=1){
//                                    MainActivity.myDatabase.cartDao().addToCart(cart);
//                                }else {
//                                    Toast.makeText(AddTocartActivity.this, "You are Already added to cart!", Toast.LENGTH_SHORT).show();
//
//                                }
//                            }
//                        });

                    });



                    ImageView bottomImg = sheetView.findViewById(R.id.bottom_img);
                    TextView bottomName = sheetView.findViewById(R.id.bottom_name);
                TextView bottomRating = sheetView.findViewById(R.id.bottom_rating);
                TextView bottomTiming = sheetView.findViewById(R.id.bottom_timing);
                TextView bottomPrice = sheetView.findViewById(R.id.bottom_price);


                bottomName.setText(mName);
                bottomPrice.setText(mPrice);
                bottomRating.setText(mRating);
                bottomTiming.setText(mTiming);
                bottomImg.setImageResource(mImage);

                bottomSheetDialog.setContentView(sheetView);
                bottomSheetDialog.show();







            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name,timing,rating,price;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.ver_img);
            name = itemView.findViewById(R.id.name);
            timing = itemView.findViewById(R.id.timing);
            rating = itemView.findViewById(R.id.rating);
            price = itemView.findViewById(R.id.price);
        }
    }
}

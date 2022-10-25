package com.example.abhiscafe.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.ColorSpace;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.abhiscafe.Checkout;
import com.example.abhiscafe.R;
import com.example.abhiscafe.adapters.DetailedDailyAdapter;
import com.example.abhiscafe.models.DetailedDailyModel;
import com.example.abhiscafe.ui.MyCartFragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.jar.Attributes;

public class DetailedDailyMealActivity extends AppCompatActivity {

    RecyclerView recyclerView ;
    List<DetailedDailyModel> detailedDailyModelList;
    DetailedDailyAdapter dailyAdapter;
    ImageView imageView;
  //  Button addedtocart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_daily_meal);

//        addtocart=findViewById(R.id.add);
//        addtocart.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                addedtocart();
//            }
//        });

//        addedtocart=(Button)findViewById(R.id.addss);
//        addedtocart.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),  "Added to Cart", Toast.LENGTH_SHORT).show();
////                Intent intent=new Intent(getApplicationContext(), MyCartFragment.class);
////                startActivity(intent);
//                finish();
//
//            }
//        });

//        addedtocart.findViewById(R.id.addss).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                Toast.makeText(getApplicationContext(),  "Added to Cart", Toast.LENGTH_SHORT).show();
////                finish();
//            }
//        });

//        Button addedtocart=(Button) findViewById(R.id.addss);
//        addedtocart.setText("Added to cart");





        getSupportActionBar().hide();
        String type = getIntent().getStringExtra("type");

        recyclerView = findViewById(R.id.detailed_rec);
        imageView = findViewById(R.id.detailed_img1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        detailedDailyModelList = new ArrayList<>();
        dailyAdapter = new DetailedDailyAdapter(detailedDailyModelList,getApplicationContext());
        recyclerView.setAdapter(dailyAdapter);

        if (type != null && type.equalsIgnoreCase("breakfast")){

            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.idli,"Idli-Wada","South cuisine","4.8","80","10am- 12pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.btdosa,"Butter Dosa","South cuisine","4.5","50","10am - 12pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.btmdosa,"Butter Masala Dosa","South cuisine","4.9","60","10am - 12pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.vgsand,"veg-Sandwich","Light-food","4.4","60","10am - 12pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.oats,"Oats","Paradise of dry-fruits & Nutrients","4.9","99","10am - 12pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.eggs,"Egss with bread","Protien rich","4.1","99","10am - 12pm"));



            dailyAdapter.notifyDataSetChanged();


        }

        if (type != null && type.equalsIgnoreCase("lunch")){

            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.ctm,"Chicken Tikka Masala ","North cuisine","4.8","180","10am- 4pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.cl,"Chicken Lollipop","Chinese cuisine","4.5","200","10am - 4pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.vt,"Veg-Thali","Indian cuisine","4.9","249","10am - 4pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.mk ,"Malai Kofta","Mouth Watering","4.4","199","10am - 4pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.mutnk,"Mutton Kheema","Recommended","4.4","309","10am - 4pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.btrk ,"Butter Kulcha","Bread","4.9","45","10am - 4pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.rumali,"Rumali roti","Bread","4.1","35","10am - 4pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.ctb,"Chicken Tikka Biryani","North cuisine","4.8","250","10am- 4pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.chb,"Chicken Hyedrabadi Biryani","North-Cuisine","4.5","200","10am - 4pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.vp,"Veg-Pulao","Indian cuisine","4.9","199","10am - 4pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.jr ,"Jeera rice","Rice","4.4","120","10am - 4pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.sr,"Steam rice","Rice","4.4","100","10am - 4pm"));


            dailyAdapter.notifyDataSetChanged();


        }

        if (type != null && type.equalsIgnoreCase("dinner")){

            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.vp,"Veg-Pulao","Indian cuisine","4.9","199","10am - 4pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.vk,"Veg-Kholapuri","North-Cuisine","4.1","159","10am - 4pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.bn ,"Butter Naan","Bread","4.9","45","10am - 4pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.mk ,"Malai Kofta","Mouth Watering","4.4","199","10am - 4pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.ctb,"Chicken Tikka Biryani","North cuisine","4.8","250","10am- 4pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.jr ,"Jeera rice","Rice","4.4","120","10am - 4pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.rumali,"Rumali roti","Bread","4.1","35","10am - 4pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.chb,"Chicken Hyedrabadi Biryani","North-Cuisine","4.5","200","10am - 4pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.vt,"Veg-Thali","Indian cuisine","4.9","249","10am - 4pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.ctm,"Chicken Tikka Masala ","North cuisine","4.8","180","10am- 4pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.cl,"Chicken Lollipop","Chinese cuisine","4.5","200","10am - 4pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.mutnk,"Mutton Kheema","Recommended","4.4","309","10am - 4pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.btrk ,"Butter Kulcha","Bread","4.9","45","10am - 4pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.sr,"Steam rice","Rice","4.4","100","10am - 4pm"));
            dailyAdapter.notifyDataSetChanged();


        }

        if (type != null && type.equalsIgnoreCase("sweets")){

            //imageView.setImageResource(R.drawable.sweets);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.cc,"Caramel Custard","Worlds Best","4.8","99","10am - 12am"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s2,"Donuts","popular","4.8","60","10am - 12am"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.cp,"Chocolate Pastry","Cake","4.8","50","10am - 12am"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.sb,"Sizziling Brownie","Delight to eyes+stomach","4.8","199","10am - 12am"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.rsg,"Rasgulla","Bengali Cuisine","4.8","70","10am - 12am"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fld,"Falooda","Popular","4.8","120","10am - 12am"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.gj,"Gulab Jamun","sweet","4.8","60","10am - 12am"));

            dailyAdapter.notifyDataSetChanged();
        }
//
        if (type != null && type.equalsIgnoreCase("coffee")){

           // imageView.setImageResource(R.drawable.sweets);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.bc,"Black Coffee","Coffee","4.8","99","10am - 8pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.ccc,"Cold Coffee","Coffee","4.8","119","10am - 8pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.latte,"Latte","Coffee","4.8","150","10am - 8pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.exp,"Espresso","Coffee","4.8","120","10am - 8pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.capp,"Cappuccino","Coffee","4.8","199","10am - 8pm"));

            dailyAdapter.notifyDataSetChanged();
        }
    }}

//    private void addedtocart() {
//        final HashMap<String,Object>cartMap = new HashMap<>();
//        cartMap.put("ProductName", ViewModel)
//    }
//}
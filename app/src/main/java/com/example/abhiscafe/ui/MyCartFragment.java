package com.example.abhiscafe.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.abhiscafe.Checkout;
import com.example.abhiscafe.R;
import com.example.abhiscafe.adapters.CartAdapter;
import com.example.abhiscafe.models.CartModel;

import java.util.ArrayList;
import java.util.List;

public class MyCartFragment extends Fragment{
    private Button buttonPlaceorder;
//
//    @Override
//            public View onCreateView(LayoutInflater inflater,ViewGroup container,
//                                     Bundle savedInstanceState){
//        View view=inflater.inflate(R.layout.fragment_my_cart,container,false);
//       buttonPlaceorder=(Button)View.findViewById(R.id.W1);
//
//    }

//    private RecyclerView.Adapter adapter;
//    private RecyclerView recyclerViewList;
//    private ManagementCart managementCart;
//    TextView taxTxt,deliveryTxt,TotalTxt,emptyTxt;
//    private double tax;
//    private ScrollView scrollView;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState){
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.fragment_my_cart);
//
//        managementCart=new ManagementCart(this);
//
//        initView();
//
//    }
//
//    private void initView() {
//        recyclerViewList=findViewById(R.id.cart_rec);
//        TotalTxt=findViewById(R.id.totalFeeTxt3);
//        taxTxt=findViewById(R.id.totalFeeTxt2);
//        deliveryTxt=findViewById(R.id.totalFeeTxt);
//        emptyTxt=findViewById(R.id.emptytxt);
//        scrollView=findViewById(R.id.scrollviewcart);
//    }
//
//    private void initList(){
//        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
//        recyclerViewList.setLayoutManager(linearLayoutManager);
//        adapter=
//
//    }
//}

    List<CartModel> list;
    CartAdapter cartAdapter;
    RecyclerView recyclerView;


    public MyCartFragment() {
        // Required empty public constructor
    }
    private Button Placeorder;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      //   Inflate the layout for this fragment



        View view = inflater.inflate(R.layout.fragment_my_cart, container, false);
        Button button=(Button)view.findViewById(R.id.W1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }

        });
//
//
        Button Placeorder=view.findViewById(R.id.W1);
        Placeorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyCartFragment.this.getActivity(),Checkout.class);
                startActivity(intent);

            }
        });




        recyclerView = view.findViewById(R.id.cart_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        list = new ArrayList<>();
        list.add(new CartModel(R.drawable.pizza4,"Chef's Special Pizza","599","4.9"));
        list.add(new CartModel(R.drawable.burger2,"Chicken Ham Cheese Burger","189","4.5"));
        list.add(new CartModel(R.drawable.fries1,"Indian Masala Fries","119","4.9"));
        list.add(new CartModel(R.drawable.ch_ice,"Chocolate Ice Cream","99","4.9"));

        list.add(new CartModel(R.drawable.sandwich4,"melting cheese Sandwich","219","4.6"));

        list.add(new CartModel(R.drawable.idli,"Idli-Wada","80","4.8"));
        list.add(new CartModel(R.drawable.ctm,"Chicken Tikka Masala","180","4.8"));
        list.add(new CartModel(R.drawable.btrk,"Butter Kulcha","45","4.9"));
        list.add(new CartModel(R.drawable.vk,"Veg-Kholapuri","159","4.1"));
        list.add(new CartModel(R.drawable.cc,"Caramel custard","99","4.8 "));
//        list.add(new CartModel(R.drawable.s3,"Order 3","100","4.7"));
//        list.add(new CartModel(R.drawable.fav1,"Order 4","120","4.2"));
//        list.add(new CartModel(R.drawable.fav2,"Order 5","250","4.8"));
//        list.add(new CartModel(R.drawable.fav3,"Order 6","180","4.6"));
        cartAdapter = new CartAdapter(list);
        recyclerView.setAdapter(cartAdapter);







        return view;


    }}

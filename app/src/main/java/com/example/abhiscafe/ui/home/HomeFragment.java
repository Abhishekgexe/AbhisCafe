package com.example.abhiscafe.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.abhiscafe.R;
import com.example.abhiscafe.adapters.HomeHorAdapter;
import com.example.abhiscafe.adapters.HomeVerAdapter;
import com.example.abhiscafe.adapters.UpdateVerticalRec;
import com.example.abhiscafe.models.HomeHorModel;
import com.example.abhiscafe.models.HomeVerModel;
import com.example.abhiscafe.ui.MyCartFragment;

import java.util.ArrayList;

public class HomeFragment extends Fragment implements UpdateVerticalRec {

    RecyclerView homeHorizontalRec,homeVerticalRec;
    ArrayList<HomeHorModel> homeHorModelList;
    HomeHorAdapter homeHorAdapter;


    private Button mycart;


    ///////////vertical
    ArrayList<HomeVerModel> homeVerModelList;
    HomeVerAdapter homeVerAdapter;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {





        View root = inflater.inflate(R.layout.fragment_home,container,false);

        mycart=root.findViewById(R.id.mycart);
        mycart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(getId() ,new MyCartFragment());
                fr.commit();
            }
        });
//
//        Fragment fragment = new MyCartFragment();
//        FragmentTransaction transaction=getFragmentManager().beginTransaction();
//        transaction.replace(R.id.mycart,MyCartFragment.class)
//
//

//        Button button=(Button)root.findViewById(R.id.mycart);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                getParentFragmentManager().beginTransaction().replace(R.id.)
//                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
//                fragmentTransaction.replace(R.id.,new MyCartFragment());
//                fragmentTransaction.commit();
//                Intent intent=new Intent(getActivity(), MyCartFragment.class);
//                v.getContext().startActivity(intent);

//
//            }
//        });
//


        homeHorizontalRec = root.findViewById(R.id.home_hor_rec);
        homeVerticalRec = root.findViewById(R.id.home_ver_rec);


//        Intent intent=new Intent(getActivity(), MyCartFragment.class);
//        startActivity(intent);


        ///////////////Horizontal RecyclerView
        homeHorModelList = new ArrayList<>();

        homeHorModelList.add(new HomeHorModel(R.drawable.pizza,"pizza"));
        homeHorModelList.add(new HomeHorModel(R.drawable.hamburger,"Burgers"));
        homeHorModelList.add(new HomeHorModel(R.drawable.fried_potatoes,"Fries"));
        homeHorModelList.add(new HomeHorModel(R.drawable.ice_cream,"Ice Cream"));
        homeHorModelList.add(new HomeHorModel(R.drawable.sandwich,"Sandwich"));

        homeHorAdapter = new HomeHorAdapter(this,getActivity(), homeHorModelList);
        homeHorizontalRec.setAdapter(homeHorAdapter);
        homeHorizontalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));
        homeHorizontalRec.setHasFixedSize(true);
        homeHorizontalRec.setNestedScrollingEnabled(false);


        ///////////////Horizontal RecyclerView

        homeVerModelList = new ArrayList<>();


        homeVerAdapter = new HomeVerAdapter(getActivity(),homeVerModelList);
        homeVerticalRec.setAdapter(homeVerAdapter);
        homeVerticalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false));

        return root;


    }



    @Override
    public void callBack(int position, ArrayList<HomeVerModel> list) {

        homeVerAdapter = new HomeVerAdapter(getContext(),list);
        homeVerAdapter.notifyDataSetChanged();
        homeVerticalRec.setAdapter(homeVerAdapter);

    }




}
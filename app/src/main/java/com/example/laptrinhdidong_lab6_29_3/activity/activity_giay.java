package com.example.laptrinhdidong_lab6_29_3.activity;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.laptrinhdidong_lab6_29_3.R;
import com.example.laptrinhdidong_lab6_29_3.dapater.adaper_giay;
import com.example.laptrinhdidong_lab6_29_3.model.item;

import java.util.ArrayList;
import java.util.List;

public class activity_giay extends AppCompatActivity {
    private List<item> listItem;
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_potrait_a_main);
        listView=findViewById(R.id.listview);
        listItem= new ArrayList<>();
        listItem.add(new item(1,R.drawable.shoes_rm_preview_b,"Nike shoes-discount 50%","Pls touch to see detail"));
        listItem.add(new item(2,R.drawable.shoes_rm_preview_a,"Adidas shoes-discount 80%","Pls touch to see detail"));
        listItem.add(new item(3,R.drawable.shoes_rm_purple,"Nike Bicycle-discount 30%","Pls touch to see detail"));
        listItem.add(new item(4,R.drawable.shoes_rm_preview,"Yonex shoes-discount 50%","Pls touch to see detail"));
        listItem.add(new item(5,R.drawable.shoes_rm_yellow,"Victor shoes-discount 50%","Pls touch to see detail"));
        listItem.add(new item(6,R.drawable.shoes_white_removebg_preview,"Lining shoes-discount 50%","Pls touch to see detail"));
        listItem.add(new item(7,R.drawable.color_removebg_preview,"Binh Minh shoes-discount 90%","Pls touch to see detail"));
        adaper_giay adapter= new adaper_giay(listItem,this,R.layout.fragment_potrait_a_listview);
        listView.setAdapter(adapter);
    }
}

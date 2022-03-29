package com.example.laptrinhdidong_lab6_29_3.dapater;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.laptrinhdidong_lab6_29_3.R;
import com.example.laptrinhdidong_lab6_29_3.model.item;

import java.util.List;

public class adaper_giay extends BaseAdapter {
    private List<item> listItem;
    private Context context;
    private int idlayout;
    private int poistionSelect=-1;

    public adaper_giay(List<item> listItem, Context context, int idlayout) {
        this.listItem = listItem;
        this.context = context;
        this.idlayout = idlayout;
    }

    @Override
    public int getCount() {
        if(listItem.size()!=0 && !listItem.isEmpty())
        {
            return listItem.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null)
        {
            convertView = LayoutInflater.from(parent.getContext()).inflate(idlayout, parent, false);
        }
        ImageView img = convertView.findViewById(R.id.imggiay);
        TextView dis1 = convertView.findViewById(R.id.dis1);
        TextView dis2 = convertView.findViewById(R.id.dis2);
        ConstraintLayout constraintLayout = convertView.findViewById(R.id.idConstraintLayout);
        item Item= listItem.get(position);
        if (listItem!=null&& listItem.isEmpty())
        {
            img.setImageResource(Item.getImg());
            dis1.setText(Item.getDis1());
            dis2.setText(Item.getDis2());
        }
        return convertView;
    }
}

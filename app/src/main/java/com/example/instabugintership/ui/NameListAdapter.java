package com.example.instabugintership.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instabugintership.R;
import com.example.instabugintership.pojo.NameModel;

import java.util.ArrayList;

public class NameListAdapter extends RecyclerView.Adapter<NameListAdapter.NameViewHolder> {

    private ArrayList<NameModel> nameList = new ArrayList<>();


    @NonNull
    @Override
    public NameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NameViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull NameViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return nameList.size();
    }

    public void setList(ArrayList<NameModel> NameList) {
        this.nameList = nameList;
        notifyDataSetChanged();
    }


    public class NameViewHolder extends RecyclerView.ViewHolder {
        TextView textName;

        public NameViewHolder(@NonNull View itemView) {
            super(itemView);
            textName = itemView.findViewById(R.id.name_TV);

        }
    }
}

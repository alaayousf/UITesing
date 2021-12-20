package com.testing.uitest;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class adapter_ListData extends RecyclerView.Adapter<adapter_ListData.VotingListViewHolde> {

    ArrayList<Model> mData;
    Activity activity;


    public adapter_ListData(ArrayList<Model> mData, Activity activity) {
        this.mData = mData;
        this.activity = activity;
    }

    @NonNull
    @Override
    public VotingListViewHolde onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(activity).inflate(R.layout.list_item,parent,false);
        return new VotingListViewHolde(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull VotingListViewHolde holder, int position) {
        holder.myTextView.setText(mData.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class VotingListViewHolde extends RecyclerView.ViewHolder{

        TextView myTextView;


        public VotingListViewHolde(@NonNull View itemView) {
            super(itemView);
            myTextView = itemView.findViewById(R.id.ItemNumper);

        }
    }
}

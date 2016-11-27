package com.example.sah.les_4;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private String[] mDataset1;
    private String[] mDataset2;

    public MyAdapter(String[] dataset1, String[] dataset2) {
        mDataset1 = dataset1;
        mDataset2 = dataset2;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_view, parent, false);


        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.place.setText(mDataset1[position]);
        holder.name.setText(mDataset2[position]);

    }

    @Override
    public int getItemCount() {
        return mDataset1.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView place;
        public TextView name;

        public ViewHolder(View v) {
            super(v);
            place = (TextView) v.findViewById(R.id.recycler_place);
            name = (TextView) v.findViewById(R.id.recycler_text);
            v.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(v.getContext(), "Место " + place.getText().toString() + " " + name.getText().toString(), Toast.LENGTH_SHORT).show();
        }
    }
}
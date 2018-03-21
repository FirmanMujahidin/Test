package com.example.firma.testapp.Adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.firma.testapp.Main2Activity;
import com.example.firma.testapp.Model.ListModel;
import com.example.firma.testapp.R;

import java.util.List;

/**
 * Created by firman on 20-Mar-18.
 */

public class AdapterItem extends RecyclerView.Adapter<AdapterItem.ViewHolder> {

    List<ListModel.StationBeanList> mResault;
    Context mContext;

    public AdapterItem(List<ListModel.StationBeanList> mResault, Context mContext) {
        this.mResault = mResault;
        this.mContext = mContext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_list, null);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        holder.mName.setText(mResault.get(position).getStationName());
        holder.mValue.setText(mResault.get(position).getStatusValue());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Main2Activity.class);
                intent.putExtra("name", mResault.get(position).getStationName());
                intent.putExtra("value", mResault.get(position).getStatusValue());
                intent.putExtra("address", mResault.get(position).getStAddress1());
                intent.putExtra("time", mResault.get(position).getLastCommunicationTime());
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                v.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mResault == null ? 0 : mResault.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView mName,mValue;

        public ViewHolder(View itemView) {
            super(itemView);

            mName = (TextView) itemView.findViewById(R.id.name);
            mValue = (TextView) itemView.findViewById(R.id.value);
        }
    }
}

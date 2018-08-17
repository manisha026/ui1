package com.example.thakur.ui1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Thakur on 7/5/2018.
 */

public class DemoAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    ArrayList<ModelClass> data;
    Context context;

    public DemoAdapter(Context context,ArrayList<ModelClass>data) {

        this.context=context;
        this.data=data;

        // super(context);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ModelClass modelClass=new ModelClass();
        modelClass.getName();
        modelClass.getUi_ux();
        modelClass.getExperience();
        modelClass.getChandigarh();
        modelClass.getFace();
        modelClass.getContact();
        modelClass.getAdd();
        modelClass.getMessage();

        MyViewHolder holder=new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.single_item,parent,false));
        return holder;
//        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        MyViewHolder myviewHolder=(MyViewHolder)holder;
        myviewHolder.name.setText(data.get(position).getName());
        myviewHolder.ui_ux.setText(data.get(position).getUi_ux());
        myviewHolder.experience.setText(data.get(position).getExperience());
        myviewHolder.chandigarh.setText(data.get(position).getChandigarh());
        myviewHolder.face.setImageResource(data.get(position).getFace());
        myviewHolder.add.setImageResource(data.get(position).getAdd());
        myviewHolder.contact.setImageResource(data.get(position).getContact());
        myviewHolder.message.setImageResource(data.get(position).getMessage());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView face,contact,add,message;
        TextView name,ui_ux,experience,chandigarh;

        public MyViewHolder(View itemView) {
            super(itemView);

            face=itemView.findViewById(R.id.face);
            contact=itemView.findViewById(R.id.contact);
            add=itemView.findViewById(R.id.add);
            message=itemView.findViewById(R.id.message);
            name=itemView.findViewById(R.id.name);
            ui_ux=itemView.findViewById(R.id.ui_ux);
            experience=itemView.findViewById(R.id.experience);
            chandigarh=itemView.findViewById(R.id.chandigarh);

        }
    }
}

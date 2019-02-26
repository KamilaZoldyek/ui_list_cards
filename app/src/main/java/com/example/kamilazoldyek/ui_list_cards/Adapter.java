package com.example.kamilazoldyek.ui_list_cards;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.myViewHolder> {


    Context context;
    List<Item> mData;

    public Adapter(Context context, List<Item> mData) {
        this.context = context;
        this.mData = mData;
    }

    @NonNull
    @Override
    public Adapter.myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.card_item, parent, false);
        return new myViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.myViewHolder holder, int position) {

        holder.background_img.setImageResource(mData.get(position).getBackground());
        holder.profile_photo.setImageResource(mData.get(position).getProfilePhoto());
        holder.tv_title.setText(mData.get(position).getProfileName());
        holder.tv_nbFollowers.setText(mData.get(position).getNbFollowers()+" Followers");


    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class myViewHolder extends RecyclerView.ViewHolder{

        ImageView profile_photo, background_img;
        TextView tv_title, tv_nbFollowers;

        public myViewHolder(View itemView) {
            super(itemView);

            profile_photo = itemView.findViewById(R.id.profile_img);
            background_img= itemView.findViewById(R.id.card_background);
            tv_title = itemView.findViewById(R.id.card_title);
            tv_nbFollowers = itemView.findViewById(R.id.card_nb_follower);



        }
    }


}

package com.example.study21;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DriveHolder {
    public ImageView typeImageView;
    public TextView songView;
    public TextView singerView;

    public DriveHolder(View root){
        typeImageView=(ImageView)root.findViewById(R.id.custom_item_type_image);
        songView=(TextView)root.findViewById(R.id.custom_item_song_name);
        singerView=(TextView)root.findViewById(R.id.custom_item_singer_name);
    }
}

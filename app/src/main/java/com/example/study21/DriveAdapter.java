package com.example.study21;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.res.ResourcesCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class DriveAdapter extends ArrayAdapter<DriveVO> {
    Context context;
    int resId;
    ArrayList<DriveVO> datas;

    public DriveAdapter(Context context, int resId, ArrayList<DriveVO> datas) {
        super(context, resId);
        this.context = context;
        this.resId = resId;
        this.datas = datas;
    }

    @Override
    public int getCount() {
        return datas.size();
    }

    @NonNull
    @Override //요게 뭐하는건지 모르겠음 111111111111111111111
    public View getView(int position, View convertView, ViewGroup parent) {
        if ((convertView == null)) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(resId, null);
            DriveHolder holder = new DriveHolder(convertView);
            convertView.setTag(holder);
        }
        DriveHolder holder = (DriveHolder) convertView.getTag();
//111111111111111111111111111111111111111111111111111111111111
        ImageView typeImageView = holder.typeImageView;
        TextView songView = holder.songView;
        TextView singerView = holder.singerView;

        final DriveVO vo = datas.get(position);

        songView.setText(vo.song);
        singerView.setText(vo.singer);

        //DriveVO에 있는 값이 DBHelper클래스의 tb_drive의 Values 의 값과 같다면 ? 아이콘을 불러와 그려줌
        if (vo.typeImage.equals("blackpink")) {
            typeImageView.setImageDrawable(ResourcesCompat.getDrawable(context.getResources(), R.drawable.ic_type_blackpink, null));
        } else if (vo.typeImage.equals("bts")) {
            typeImageView.setImageDrawable(ResourcesCompat.getDrawable(context.getResources(), R.drawable.ic_type_bts, null));
        } else if (vo.typeImage.equals("")) {
            typeImageView.setImageDrawable(ResourcesCompat.getDrawable(context,))
        }
        return convertView;
    }
}
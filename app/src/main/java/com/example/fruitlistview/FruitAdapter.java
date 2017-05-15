package com.example.fruitlistview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;


/**
 * Created by 付存哲kk on 2017/3/3.
 */

public class FruitAdapter extends ArrayAdapter<Fruit> {

    public int resourceId;

    public FruitAdapter(Context context, int textViewResourceId, List<Fruit> objects) {
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Fruit fruit = getItem(position);
        View view;
        ViewHolder viewHolder;
        if(convertView == null){
            view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.FruitImage = (ImageView)view.findViewById(R.id.fruit_image);
            viewHolder.FruitName = (TextView)view.findViewById(R.id.fruit_name);
            view.setTag(viewHolder);
        }else {
            view = convertView;
            viewHolder = (ViewHolder)view.getTag();
        }
        viewHolder.FruitImage.setImageResource(fruit.getImageId());
        viewHolder.FruitName.setText(fruit.getName());
        return view;
    }

    class ViewHolder{
        ImageView FruitImage;

        TextView FruitName;
    }
}

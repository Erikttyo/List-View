package com.firman.belajar.palmerahapps;


import android.content.Context;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.firman.belajar.palmerahapps.model.DataItem;

import java.io.IOException;
import java.util.List;

/**
 * Created by Firman on 2/1/2019.
 */
public class DataItemAdapter extends ArrayAdapter<DataItem> {

    private final LayoutInflater inflater;


    public DataItemAdapter(Context context ,List<DataItem> dataItemList) {
        super(context, R.layout.list_item, dataItemList);
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        ViewHolder holder;
        DataItem item = getItem(position);

        if (convertView == null) {
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.list_item, parent, false);
            holder.gambar = convertView.findViewById(R.id.gambar);
            holder.itemName = convertView.findViewById(R.id.itemName);
            holder.price = convertView.findViewById(R.id.price);
            holder.description = convertView.findViewById(R.id.description);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.itemName.setText(item.getItemName());
        holder.price.setText(Utils.formatIDR("Rp.", (long) item.getPrice()));
        holder.description.setText(item.getDescription());

        
        try {
            holder.gambar.setImageBitmap(BitmapFactory.decodeStream(getContext().getResources().getAssets().open(item.getImage())));
        } catch (IOException e) {
            e.printStackTrace();
        }


        return convertView;
    }

    class ViewHolder {
        TextView itemName;
        TextView price;
        TextView description;
        ImageView gambar;
    }
}

/**
 * Created by Koshika Gupta on 20-02-2018.
 */
package com.example.android.chandigarh_letstakeaview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.android.chandigarh_letstakeaview.list_item;
import java.util.ArrayList;

public  class list_view extends ArrayAdapter<list_item> {

    public list_view(Activity context, ArrayList<list_item> list_item){
        super(context,0,list_item);
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView==null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list, parent, false);
        }
        list_item currentWord = getItem(position);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.event_text_view);
        miwokTextView.setText(currentWord.getCevent());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
        defaultTextView.setText(currentWord.getDescription());

        ImageView image =(ImageView) listItemView.findViewById(R.id.image);
        if (currentWord.hasimage()) {
            image.setImageResource(currentWord.getImageResourceId());
            image.setVisibility(View.VISIBLE);
        }
        else {
            image.setVisibility(View.GONE);
        }
        return listItemView;
    }
}

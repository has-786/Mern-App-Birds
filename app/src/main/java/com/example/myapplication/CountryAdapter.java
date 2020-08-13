package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;


public class CountryAdapter extends ArrayAdapter<CountryItem> {

    public CountryAdapter(Context context, ArrayList<CountryItem> countryList) {
        super(context, 0, countryList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    private View initView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.country_spinner_row, parent, false
            );
        }

        TextView imageViewFlag = convertView.findViewById(R.id.text_view_name1);
        TextView textViewName = convertView.findViewById(R.id.text_view_name);

if(position==0){
    textViewName.setBackgroundColor(convertView.getResources().getColor(R.color.lightgray,convertView.getResources().newTheme()));
    textViewName.setTextColor(convertView.getResources().getColor(R.color.green,convertView.getResources().newTheme()));

    imageViewFlag.setBackgroundColor(convertView.getResources().getColor(R.color.lightgray,convertView.getResources().newTheme()));
    imageViewFlag.setTextColor(convertView.getResources().getColor(R.color.green,convertView.getResources().newTheme()));

    RelativeLayout rel=convertView.findViewById(R.id.relative);
    ViewGroup.LayoutParams relativelayoutParams = rel.getLayoutParams();

    ViewGroup.LayoutParams layoutParams = textViewName.getLayoutParams();
    layoutParams.width =relativelayoutParams.width;
    textViewName.setLayoutParams(layoutParams);
    layoutParams = imageViewFlag.getLayoutParams();
    layoutParams.width = relativelayoutParams.height;
    imageViewFlag.setLayoutParams(layoutParams);

}
else
{
    RelativeLayout rel=convertView.findViewById(R.id.relative);
    ViewGroup.LayoutParams relativelayoutParams = rel.getLayoutParams();

    ViewGroup.LayoutParams layoutParams = textViewName.getLayoutParams();
    layoutParams.width =900;
    layoutParams.height =120;
    textViewName.setTextSize(20);

    textViewName.setLayoutParams(layoutParams);
    layoutParams = imageViewFlag.getLayoutParams();
    layoutParams.width = 900;
    layoutParams.height =120;
    imageViewFlag.setTextSize(18);

    imageViewFlag.setLayoutParams(layoutParams);

    imageViewFlag.setBackgroundColor(    convertView.getResources().getColor(R.color.black,convertView.getResources().newTheme()));
    imageViewFlag.setTextColor(    convertView.getResources().getColor(R.color.lightgray,convertView.getResources().newTheme()));

    textViewName.setBackgroundColor(    convertView.getResources().getColor(R.color.black,convertView.getResources().newTheme()));
    textViewName.setTextColor(    convertView.getResources().getColor(R.color.lightgray,convertView.getResources().newTheme()));



}
        CountryItem currentItem = getItem(position);

        if (currentItem != null) {
            imageViewFlag.setText(currentItem.getFlagImage());
            textViewName.setText(currentItem.getCountryName());
        }

        return convertView;
    }
}
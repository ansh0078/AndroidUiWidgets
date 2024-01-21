package com.example.androiduiwidgets;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SearchAdaptor extends BaseAdapter {
    Context context;
    ArrayList arrayList;
    LayoutInflater layoutInflater;
    ArrayList search_name;
    public SearchAdaptor(Context context, ArrayList arrayList){
        this.context = context;
        this.arrayList = arrayList;
        layoutInflater = LayoutInflater.from(context);

        search_name = new ArrayList();
        search_name.addAll(arrayList);
    }
    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view1 = layoutInflater.inflate(R.layout.layout_search_adaptor, null);
        TextView tv = (TextView) view1.findViewById(R.id.search_name);
        tv.setText(arrayList.get(i).toString());
        return view1;
    }
    public void myFilter(String str) {
        arrayList.clear();

        for(Object o:search_name) {
            if(o.toString().contains(str)) {
                arrayList.add(o.toString());
            }
        }
        notifyDataSetChanged();
    }
}

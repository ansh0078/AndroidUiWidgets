package com.example.androiduiwidgets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class SearchViewDemo extends AppCompatActivity {
    SearchView search;
    ListView lv_search;
    ArrayList names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_view_demo);

        search = (SearchView) findViewById(R.id.search);
        lv_search = (ListView) findViewById(R.id.lv_search);

        names = new ArrayList();
        names.add("Ansh");
        names.add("Rohan");
        names.add("Sohan");
        names.add("Pankaj");
        names.add("Sonu");
        names.add("Mohan");
        names.add("Ajit");
        names.add("Deepak");

//        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, names);
//        lv_search.setAdapter(arrayAdapter);

        SearchAdaptor searchAdaptor = new SearchAdaptor(this, names);
        lv_search.setAdapter(searchAdaptor);


        search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                //arrayAdapter.getFilter().filter(newText);
                searchAdaptor.myFilter(newText);
                return false;
            }
        });
    }
}
package com.example.moiz.hyefa;

/**
 * Created by MOIZ on 11/9/2018.
 */

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Employee extends AppCompatActivity {

    ListView list;
    String titles[] = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};
    String description[] = {"The Description 1", "The Description 2", "The Description 3", "The Description 4", "The Description 5"};
    int imgs[]={R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp, R.drawable.ic_home_black_24dp};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.employee);


        list = (ListView) findViewById(R.id.listview);

        MyAdapter adapter = new MyAdapter(this,titles,imgs,description);
        list.setAdapter(adapter);

        //click to go to another activity
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(Employee.this, "Item 1 clicked", Toast.LENGTH_SHORT).show();
                }
                else if (position == 1) {
                    Toast.makeText(Employee.this, "Item 2 clicked", Toast.LENGTH_SHORT).show();
                }
                else if (position == 2) {
                    Toast.makeText(Employee.this, "Item 3 clicked", Toast.LENGTH_SHORT).show();
                }
                else if (position == 3) {
                    Toast.makeText(Employee.this, "Item 4 clicked", Toast.LENGTH_SHORT).show();
                }
                else if (position == 4) {
                    Toast.makeText(Employee.this, "Item 5 clicked", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }


    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String myTitles[];
        String myDescription[];
        int[] imgs;

        MyAdapter(Context c, String[] titles, int[] imgs, String[] description) {
            super(c,R.layout.employee_list,R.id.text1,titles);
            this.context=c;
            this.imgs=imgs;
            this.myTitles=titles;
            this.myDescription=description;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent)
        {
            LayoutInflater layoutInflater = (LayoutInflater)   getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.employee_list, parent, false);
            ImageView images = (ImageView) row.findViewById(R.id.logo);
            TextView myTitle = (TextView) row.findViewById(R.id.text1);
            TextView myDescription = (TextView) row.findViewById(R.id.text2);
            images.setImageResource(imgs[position]);
            myTitle.setText(titles[position]);
            myDescription.setText(description[position]);
            return row;
        }
    }
}

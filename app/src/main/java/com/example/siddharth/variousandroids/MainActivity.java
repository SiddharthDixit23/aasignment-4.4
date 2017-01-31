package com.example.siddharth.variousandroids;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private GridView mGridView;
    private ArrayList<Integer> mPhoto;
    private ArrayList<String> mName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGridView = (GridView)findViewById(R.id.lv_view);

        mPhoto = new ArrayList<>();
        mPhoto.add(R.drawable.gingerbread);
        mPhoto.add(R.drawable.honeycomb);
        mPhoto.add(R.drawable.icecreamsandwich);
        mPhoto.add(R.drawable.androidjellybean);
        mPhoto.add(R.drawable.androidkitkat);
        mPhoto.add(R.drawable.lollipop);
        mName = new ArrayList<>();
        mName.add("GingerBread");
        mName.add("HoneyComb");
        mName.add("IceCreamSandwich");
        mName.add("JellyBean");
        mName.add("KitKat");
        mName.add("Lollipop");
        mGridView.setAdapter(new MyAdapter());

    }

    class MyAdapter extends BaseAdapter
    {

        @Override
        public int getCount() {
            return mPhoto.size();
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

            View rowView = getLayoutInflater().inflate(R.layout.image_file,viewGroup,false);
            ImageView img = (ImageView)rowView.findViewById(R.id.photo);
            img.setImageResource(mPhoto.get(i));
            TextView mTv = (TextView)rowView.findViewById(R.id.tv_one);
            mTv.setText(mName.get(i));
            return rowView;
        }
    }
}

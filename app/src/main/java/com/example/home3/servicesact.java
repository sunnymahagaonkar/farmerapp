package com.example.home3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class servicesact extends AppCompatActivity {

    GridView gridView;
    String[] fruitNames = {"Apple", "Orange",  "Melon", "Kiwi", "Banana","transport"};
    int[] fruitImages = {R.drawable.farmdriver,R.drawable.fencing,R.drawable.cropprote,R.drawable.farmland,R.drawable.labour,R.drawable.transport};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicesact);
        gridView = findViewById(R.id.gridview2);
        CustomAdapter customAdapter = new CustomAdapter();
        gridView.setAdapter(customAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(getApplicationContext(),fruitNames[i],Toast.LENGTH_LONG).show();
                Intent intent1 = new Intent(getApplicationContext(),grid_item2.class);
                intent1.putExtra("name",fruitNames[i]);
                intent1.putExtra("image",fruitImages[i]);
                startActivity(intent1);

            }
        });
    }

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return fruitImages.length;
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
            View view1 = getLayoutInflater().inflate(R.layout.row_data,null);
            //getting view in row_data
            TextView name = view1.findViewById(R.id.fruits);
            ImageView image = view1.findViewById(R.id.wheatimg);

            name.setText(fruitNames[i]);
            image.setImageResource(fruitImages[i]);
            return view1;

        }
    }
}

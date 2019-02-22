package com.firman.belajar.palmerahapps;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;
import com.firman.belajar.palmerahapps.contoh.SampleDataProvider;
import com.firman.belajar.palmerahapps.model.DataItem;

import java.util.List;

class MainActivity extends AppCompatActivity {

    private TextView tvOut;

    private List<DataItem> dataItemList = SampleDataProvider.dataItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvOut = findViewById(R.id.tvOut);

//        DataItem dataItem = new DataItem(null, "Iphone 10",
//                "Iphone dapat dibuka dengan wajah.", "99",
//                0, 200000.5, "iphone.jpg");
//
//        tvOut.setText(dataItem.toString());

        for (DataItem item : dataItemList) {
            tvOut.append(item.getItemName() + "\n");
        }


        DataItemAdapter adapter = new DataItemAdapter(this, dataItemList);
        ListView listView = findViewById(android.R.id.list);
        listView.setAdapter(adapter);
    }
}

package com.testing.uitest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RecycelerViewActivity extends AppCompatActivity {


    private RecyclerView recy_allList;
    private ArrayList<Model> s;
    private adapter_ListData studentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyceler_view);

        s=new ArrayList<>();
        s.add(new Model("alaa"));
        s.add(new Model("tr"));
        s.add(new Model("sfva"));
        s.add(new Model("d"));
        s.add(new Model("sdf"));

        recy_allList = findViewById(R.id.recy_allList);

        recy_allList.setLayoutManager(new LinearLayoutManager(this));
        recy_allList.setHasFixedSize(true);




        studentAdapter = new adapter_ListData(s,this);
        recy_allList.setAdapter(studentAdapter);








    }
}
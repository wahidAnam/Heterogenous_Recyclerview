package com.example.heterogeneousrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.heterogeneousrecyclerview.adpter.ObjectAdapter;
import com.example.heterogeneousrecyclerview.model.Car;
import com.example.heterogeneousrecyclerview.model.Movie;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerview;
    private ArrayList<Object> objects = new ArrayList<>();;
    private ObjectAdapter objectAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerview = findViewById(R.id.mRecyclerview);


        objectAdapter  = new ObjectAdapter(this,objects);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerview.setLayoutManager(llm);
        mRecyclerview.setAdapter(objectAdapter);


        objects.add(new Car(R.drawable.car,"Toyota Corolla","Toyota"));
        objects.add(new Movie("Dilwale Dulhania Le jayenge","Romatic"));
        objects.add(new Car(R.drawable.car,"BMW","BMW Company"));
        objects.add(new Movie("Peyar Tune keya kia","Romatic"));
        objects.add(new Car(R.drawable.car,"Marcedise","Marchedise Company"));
        objects.add(new Car(R.drawable.car,"Limbergini","Limbergini Company"));
        objects.add(new Movie("Bahubali The Begining","Action"));
        objects.add(new Car(R.drawable.car,"Toyota Corolla","Toyota"));
        objects.add(new Movie("Terminator 1","Action"));
        objects.add(new Movie("Terminator 2","Romatic"));


    }
}
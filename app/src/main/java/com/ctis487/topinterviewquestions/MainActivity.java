package com.ctis487.topinterviewquestions;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvQuestions;
    private RecyclerView.LayoutManager layoutManager;
    private List<String> list;
    private CustomRecyclerViewAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // Hiding title bar using code
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        rvQuestions = findViewById(R.id.rvQuestions);
        layoutManager = new LinearLayoutManager(this);
        rvQuestions.setLayoutManager(layoutManager);
        list = Arrays.asList(getResources().getStringArray(R.array.questions));
        adapter = new CustomRecyclerViewAdapter(list);
        rvQuestions.setHasFixedSize(true);
        rvQuestions.setAdapter(adapter);

    }
}
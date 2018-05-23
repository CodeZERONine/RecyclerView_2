package org.akshanshgusain.recyclermultiview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerview;
    List<MyModel> dataList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dataset();

        recyclerview=findViewById(R.id.recyclerview_main);
        RecyclerView.LayoutManager recyclerViewLayoutManager=new LinearLayoutManager(this);
        recyclerview.setLayoutManager(recyclerViewLayoutManager);

        MyAdapter adapter=new MyAdapter(dataList);
        recyclerview.setAdapter(adapter);
    }

    private void dataset(){
        dataList=new ArrayList<>();
        dataList.add(new MyModel("ONE APPLE",MyModel.FIRST_TYPE));
        dataList.add(new MyModel("TWO NVIDIA",MyModel.SECOND_TYPE));
        dataList.add(new MyModel("THREE WINDOWS",MyModel.THIRD_TYPE));

        Toast.makeText(this,Integer.valueOf(dataList.size()).toString(), Toast.LENGTH_SHORT).show();

    }
}

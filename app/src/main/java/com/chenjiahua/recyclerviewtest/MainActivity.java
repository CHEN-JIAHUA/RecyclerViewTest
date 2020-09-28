package com.chenjiahua.recyclerviewtest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private List<String> mDatas;
    private RecyclerView mRecyclerView;
    private HomeAdapter mHomeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initView();

    }

    private void initView() {
        mRecyclerView = findViewById(R.id.recycler_view_container);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(mHomeAdapter);
    }

    private void initData() {
        mDatas = new ArrayList<>();
        for (int i = 'A'; i < 'z'; i++) {
            mDatas.add(""+(char)i);
        }
        mHomeAdapter  = new HomeAdapter();
        mHomeAdapter.setData(mDatas);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        switch (itemId){
            case R.id.list_view_vertical_stander:
                Log.d(TAG,"list_view_vertical_stander");
                break;
            case R.id.list_view_vertical_reverse:
                Log.d(TAG,"list_view_vertical_reverse");
                break;
            case R.id.list_view_horizontal_stander:
                Log.d(TAG,"list_view_horizontal_stander");
                break;
            case R.id.list_view_horizontal_reverse:
                Log.d(TAG,"list_view_horizontal_reverse");
                break;

            case R.id.grid_view_vertical_stander:
                break;
            case R.id.grid_view_vertical_reverse:
                break;
            case R.id.grid_view_horizontal_stander:
                break;
            case R.id.grid_view_horizontal_reverse:
                break;

            case R.id.stagger_view_vertical_stander:
                break;
            case R.id.stagger_view_vertical_reverse:
                break;
            case R.id.stagger_view_horizontal_stander:
                break;
            case R.id.stagger_view_horizontal_reverse:
                break;
            default:break;

        }
        return super.onOptionsItemSelected(item);
    }
}
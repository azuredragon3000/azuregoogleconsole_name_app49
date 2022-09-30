package com.myapp.app49;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.myapp.mylibrary.DB.LeHoi;
import com.myapp.mylibrary.DB.NgayLe;
import com.myapp.mylibrary.boitinhyeu.ModelDanhNgon;
import com.myapp.mylibrary.recycleview.GridSpacingItemDecoration;

import java.util.List;

public class ContentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        Intent intent = getIntent();
        int ck = intent.getIntExtra("data",0    );

        RecyclerView rc = findViewById(R.id.rc);
        AdapterContent adapterContent = null;
        switch (ck){
            case 1:
                List<ModelDanhNgon> list1 = FunctionStatic.getListDanhNgon(this);
                adapterContent = new AdapterContent(list1,null,null,this,1);
                break;
            case 2:
                List<LeHoi> list2 = FunctionStatic.getListLeHoi(this);
                adapterContent = new AdapterContent(null,list2,null,this,2);
                break;
            case 3:
                List<NgayLe> list3 = FunctionStatic.getListNgayLe(this);
                adapterContent = new AdapterContent(null,null,list3,this,3);
                break;
            default:
                break;
        }

        rc.setAdapter(adapterContent);

        int spacing_left = 10; // 50px
        int spacing_top=10;
        rc.addItemDecoration(new GridSpacingItemDecoration(1, spacing_left, spacing_top));
        rc.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

}
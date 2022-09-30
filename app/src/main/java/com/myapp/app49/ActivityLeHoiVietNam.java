package com.myapp.app49;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityLeHoiVietNam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lehoivietnam);

        // test bundle savedInstanceState
        ((SubApp) getApplication()).initDb();

        LinearLayout ln1 = findViewById(R.id.danhngonvietnam);
        ln1.setOnClickListener(v->{
            Intent intent = new Intent(this, ContentActivity.class);
            intent.putExtra("data",1);
            startActivity(intent);
        });

        LinearLayout ln2 = findViewById(R.id.lehoivietnam);
        ln2.setOnClickListener(v->{
            Intent intent = new Intent(this, ContentActivity.class);
            intent.putExtra("data",2);
            startActivity(intent);
        });

        LinearLayout ln3 = findViewById(R.id.ngaylevietnam);
        ln3.setOnClickListener(v->{
            Intent intent = new Intent(this, ContentActivity.class);
            intent.putExtra("data",3);
            startActivity(intent);
        });

    }
}
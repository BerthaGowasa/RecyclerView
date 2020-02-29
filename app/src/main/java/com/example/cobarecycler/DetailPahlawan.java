package com.example.cobarecycler;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailPahlawan extends AppCompatActivity {

    ImageView detail;
    TextView detail_tv,tv_judul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pahlawan);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        detail = findViewById(R.id.iv_detail);
        detail_tv = findViewById(R.id.team_description);
        tv_judul = findViewById(R.id.team_title);

        getIncomingIntent();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case android.R.id.home:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void getIncomingIntent(){
        Bundle bundle = getIntent().getExtras();
        if(bundle !=null){
            int ivimage = bundle.getInt("img_url");
            Glide.with(getApplicationContext()).load(ivimage).into(detail);
            String getDesc = bundle.getString("detail");
            String getTitle= bundle.getString("name");

            detail_tv.setText(getDesc);
            tv_judul.setText(getTitle);
        }
    }



}
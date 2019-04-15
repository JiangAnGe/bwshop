package com.example.wushuangling20190415;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = getSharedPreferences("user", MODE_PRIVATE);
        String userName = sp.getString("user_name",null);
        String userNickName = sp.getString("user_nickName",null);
        String userPictrue = sp.getString("user_pictrue",null);

        ImageView imageView = findViewById(R.id.image);
        TextView textView = findViewById(R.id.tv_nickname);
        Glide.with(this).load(userPictrue).into(imageView);
        textView.setText(userNickName);

    }

}


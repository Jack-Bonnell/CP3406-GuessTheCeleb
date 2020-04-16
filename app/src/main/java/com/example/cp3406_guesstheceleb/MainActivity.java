package com.example.cp3406_guesstheceleb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ImageManager Test Cases
        //ImageManager imageManager = new ImageManager(this.getAssets(), "celebs");
        //System.out.println(imageManager.list());
        //ImageView imageView = findViewById(R.id.image);
        //imageView.setImageBitmap(imageManager.get(0));

    }
}

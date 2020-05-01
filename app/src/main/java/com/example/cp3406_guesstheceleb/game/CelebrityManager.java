package com.example.cp3406_guesstheceleb.game;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class CelebrityManager {
    private String assetPath;
    private String[] imageNames;
    private AssetManager assetManager;

    public CelebrityManager(AssetManager assetManager, String assetPath) {
        this.assetManager = assetManager;
        this.assetPath = assetPath;
    }

    public Bitmap get(int i) {
        try{
            String[] imageNames = assetManager.list("celebs");
            InputStream stream = assetManager.open("celebs/" + imageNames[i]);
            Bitmap bitmap = BitmapFactory.decodeStream(stream);
            return(bitmap);
        }catch (IOException e){
            return null;
        }
    }

    public String getName(int i) {
        String[] name = (this.list()).split(",");
        return(name[i]);
    }

    public int count() {
        String[] name = (this.list()).split(",");
        return(name.length);
    }

    public String list() {
        try{
            String[] imageNames = assetManager.list("celebs");
            return(Arrays.toString(imageNames));
        }catch (IOException e){
            return("failed to get names");
        }
    }
}

package com.ston1x.fivapquotes2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;

/**
 * Created by nstoy on 2/14/2016.
 */
public class popAbout extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popupwindow);
       /*
       //Этот кусок кода урезает Activity до размера окна
       setContentView(R.layout.popupwindow);
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.6));
        */


    }

    public void devpage(View view) //link to my VK page
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.vk.com/wpston"));
        startActivity(browserIntent);
    }
}

package com.ston1x.fivapquotes2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

/**
 * Created by nstoy on 2/16/2016.
 */
public class BioActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);
    }


    public void kfivapVK(View view)
    {
        Intent browserIntent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://vk.com/kfivap"));
        startActivity(browserIntent1);
    }


    public void kfivapQuotesVK(View view)
    {
        Intent browserIntent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://vk.com/ckf_ckf"));
        startActivity(browserIntent1);
    }

}

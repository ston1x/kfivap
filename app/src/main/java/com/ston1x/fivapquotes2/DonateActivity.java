package com.ston1x.fivapquotes2;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by nstoy on 2/14/2016.
 */
public class DonateActivity  extends Activity {

    private TextView textView8;
    private TextView textView7;


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate);
        textView7 = (TextView) findViewById(R.id.textView7);
        textView8 = (TextView) findViewById(R.id.textView8);

    }

    public void CopyR(View v)
    {
        ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("simple text", textView7.getText());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(getApplicationContext(), "Скопировано в буфер обмена",
                Toast.LENGTH_LONG).show();
    }
    public void CopyZ(View v)
    {
        ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("simple text", textView8.getText());
        clipboard.setPrimaryClip(clip);
        Toast.makeText(getApplicationContext(), "Скопировано в буфер обмена",
                Toast.LENGTH_LONG).show();
    }

}

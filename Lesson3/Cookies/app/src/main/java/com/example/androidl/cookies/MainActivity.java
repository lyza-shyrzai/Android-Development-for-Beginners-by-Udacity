package com.example.androidl.cookies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androidl.cookies.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.
        ImageView beforeCookie = (ImageView) findViewById(R.id.android_cookie_image_view);
        beforeCookie.setImageResource(R.drawable.after_cookie);

        // TODO: Find a reference to the TextView in the layout. Change the text.
        TextView status = (TextView) findViewById(R.id.status_text_view);
        status.setText("I am sooo full...");
    }
}
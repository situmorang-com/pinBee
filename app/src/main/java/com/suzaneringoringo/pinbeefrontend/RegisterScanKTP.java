package com.suzaneringoringo.pinbeefrontend;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

/**
 * Created by root on 25/02/18.
 */

public class RegisterScanKTP extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_scan_ktp);
        RelativeLayout ll = (RelativeLayout) findViewById(R.id.sign_up_2_linear_layout);
        ll.setBackgroundColor(Color.argb(0xff, 0xff, 0xff, 0xff));
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
    }

    public void scanKTP(View view) {
        Intent intent = new Intent(this, RegisterScanPhoto.class);
        startActivity(intent);
        finish();
    }
}
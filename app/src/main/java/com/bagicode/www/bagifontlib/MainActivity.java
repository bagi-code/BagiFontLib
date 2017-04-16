package com.bagicode.www.bagifontlib;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // and then download font

        // go make folder for font library
        // and copy file font
        // rename font and dont space

        // inisialisasi code font library
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/BarleyScript.tff")
                .setFontAttrId(R.attr.fontPath)
                .build()
                );

        // go choise font
        // and run programeer :p

        // i am forget add method library, sorry
        // go add it
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}

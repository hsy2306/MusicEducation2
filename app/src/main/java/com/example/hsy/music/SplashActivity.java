package com.example.hsy.music;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by hsy on 2018-02-09.
 */

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstantState)
    {
        super.onCreate(savedInstantState);

        try{
            Thread.sleep(3000);

        }catch (InterruptedException e)
        {
            e.printStackTrace();

        }
        startActivity(new Intent(this,MainActivity.class));
        finish();


    }
}

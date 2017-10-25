package com.madad.jinet.sneakoo;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends ActionBarActivity{

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewPager);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);

        viewPager.setAdapter(viewPagerAdapter);

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new MyTimerTask(), 2000, 4000);

        Spinner mySpinner = (Spinner) findViewById(R.id.spinner1);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.sneakers));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);

        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l){
                if (i == 1){
                    startActivity(new Intent(MainActivity.this, NikeAirShakeActivity.class));
                }else if (i == 2){
                    startActivity(new Intent(MainActivity.this, YeezyBoostActivity.class));
                }else if (i == 3){
                    startActivity(new Intent(MainActivity.this, AdidasUltraBoostActivity.class));
                }else if (i == 4){
                    startActivity(new Intent(MainActivity.this, AdidasNmdActivity.class));
                }else if (i == 5){
                    startActivity(new Intent(MainActivity.this, NikeLabActivity.class));
                }else if (i == 6){
                    startActivity(new Intent(MainActivity.this, NikeAirMaxActivity.class));
                }else if (i == 7){
                    startActivity(new Intent(MainActivity.this, PumaTsugiActivity.class));
                }else if (i == 8){
                    startActivity(new Intent(MainActivity.this, AsicsGelActivity.class));
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });

    }


    public  class MyTimerTask extends TimerTask{

         @Override
        public void run(){
             MainActivity.this.runOnUiThread(new Runnable() {
                 @Override
                 public void run() {
                     if (viewPager.getCurrentItem() == 0) {
                         viewPager.setCurrentItem(1);
                     } else if (viewPager.getCurrentItem() == 1) {
                         viewPager.setCurrentItem(2);
                     }else if (viewPager.getCurrentItem() ==2) {
                         viewPager.setCurrentItem(3);
                     }else if (viewPager.getCurrentItem() ==3){
                         viewPager.setCurrentItem(4);
                     } else {
                         viewPager.setCurrentItem(0);
                     }
                 }
             });
         }

    }

    public void onButtonClick2 (View v)
    {
        if (v.getId() == R.id.button3)
        {
            Intent i = new Intent(MainActivity.this, InquiriesActivity.class);
            startActivity(i);
        }
    }

    public void onButtonClick3 (View v)
    {
        if (v.getId() == R.id.button5)
        {
            Intent i = new Intent(MainActivity.this, UpcomingSneakers1Activity.class);
            startActivity(i);
        }
    }



    public void onButtonClick1(View v)
    {
        if (v.getId() == R.id.button1)
        {
            Intent i = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(i);
        }
    }



}

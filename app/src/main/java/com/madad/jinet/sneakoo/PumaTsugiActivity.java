package com.madad.jinet.sneakoo;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class PumaTsugiActivity extends ActionBarActivity {

    ViewPager viewPager;
    private static TextView text_v;
    private static RatingBar rating_b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puma_tsugi);
        listenerForRatingBar();

        viewPager = (ViewPager) findViewById(R.id.viewPager8);

        ViewPagerAdapter7 viewPagerAdapter7 = new ViewPagerAdapter7(this);

        viewPager.setAdapter(viewPagerAdapter7);

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new MyTimerTask(), 2000, 4000);
    }

    public  class MyTimerTask extends TimerTask {

        @Override
        public void run(){
            PumaTsugiActivity.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if (viewPager.getCurrentItem() == 0) {
                        viewPager.setCurrentItem(1);
                    } else if (viewPager.getCurrentItem() == 1) {
                        viewPager.setCurrentItem(2);
                    }else if (viewPager.getCurrentItem() ==2) {
                        viewPager.setCurrentItem(3);
                    } else {
                        viewPager.setCurrentItem(0);
                    }
                }
            });
        }

    }

    public void listenerForRatingBar() {
        rating_b = (RatingBar) findViewById(R.id.ratingBar7);
        text_v = (TextView) findViewById(R.id.rateText7);

        rating_b.setOnRatingBarChangeListener(
                new RatingBar.OnRatingBarChangeListener() {
                    @Override
                    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                        text_v.setText(String.valueOf(rating));
                    }
                }
        );
    }

    public void browser9(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.endclothing.com/gb/puma-tsugi-shinsei-363759-01.html"));
        startActivity(browserIntent);
    }

    public void browser10(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://asphaltgold.de/en/catalog/product/view/id/203573/s/puma-tsugi-shinsei-puma-black-puma-white/?source=webgains&siteid=152449"));
        startActivity(browserIntent);
    }



}

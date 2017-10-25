package com.madad.jinet.sneakoo;

import android.content.Intent;
import android.media.Rating;
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

public class NikeAirShakeActivity extends ActionBarActivity {

    ViewPager viewPager;
    private static TextView text_v;
    private static RatingBar rating_b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nike_air_shake);
        listenerForRatingBar();

        viewPager = (ViewPager) findViewById(R.id.viewPager2);

        ViewPagerAdapter1 viewPagerAdapter1 = new ViewPagerAdapter1(this);

        viewPager.setAdapter(viewPagerAdapter1);

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new MyTimerTask(), 2000, 4000);
    }

    public  class MyTimerTask extends TimerTask {

        @Override
        public void run(){
            NikeAirShakeActivity.this.runOnUiThread(new Runnable() {
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

    public void listenerForRatingBar(){
        rating_b = (RatingBar) findViewById(R.id.ratingBar1);
        text_v = (TextView)findViewById(R.id.rateText1);

        rating_b.setOnRatingBarChangeListener(
                new RatingBar.OnRatingBarChangeListener() {
                    @Override
                    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                        text_v.setText(String.valueOf(rating));
                    }
                }
        );
    }

    public void browser1(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.footlocker.co.uk/en/p/nike-air-shake-ndestrukt-men-shoes-43884?utm_campaign=Affiliate&utm_source=Affilinet&utm_term=717122"));
        startActivity(browserIntent);
    }

    public void browser2(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sneakersnstuff.com/en/product/28232/nike-air-shake-ndestrukt"));
    }



}

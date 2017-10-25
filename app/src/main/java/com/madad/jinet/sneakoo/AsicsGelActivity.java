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

public class AsicsGelActivity extends ActionBarActivity {

    ViewPager viewPager;
    private static TextView text_v;
    private static RatingBar rating_b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asics_gel);
        listenerForRatingBar();

        viewPager = (ViewPager) findViewById(R.id.viewPager9);

        ViewPagerAdapter8 viewPagerAdapter8 = new ViewPagerAdapter8(this);

        viewPager.setAdapter(viewPagerAdapter8);

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new MyTimerTask(), 2000, 4000);
    }

    public  class MyTimerTask extends TimerTask {

        @Override
        public void run(){
            AsicsGelActivity.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if (viewPager.getCurrentItem() == 0) {
                        viewPager.setCurrentItem(1);
                    } else if (viewPager.getCurrentItem() == 1) {
                        viewPager.setCurrentItem(2);
                    } else {
                        viewPager.setCurrentItem(0);
                    }
                }
            });
        }

    }

    public void listenerForRatingBar(){
        rating_b = (RatingBar) findViewById(R.id.ratingBar8);
        text_v = (TextView)findViewById(R.id.rateText8);

        rating_b.setOnRatingBarChangeListener(
                new RatingBar.OnRatingBarChangeListener() {
                    @Override
                    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                        text_v.setText(String.valueOf(rating));
                    }
                }
        );
    }

    public void browser11(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.endclothing.com/gb/asics-gel-mai-h703n-9090.html"));
        startActivity(browserIntent);
    }

    public void browser12(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.urbanindustry.co.uk/collections/shoes/products/asics-gel-mai-shoes-black-black?utm_source=Affiliate&utm_medium=LinkShare&utm_campaign=3Hz0XD4hET0&utm_content=10&utm_term=UKNetwork&siteID=3Hz0XD4hET0-WDCQFuziiL53pDbQrdA1fA"));
        startActivity(browserIntent);
    }




}

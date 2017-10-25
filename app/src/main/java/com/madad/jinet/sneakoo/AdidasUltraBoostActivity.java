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

public class AdidasUltraBoostActivity extends ActionBarActivity {

    ViewPager viewPager;
    private static TextView text_v;
    private static RatingBar rating_b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adidas_ultra_boost);
        listenerForRatingBar();

        viewPager = (ViewPager) findViewById(R.id.viewPager4);

        ViewPagerAdapter3 viewPagerAdapter3 = new ViewPagerAdapter3(this);

        viewPager.setAdapter(viewPagerAdapter3);

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new MyTimerTask(), 2000, 4000);
    }

    public  class MyTimerTask extends TimerTask {

        @Override
        public void run(){
            AdidasUltraBoostActivity.this.runOnUiThread(new Runnable() {
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
        rating_b = (RatingBar) findViewById(R.id.ratingBar3);
        text_v = (TextView)findViewById(R.id.rateText3);

        rating_b.setOnRatingBarChangeListener(
                new RatingBar.OnRatingBarChangeListener() {
                    @Override
                    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                        text_v.setText(String.valueOf(rating));
                    }
                }
        );
    }

    public void browser4(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.adidas.co.uk/ultra-boost-shoes/BA8922.html?cm_mmc=AdieAffiliates_PHG-_-thesolesupplier-_-home-_-bs-&cm_mmca1=UK&dclid=CPDFmLWZz9MCFSIf0wodsQUMhA"));
        startActivity(browserIntent);
    }

}

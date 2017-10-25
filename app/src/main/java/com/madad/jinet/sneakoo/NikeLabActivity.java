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

public class NikeLabActivity extends ActionBarActivity {

    ViewPager viewPager;
    private static TextView text_v;
    private static RatingBar rating_b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nike_lab);
        listenerForRatingBar();

        viewPager = (ViewPager) findViewById(R.id.viewPager6);

        ViewPagerAdapter5 viewPagerAdapter5 = new ViewPagerAdapter5(this);

        viewPager.setAdapter(viewPagerAdapter5);

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new MyTimerTask(), 2000, 4000);
    }

    public  class MyTimerTask extends TimerTask {

        @Override
        public void run(){
            NikeLabActivity.this.runOnUiThread(new Runnable() {
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
        rating_b = (RatingBar) findViewById(R.id.ratingBar5);
        text_v = (TextView)findViewById(R.id.rateText5);

        rating_b.setOnRatingBarChangeListener(
                new RatingBar.OnRatingBarChangeListener() {
                    @Override
                    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                        text_v.setText(String.valueOf(rating));
                    }
                }
        );
    }

    public void browser7(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ebay.co.uk/sch/i.html?_from=R40&_trksid=p2050601.m570.l1313.TR0.TRC0.H0.Xnikelab+vapormax.TRS0&_nkw=nikelab+vapormax&_sacat=0&clk_rvr_id=1209398384573&rmvSB=true"));
        startActivity(browserIntent);
    }

}

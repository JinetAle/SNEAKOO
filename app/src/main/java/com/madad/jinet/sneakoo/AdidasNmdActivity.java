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

public class AdidasNmdActivity extends ActionBarActivity {

    ViewPager viewPager;
    private static TextView text_v;
    private static RatingBar rating_b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adidas_nmd);
        listenerForRatingBar();

        viewPager = (ViewPager) findViewById(R.id.viewPager5);

        ViewPagerAdapter4 viewPagerAdapter4 = new ViewPagerAdapter4(this);

        viewPager.setAdapter(viewPagerAdapter4);

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new MyTimerTask(), 2000, 4000);
    }

    public  class MyTimerTask extends TimerTask {

        @Override
        public void run(){
            AdidasNmdActivity.this.runOnUiThread(new Runnable() {
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
        rating_b = (RatingBar) findViewById(R.id.ratingBar4);
        text_v = (TextView)findViewById(R.id.rateText4);

        rating_b.setOnRatingBarChangeListener(
                new RatingBar.OnRatingBarChangeListener() {
                    @Override
                    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                        text_v.setText(String.valueOf(rating));
                    }
                }
        );
    }

    public void browser5(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.footasylum.com/adidas-originals-nmd-r1-trainer-108020/?utm_medium=AW&utm_source=The+Sole+Supplier&awc=2832_1493659540_4b2fcb90c289d279c806ca5138a6c230"));
    }
    public void browser6(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jdsports.co.uk/product/black-adidas-originals-nmdr1/262102/?awc=1431_1493659551_71b607c6186f8f21b1a3b80fe2db6efc&utm_source=affiliate&utm_medium=Editorial+Content&utm_campaign=The+Sole+Supplier"));
        startActivity(browserIntent);
    }




}

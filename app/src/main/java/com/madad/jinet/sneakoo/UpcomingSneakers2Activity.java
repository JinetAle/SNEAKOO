package com.madad.jinet.sneakoo;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

public class UpcomingSneakers2Activity extends AppCompatActivity {

    Toolbar mToolbar;
    ImageView sneakers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upcoming_sneakers2);

        mToolbar = (Toolbar) findViewById(R.id.toolbar1);
        sneakers = (ImageView)findViewById(R.id.imageView12);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            mToolbar.setTitle(bundle.getString("SneakerName"));
            if(mToolbar.getTitle().toString().equalsIgnoreCase("BAPE X NEIGHBORHOOD X ADIDAS SUPERSTAR BOOST")){
                sneakers.setImageDrawable(ContextCompat.getDrawable(UpcomingSneakers2Activity.this, R.drawable.leak1));
            }else if (mToolbar.getTitle().toString().equalsIgnoreCase("NIKE ZOOM MADAIRNA VACHETTA TAN")){
                sneakers.setImageDrawable(ContextCompat.getDrawable(UpcomingSneakers2Activity.this, R.drawable.leak2));
            }else if (mToolbar.getTitle().toString().equalsIgnoreCase("NIKE AIR FORCE 1 SPECIAL FIELD GREY")){
                sneakers.setImageDrawable(ContextCompat.getDrawable(UpcomingSneakers2Activity.this, R.drawable.leak3));
            }else if (mToolbar.getTitle().toString().equalsIgnoreCase("ADIDAS ALPHA BOUNCE XENO TRIPLE BLACK")){
                sneakers.setImageDrawable(ContextCompat.getDrawable(UpcomingSneakers2Activity.this, R.drawable.leak4));
            }else if (mToolbar.getTitle().toString().equalsIgnoreCase("ADIDAS TUBULAR DOOM PRIMEKNIT WHITE BLACK")){
                sneakers.setImageDrawable(ContextCompat.getDrawable(UpcomingSneakers2Activity.this, R.drawable.leak5));
            }else if (mToolbar.getTitle().toString().equalsIgnoreCase("ADIDAS NMD R1 TRIPLE BLACK 3M")){
                sneakers.setImageDrawable(ContextCompat.getDrawable(UpcomingSneakers2Activity.this, R.drawable.leak6));
            }else if (mToolbar.getTitle().toString().equalsIgnoreCase("RONNIE FIEGX ASICS GEL LYTE III SALMON TOE")){
                sneakers.setImageDrawable(ContextCompat.getDrawable(UpcomingSneakers2Activity.this, R.drawable.leak7));
            }else if (mToolbar.getTitle().toString().equalsIgnoreCase("NEW BALANCE 991.5")){
                sneakers.setImageDrawable(ContextCompat.getDrawable(UpcomingSneakers2Activity.this, R.drawable.leak8));
            }else if (mToolbar.getTitle().toString().equalsIgnoreCase("NIKE AIR HUARACHE DUST VOLT")){
                sneakers.setImageDrawable(ContextCompat.getDrawable(UpcomingSneakers2Activity.this, R.drawable.leak9));
            }else if (mToolbar.getTitle().toString().equalsIgnoreCase("ADIDAS NMD CS2 PEARL GREY PRIMEKNIT")){
                sneakers.setImageDrawable(ContextCompat.getDrawable(UpcomingSneakers2Activity.this, R.drawable.leak10));
            }else if (mToolbar.getTitle().toString().equalsIgnoreCase("ALEXANDER WANG X ADIDAS AW RUN WHITE")){
                sneakers.setImageDrawable(ContextCompat.getDrawable(UpcomingSneakers2Activity.this, R.drawable.leak11));
            }else if (mToolbar.getTitle().toString().equalsIgnoreCase("NIKE AIR MAX 1 ULTRA 2.0 GPX GREEN")){
                sneakers.setImageDrawable(ContextCompat.getDrawable(UpcomingSneakers2Activity.this, R.drawable.leak12));
            }else if (mToolbar.getTitle().toString().equalsIgnoreCase("ALEXANDER WANG X ADIDAS AW RUN BLACK")){
                sneakers.setImageDrawable(ContextCompat.getDrawable(UpcomingSneakers2Activity.this, R.drawable.leak13));
            }
        }
    }
}

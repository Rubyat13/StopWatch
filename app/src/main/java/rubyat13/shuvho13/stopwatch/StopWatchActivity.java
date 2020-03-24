package rubyat13.shuvho13.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageView;




/*
Copyright (c) 2020, Al Rubyat
*/

public class StopWatchActivity extends AppCompatActivity {

    Button bStart, bStop;
    ImageView icanchor;
    Animation roundingicon;
    Chronometer timerHere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stop_watch);

        bStart =findViewById(R.id.bStart);
        bStop =findViewById(R.id.bStop);
        icanchor =findViewById(R.id.icanchor);
        timerHere =findViewById(R.id.timerHere);




        //creaete optional animation
        bStop.setAlpha(0);


        //load animation
        roundingicon = AnimationUtils.loadAnimation(this,R.anim.roundingicon);

        //Import font
        Typeface MMedium = Typeface.createFromAsset(getAssets(),  "fonts/MMedium.ttf");

        //Customize font
        bStart.setTypeface(MMedium);
        bStop.setTypeface(MMedium);

        bStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //passing Animation
                icanchor.startAnimation(roundingicon);
                bStop.animate().alpha(1).translationY(-80).setDuration(300).start();
                bStart.animate().alpha(0).setDuration(300).start();

                //Start time
                timerHere.setBase(SystemClock.elapsedRealtime());
                timerHere.start();

                bStart.setVisibility(View.INVISIBLE);
                bStop.setVisibility(View.VISIBLE);



            }
        });

        bStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timerHere.stop();
                timerHere.setBase(SystemClock.elapsedRealtime());

                bStart.setVisibility(View.VISIBLE);
                bStop.setVisibility(View.INVISIBLE);
            }
        });
    }
}

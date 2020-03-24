package rubyat13.shuvho13.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class StopWatchActivity extends AppCompatActivity {

    Button bStart, bStop;
    ImageView icanchor;
    Animation roundingicon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stop_watch);

        bStart =findViewById(R.id.bStart);
        bStop =findViewById(R.id.bStop);
        icanchor =findViewById(R.id.icanchor);


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

            }
        });
    }
}

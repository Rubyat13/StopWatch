package rubyat13.shuvho13.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class StopWatchActivity extends AppCompatActivity {

    Button bStart;
    ImageView icanchor;
    Animation roundingicon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stop_watch);

        bStart =findViewById(R.id.bStart);
        icanchor =findViewById(R.id.icanchor);

        //load animation
        roundingicon = AnimationUtils.loadAnimation(this,R.anim.roundingicon);

        //Import font
        Typeface MMedium = Typeface.createFromAsset(getAssets(),  "fonts/MMedium.ttf");

        //Customize font
        bStart.setTypeface(MMedium);

        bStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //passing Animation
                icanchor.startAnimation(roundingicon);

            }
        });
    }
}

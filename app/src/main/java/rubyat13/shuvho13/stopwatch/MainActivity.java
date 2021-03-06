package rubyat13.shuvho13.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

    //Design and Development By Al Rubyat

import static android.graphics.Typeface.*;

public class MainActivity extends AppCompatActivity {

    TextView tvSplash, tvSubSplash;
    Button bSplash;
    Animation atg;
    ImageView ivSplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvSplash = findViewById(R.id.tvSplash);
        tvSubSplash = findViewById(R.id.tvSubSplash);
        bSplash = findViewById(R.id.bSplash);
        ivSplash = findViewById(R.id.ivSplash);

        atg = AnimationUtils.loadAnimation(this, R.anim.atg);

        //Passing Animation
        ivSplash.startAnimation(atg);

        //Passing Activity event (Get Started button)
        bSplash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, StopWatchActivity.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }

        });

        //Import font
        Typeface MLight = Typeface.createFromAsset(getAssets(),  "fonts/MLight.ttf");
        Typeface MMedium = Typeface.createFromAsset(getAssets(),  "fonts/MMedium.ttf");
        Typeface MRegular = Typeface.createFromAsset(getAssets(),  "fonts/MRegular.ttf");

        // Customize font
        tvSplash.setTypeface(MRegular);
        tvSubSplash.setTypeface(MLight);
        bSplash.setTypeface(MMedium);
    }
}

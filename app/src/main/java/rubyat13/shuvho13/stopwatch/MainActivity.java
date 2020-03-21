package rubyat13.shuvho13.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import static android.graphics.Typeface.*;

public class MainActivity extends AppCompatActivity {

    TextView tvSplash, tvSubSplash;
    Button bSplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvSplash = findViewById(R.id.tvSplash);
        tvSubSplash = findViewById(R.id.tvSubSplash);
        bSplash = findViewById(R.id.bSplash);

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

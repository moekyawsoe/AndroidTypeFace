package akyab.mks.androidtypeface;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.lang.reflect.Type;

public class MainActivity extends AppCompatActivity {
private TextView txtOne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtOne = findViewById(R.id.txtText);
        Typeface typeface = Typeface.createFromAsset(getAssets(),"winresear.ttf");
        txtOne.setTypeface(typeface);
    }
}

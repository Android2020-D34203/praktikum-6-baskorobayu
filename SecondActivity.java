package id.ac.id.telkomuniversity.vsi3f4.praktikactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView textview2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textview2 = findViewById(R.id.textView);
        Intent i = getIntent();
        String Addtext = getIntent().getExtras().getString("EdtText");
        textview2.setText(" " + Addtext);
    }
}
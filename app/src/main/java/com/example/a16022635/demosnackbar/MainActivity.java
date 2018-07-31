package com.example.a16022635.demosnackbar;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnLauncher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLauncher = (Button) findViewById(R.id.btnLauncher);

        btnLauncher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Snackbar sb = Snackbar.make(v, "Yum Yum!!", Snackbar.LENGTH_SHORT);

                sb.setAction("Get a Toast!", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "Missed me?", 				Toast.LENGTH_SHORT).show();
                    }
                });

                sb.show();
            }
        });

    }
}

package com.example.bona.obsok1;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                StartApp();
                finishApp();
            }

        },3000);
    }
    private void StartApp(){
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
    private  void finishApp()
    {
        finish();


}
}

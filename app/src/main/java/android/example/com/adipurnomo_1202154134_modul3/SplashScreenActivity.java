package android.example.com.adipurnomo_1202154134_modul3;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SplashScreenActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 3000; // //inisiasi int SPLASH_TIME_OUT

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); // menampilkan activity tanpa judul
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); // menampilkan activity tanpa judul
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() { // membuat object timer
                Intent homeIntent = new Intent(SplashScreenActivity.this, LoginActivity.class); // pindah ke activity LoginActivity
                startActivity(homeIntent); // menjalankan activity
                finish(); // menghentikan activity

            }
        },SPLASH_TIME_OUT);
    }
}

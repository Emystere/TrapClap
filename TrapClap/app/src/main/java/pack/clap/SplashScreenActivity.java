package pack.clap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;

import pack.clap.QrMainActivity;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), QrMainActivity.class);
                startActivity(intent);
                finish();
            }
        };

<<<<<<< HEAD
        new Handler().postDelayed(runnable,0);
=======
        new Handler().postDelayed(runnable,5000);
>>>>>>> a1664602fa177e9967a697b7e02a5614ba790e4d
    }
}

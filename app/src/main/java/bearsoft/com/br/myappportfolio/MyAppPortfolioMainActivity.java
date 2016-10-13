package bearsoft.com.br.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MyAppPortfolioMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_app_portfolio_main);

        Button btnSpotifyApp = (Button) findViewById(R.id.btnAppSpotify);
        Button btnScoreApp = (Button) findViewById(R.id.btnAppScore);
        Button btnLibraryApp = (Button) findViewById(R.id.btnAppLibrary);
        Button btnBiggerApp = (Button) findViewById(R.id.btnBuiltBiggerApp);
        Button btnXyzRaderApp = (Button) findViewById(R.id.btnXyzApp);
        Button btnMyApp = (Button) findViewById(R.id.btnMyApp);


        btnSpotifyApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "This button will launch my Spotify Streamer App!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btnScoreApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "This button will launch my Score App!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btnLibraryApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "This button will launch my Library App!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btnBiggerApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "This button will launch my Built in Bigger App!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btnXyzRaderApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "This button will launch my XYZ Reader App!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btnMyApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "This button will launch my own App!",
                        Toast.LENGTH_SHORT).show();
            }
        });


    }
}

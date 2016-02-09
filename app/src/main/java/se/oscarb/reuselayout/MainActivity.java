package se.oscarb.reuselayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Instansvariabler
    RelativeLayout mainContainer;
    // Deklarera en textView
    TextView greeting;
    MyBigTextView biggerGreeting;

    // Klassvariabler


    // Konstruktorer


    // Instansmetoder

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Tilldela mainContent motsvarande view i vår layout
        mainContainer = (RelativeLayout) findViewById(R.id.main_container);

        // Initiera en textview
        greeting = new TextView(this);
        biggerGreeting = new MyBigTextView(this);

        // Ändra på attributen för vår TextView
        greeting.setText("Hello world!"); // TODO: Fixa i strings.xml
        greeting.setTextSize(20);
        //greeting.layou

        // Lägg till text i main_container
        mainContainer.addView(greeting);
        mainContainer.addView(biggerGreeting);

    }

    // Klassmetoder
}

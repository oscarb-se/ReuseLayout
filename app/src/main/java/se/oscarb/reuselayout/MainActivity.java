package se.oscarb.reuselayout;

import android.graphics.Color;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
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
        greeting.setBackgroundColor(Color.DKGRAY);
        greeting.setTextColor(getResources().getColor(R.color.colorAccent));

        // En generell LayoutParams
        ViewGroup.LayoutParams myParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                                                                     ViewGroup.LayoutParams.WRAP_CONTENT);

        // En specifik LayoutParams för RelativeLayout
        RelativeLayout.LayoutParams myRelativeParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                                                                                       ViewGroup.LayoutParams.WRAP_CONTENT);
        myRelativeParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM); // motsvarar XML-attributet android:layout_alignParentBottom

        greeting.setLayoutParams(myRelativeParams);


        //greeting.layou

        // Lägg till text i main_container
        mainContainer.addView(greeting);
        mainContainer.addView(biggerGreeting);

    }

    // Klassmetoder
}

package se.oscarb.reuselayout;

import android.graphics.Color;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
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







        // Hur kan jag använda en XML-fil med layout här i Java-koden?
        // Så att jag slipper skriva varje XML-attribut med Java-kod...

        // Svar: inflate (man rendererar layouten i en XML-fil)
        // och sparar det i en View här i vår Java-kod

        // Vi behöver något/någon som kan rendera åt oss...
        LayoutInflater layoutInflater = getLayoutInflater();

        View logotypeSquare = layoutInflater.inflate(R.layout.logotype_square, null);


        TextView logotypeText = (TextView) logotypeSquare.findViewById(R.id.textView);
        logotypeText.setText("Oscar!");

        // 0. Ha en LinearLayout att lägga till Views i (det underlättar!)
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linear_layout);

        for(int i = 1; i <= 5; i++) {
            // 1. Vi behöver en inflater (vi har en redan, layoutInflater)

            // 2. Låt inflater hämta XML-kod och skapa en View
            View aLogotypeSquare = layoutInflater.inflate(R.layout.logotype_square, null);

            // 3. Gör ändringar med vår aLogotypeSquare

            // 3.1 Ändra på texten inuti
            TextView aLogotypeSquareText = (TextView) aLogotypeSquare.findViewById(R.id.textView);
            aLogotypeSquareText.setText("" + i);

            // 3.2 Sätt ett ID (så vi kan komma åt en viss "logotypeSquare" senare
            //aLogotypeSquare.setId(aLogotypeSquare.generateViewId(R.i));

            // 4. Lägg till vår aLogotypeSquare i vår layout
            linearLayout.addView(aLogotypeSquare);




        }









        //RelativeLayout.LayoutParams myRelativeParams2 = new RelativeLayout.LayoutParams(100, 100);
        //myRelativeParams2.addRule(RelativeLayout.CENTER_IN_PARENT);

        //logotypeSquare.setLayoutParams(myRelativeParams2);


        linearLayout.addView(logotypeSquare);

        //mainContainer.addView(logotypeSquare);


        // Lägg till text i main_container
        // mainContainer.addView(greeting);
        // mainContainer.addView(biggerGreeting);

    }

    // Klassmetoder
}

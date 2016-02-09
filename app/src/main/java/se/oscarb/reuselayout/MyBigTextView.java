package se.oscarb.reuselayout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class MyBigTextView extends TextView {

    public MyBigTextView(Context context) {
        super(context);

        setText("Hello universe!");
        setTextSize(20);
    }
}

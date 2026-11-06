package com.tatkalai.app;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.*;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(30, 40, 30, 30);
        layout.setBackgroundColor(Color.WHITE);

        TextView title = new TextView(this);
        title.setText("TatkalAI");
        title.setTextSize(32);
        title.setTextColor(Color.rgb(20, 70, 150));
        title.setGravity(Gravity.CENTER);
        layout.addView(title);

        TextView subtitle = new TextView(this);
        subtitle.setText("Your Personal Tatkal Assistant");
        subtitle.setTextSize(16);
        subtitle.setGravity(Gravity.CENTER);
        layout.addView(subtitle);

        EditText train = new EditText(this);
        train.setHint("Train Number or Name");
        layout.addView(train);

        EditText from = new EditText(this);
        from.setHint("From Station");
        layout.addView(from);

        EditText to = new EditText(this);
        to.setHint("To Station");
        layout.addView(to);

        Button search = new Button(this);
        search.setText("Search Train");
        layout.addView(search);

        Button guide = new Button(this);
        guide.setText("Tatkal Booking Guide");
        layout.addView(guide);

        guide.setOnClickListener(v ->
            new android.app.AlertDialog.Builder(this)
                .setTitle("TatkalAI")
                .setMessage("Keep your IRCTC login and passenger details ready. Complete booking through official IRCTC.")
                .setPositiveButton("OK", null)
                .show()
        );

        search.setOnClickListener(v ->
            Toast.makeText(this,
                "Train search feature coming soon!",
                Toast.LENGTH_SHORT).show()
        );

        setContentView(layout);
    }
}

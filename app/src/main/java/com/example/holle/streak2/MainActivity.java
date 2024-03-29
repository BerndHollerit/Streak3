package com.example.holle.streak2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    long streak_counter = 12;
    Date currentTime = Calendar.getInstance().getTime();
    TextView streakTextView;
    TextView currentDateTextView;
    TextView lastDateTextView;
    //ImageButton smiliesImageButton;

    int date1 = 13;
    int date2 = 14;
    int pushedToday = 0;

    @SuppressLint("SimpleDateFormat")
    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmss");
    String currentDateandTime = sdf.format(new Date());

    @SuppressLint("SimpleDateFormat")
    SimpleDateFormat minutes = new SimpleDateFormat("mmss");
    String currentMinutes = minutes.format(new Date());
    String lastMinutes = "000000";
    int currentMinutesInt = Integer.parseInt(currentMinutes);
    int lastMinutesInt = Integer.parseInt(lastMinutes);

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        streak_counter++;
        pushedToday = 0;
        if(lastMinutesInt +2 <= currentMinutesInt)
            streak_counter = 0;


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        streakTextView = (TextView) findViewById(R.id.streak);
        currentDateTextView = (TextView) findViewById(R.id.currentDateTextView);
//        lastDateTextView = (TextView) findViewById(R.id.lastDateTextView);


        streakTextView.setText(Long.toString(streak_counter));

        currentDateTextView.setText("Water the flower until you get bored! Your streak (top right) will increase every minute! Don't miss a minute or your streak will reset to zero!");
//        currentDateTextView.setText(currentMinutes);

//        lastDateTextView.setText(lastMinutes);


//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                currentMinutes = minutes.format(new Date());
//                currentDateTextView.setText(currentMinutes);
//                currentMinutesInt = Integer.parseInt(currentMinutes);
//                if(lastMinutesInt +2 <= currentMinutesInt)
//                    streak_counter = 0;
//
//                if(pushedToday == 0 && currentMinutesInt > lastMinutesInt) {
//                    streak_counter++;
//                    pushedToday = 0;
//                    lastMinutes = currentMinutes;
//                    currentMinutes = minutes.format(new Date());
//                    currentMinutesInt = Integer.parseInt(currentMinutes);
//                    lastMinutesInt = Integer.parseInt(lastMinutes);
//                    currentDateTextView.setText(currentMinutes);
//                    lastDateTextView.setText(lastMinutes);
//
//                    streakTextView.setText(Long.toString(streak_counter));
//                }
//                if(date1==date2) {
//                    streak_counter+=2;
//                    streakTextView.setText(Long.toString(streak_counter));
//                }
//
////                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
////                        .setAction("Action", null).show();
//                streakTextView.setText(Long.toString(streak_counter));
//            }
//        });

//        Button refresh_button = (Button) findViewById(R.id.refresh_button);
//        refresh_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                currentMinutes = minutes.format(new Date());
//                currentDateTextView.setText(currentMinutes);
//                currentMinutesInt = Integer.parseInt(currentMinutes);
//
//                if(lastMinutesInt +2 <= currentMinutesInt)
//                    streak_counter = 0;
//
//
//
//                lastMinutes = currentMinutes;
//                currentMinutes = minutes.format(new Date());
//                currentMinutesInt = Integer.parseInt(currentMinutes);
//                lastMinutesInt = Integer.parseInt(lastMinutes);
//                currentDateTextView.setText(currentMinutes);
//                lastDateTextView.setText(lastMinutes);
//
//                streakTextView.setText(Long.toString(streak_counter));
//
//
//
////                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
////                        .setAction("Action", null).show();
//                streakTextView.setText(Long.toString(streak_counter));
//            }
//        });
//        Button increase_streak_button = (Button) findViewById(R.id.increase_streak);
//        increase_streak_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                currentMinutes = minutes.format(new Date());
//                currentDateTextView.setText(currentMinutes);
//                currentMinutesInt = Integer.parseInt(currentMinutes);
//                if(lastMinutesInt +2 <= currentMinutesInt)
//                    streak_counter = 0;
//
//                if(pushedToday == 0 && currentMinutesInt > lastMinutesInt) {
//                    streak_counter++;
//                    pushedToday = 0;
//                    lastMinutes = currentMinutes;
//                    currentMinutes = minutes.format(new Date());
//                    currentMinutesInt = Integer.parseInt(currentMinutes);
//                    lastMinutesInt = Integer.parseInt(lastMinutes);
//                    currentDateTextView.setText(currentMinutes);
//                    lastDateTextView.setText(lastMinutes);
//
//                    streakTextView.setText(Long.toString(streak_counter));
//                }
//                if(date1==date2) {
//                    streak_counter+=2;
//                    streakTextView.setText(Long.toString(streak_counter));
//                }
//
////                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
////                        .setAction("Action", null).show();
//                streakTextView.setText(Long.toString(streak_counter));
//            }
//        });
        final ImageButton smileys = (ImageButton) findViewById(R.id.wateringcan);
        smileys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                smileys.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        smileys.setImageResource(R.drawable.watering_can3);
                    }

                }, 0000); // 5000ms delay
                smileys.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        smileys.setImageResource(R.drawable.watering_can2);
                    }

                }, 1000); // 5000ms delay

                currentMinutes = minutes.format(new Date());
                currentDateTextView.setText(currentMinutes);
                currentMinutesInt = Integer.parseInt(currentMinutes);
                if(lastMinutesInt +2 <= currentMinutesInt)
                    streak_counter = 0;

                if(pushedToday == 0 && currentMinutesInt > lastMinutesInt) {
                    streak_counter++;
                    pushedToday = 0;
                    lastMinutes = currentMinutes;
                    currentMinutes = minutes.format(new Date());
                    currentMinutesInt = Integer.parseInt(currentMinutes);
                    lastMinutesInt = Integer.parseInt(lastMinutes);
                    currentDateTextView.setText(currentMinutes);
//                    lastDateTextView.setText(lastMinutes);

                    streakTextView.setText(Long.toString(streak_counter));
                }
                if(date1==date2) {
                    streak_counter+=2;
                    streakTextView.setText(Long.toString(streak_counter));
                }
                currentDateTextView.setText("Good job! Keep watering the flower until you get bored! Your streak (top right) will increase every minute! Don't miss a minute or your streak will reset to zero!");
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
                streakTextView.setText(Long.toString(streak_counter));
            }
        });
//        ImageButton smiliesImageButton = (ImageButton) findViewById(R.id.smilies);
//        smiliesImageButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                currentMinutes = minutes.format(new Date());
//                currentDateTextView.setText(currentMinutes);
//                currentMinutesInt = Integer.parseInt(currentMinutes);
//                if(lastMinutesInt +2 <= currentMinutesInt)
//                    streak_counter = 0;
//
//                if(pushedToday == 0 && currentMinutesInt > lastMinutesInt) {
//                    streak_counter++;
//                    pushedToday = 0;
//                    lastMinutes = currentMinutes;
//                    currentMinutes = minutes.format(new Date());
//                    currentMinutesInt = Integer.parseInt(currentMinutes);
//                    lastMinutesInt = Integer.parseInt(lastMinutes);
//                    currentDateTextView.setText(currentMinutes);
//                    lastDateTextView.setText(lastMinutes);
//
//                    streakTextView.setText(Long.toString(streak_counter));
//                }
//                if(date1==date2) {
//                    streak_counter+=2;
//                    streakTextView.setText(Long.toString(streak_counter));
//                }
//
////                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
////                        .setAction("Action", null).show();
//                streakTextView.setText(Long.toString(streak_counter));
//            }
//        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

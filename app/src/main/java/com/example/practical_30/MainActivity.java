package com.example.practical_30;

import static android.app.PendingIntent.getActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    final String LOG_TAG = "myLogs";
    MyService myService=new MyService();

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClickStart(View v) {
        startService(new Intent(this, MyService.class ));
        TextView t=(TextView)findViewById(R.id.textView);
        t.setText((CharSequence) myService.text);
    }

    public void onClickStop(View v) {
        stopService(new Intent(this, MyService.class));
    }
}

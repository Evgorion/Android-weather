package com.dagaz.evgeny.layoutfiles;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myscreen);
        TextView myTextView = (TextView)findViewById(R.id.textView1);
        myTextView.setText("HELLO MY JOK!");
        Button btn_num1 = (Button) findViewById(R.id.button1);
        btn_num1.setText("Ku Ku");
        btn_num1.setEnabled(false);
             }


}

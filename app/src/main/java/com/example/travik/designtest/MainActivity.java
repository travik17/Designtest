package com.example.travik.designtest;

import android.graphics.Typeface;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private FragmentTabHost mTabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface face = Typeface.createFromAsset(getAssets(),"fonts/Copse.ttf");

        TextView textView = (TextView) findViewById(R.id.veliotitle);
        textView.setTypeface(face);


        //Toolbar myToolbar = (Toolbar) findViewById(R.id.tool_bar);
        //setSupportActionBar(myToolbar);


        mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        mTabHost.setup(this, getSupportFragmentManager(), android.R.id.tabcontent);

        mTabHost.addTab(
                mTabHost.newTabSpec("tab1").setIndicator("Tab 1", null),
                FragmentTab.class, null);
        mTabHost.addTab(
                mTabHost.newTabSpec("tab2").setIndicator("Tab 2", null),
                FragmentTab.class, null);
        mTabHost.addTab(
                mTabHost.newTabSpec("tab3").setIndicator("Tab 3", null),
                FragmentTab.class, null);
        mTabHost.addTab(
                mTabHost.newTabSpec("tab4").setIndicator("Tab 4", null),
                FragmentTab.class, null);
    }
}

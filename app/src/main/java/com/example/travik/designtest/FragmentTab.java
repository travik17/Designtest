package com.example.travik.designtest;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FragmentTab extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.stats_layout, container, false);
        overrideFonts(getContext(), v);
        Button button = (Button) v.findViewById(R.id.testbutton);
        Button button2 = (Button) v.findViewById(R.id.testbutton2);

        if (getTag().equals("tab2")){
            final LinearLayout mainLayout = (LinearLayout) v.findViewById(R.id.frag);
            mainLayout.setBackgroundColor(getResources().getColor(R.color.Sytle8));

            GradientDrawable gradientDrawable = (GradientDrawable) button.getBackground();
            gradientDrawable.setStroke(2, getResources().getColor(R.color.Sytle1));

        } if (getTag().equals("tab3")){
            final LinearLayout mainLayout = (LinearLayout) v.findViewById(R.id.frag);
            mainLayout.setBackgroundColor(getResources().getColor(R.color.Sytle3));

            GradientDrawable gradientDrawable = (GradientDrawable) button.getBackground();
            gradientDrawable.setStroke(2, getResources().getColor(R.color.Sytle5));

        } if (getTag().equals("tab4")) {
            final LinearLayout mainLayout = (LinearLayout) v.findViewById(R.id.frag);
            mainLayout.setBackgroundColor(getResources().getColor(R.color.Sytle7));

            GradientDrawable gradientDrawable = (GradientDrawable) button.getBackground();
            gradientDrawable.setStroke(2, getResources().getColor(R.color.Sytle6));

            button.setBackground(getResources().getDrawable(R.drawable.rounded_square2));
            button2.setBackground(getResources().getDrawable(R.drawable.rounded_square3));
        }
        return v;
    }

    private void overrideFonts(final Context context, final View v) {
        try {
            if (v instanceof ViewGroup) {
                ViewGroup vg = (ViewGroup) v;
                for (int i = 0; i < vg.getChildCount(); i++) {
                    View child = vg.getChildAt(i);
                    overrideFonts(context, child);
                }
            } else if (v instanceof TextView ) {
                ((TextView) v).setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/Copse.ttf"));
            }
        } catch (Exception e) {
        }
    }
}
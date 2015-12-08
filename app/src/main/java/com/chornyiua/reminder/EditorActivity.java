package com.chornyiua.reminder;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.chornyiua.reminder.objectsToLists.BirthDay;

/**
 * Created by ChornyiUA on 08.12.2015.
 */
public class EditorActivity extends Activity {

    public final static String ID = "ID";
    public BirthDay birthDay;

    public TextView name, surname, description, date;
    public View circle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.editor_layout_birthday);

        // Retrieve data
        birthDay = BirthDay.getItem(getIntent().getIntExtra(ID, 0));

        // Views
        name = (TextView) findViewById(R.id.editor_name);
        surname = (TextView) findViewById(R.id.editor_surname);
        description = (TextView) findViewById(R.id.editor_description);
        date = (TextView) findViewById(R.id.editor_date);
        circle = findViewById(R.id.editor_circle);

        // Data population
        name.setText(birthDay.getName());
        //surname.setText(birthDay.getSurname());
        //description.setText(birthDay.getDescription());
        date.setText(birthDay.getDate()+"");
        //GradientDrawable bgShape = (GradientDrawable) circle.getBackground();
        //bgShape.setColor(Color.parseColor(birthDay.getColor()));

    }

}

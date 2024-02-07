package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;
import com.example.checkboxes.R;
import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CheckBox M, F;
    View rootView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        M = (CheckBox)findViewById(R.id.CheckBox_M);
        F = (CheckBox)findViewById(R.id.CheckBox_F);
        rootView = (View) findViewById(R.id.backgroundLayout);
    }
    public void on_M_Checked(View view) {
        CheckBox checkBox = (CheckBox) view;
        TextView selection = findViewById(R.id.resultText);
        if(checkBox.isChecked()) {
            selection.setText("Был выбран Mужской пол");
            F.setChecked(false);
            rootView.setBackgroundColor(Color.parseColor("#568dfc"));
        }
    }
    public void on_F_Checked(View view) {
        CheckBox checkBox = (CheckBox) view;
        TextView selection = findViewById(R.id.resultText);
        if(checkBox.isChecked()) {
            selection.setText("Был выбран Женский пол");
            M.setChecked(false);
            rootView.setBackgroundColor(Color.parseColor("#ff6b6b"));
        }
    }
}
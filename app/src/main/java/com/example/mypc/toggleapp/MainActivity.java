package com.example.mypc.toggleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ToggleButton;
public class MainActivity extends AppCompatActivity {
    ToggleButton btn;
    EditText e1;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (ToggleButton) findViewById(R.id.toggleButton);
        e1 = (EditText) findViewById(R.id.editText);
        b1 = (Button) findViewById(R.id.button);
        btn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if(isChecked==true) //Enable
                {
                    setEnabled(true);
                }
                else
                {
                    setEnabled(false);
                }
            }

            private void setEnabled(boolean b)
            {

            }
        });
    }
}

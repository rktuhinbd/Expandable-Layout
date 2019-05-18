package com.codenext.expandablelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.github.aakira.expandablelayout.ExpandableRelativeLayout;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout layout, layout2;
    private ExpandableRelativeLayout expandableRelativeLayout, expandableRelativeLayout2;
    private EditText editText1, editText2, editText3, editText4;
    Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.layout);
        expandableRelativeLayout = findViewById(R.id.expandable_layout);

        layout2 = findViewById(R.id.layout2);
        expandableRelativeLayout2 = findViewById(R.id.expandable_layout2);

        editText1 = findViewById(R.id.et_one);
        editText2 = findViewById(R.id.et_two);
        editText3 = findViewById(R.id.et_three);
        editText4 = findViewById(R.id.et_four);

        button1 = findViewById(R.id.bt_one);
        button2 = findViewById(R.id.bt_two);

        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandableRelativeLayout.toggle();
            }
        });

        layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandableRelativeLayout2.toggle();
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = 0, num2 = 0, sum;

                if(editText1.getText() != null) {
                    num1 = Integer.parseInt(editText1.getText().toString());
                }
                if(editText2.getText() != null) {
                    num2 = Integer.parseInt(editText2.getText().toString());
                }
                sum = num1 + num2;
                Toast.makeText(getApplicationContext(), "Sum is: " + sum, Toast.LENGTH_SHORT).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = 0, num2 = 0, sub;

                if(editText3.getText() != null) {
                    num1 = Integer.parseInt(editText3.getText().toString());
                }
                if(editText4.getText() != null) {
                    num2 = Integer.parseInt(editText4.getText().toString());
                }
                sub = num1 - num2;
                Toast.makeText(getApplicationContext(), "Sub is: " + sub, Toast.LENGTH_SHORT).show();
            }
        });
    }
}

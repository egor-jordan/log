package com.example.basketball;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    void authorization (){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        final TextView TextView1 = findViewById(R.id.textView1);
        final EditText editText = findViewById(R.id.editText);
        final EditText editText2 = findViewById(R.id.editText2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText2.getText().toString().equals("cska") && editText.getText().toString().equals( "champion"))
                {
                    TextView1.setTextColor(Color.parseColor("#4CAF50"));
                    String d = ("Верно");
                    TextView1.setText(d);
                }
                else {
                    editText.setText("");
                    editText2.setText("");
                    TextView1.setTextColor(Color.parseColor("#D0FF0E00"));
                    String d = ("Вы ошиблись в логине или пароле");
                    TextView1.setText(d);
                }
            }
        });
    }

}
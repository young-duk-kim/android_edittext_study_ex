package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Editable a;
    EditText editText;
    TextWatcher watcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InputFilter.LengthFilter filter = new InputFilter.LengthFilter(80);

        editText = findViewById(R.id.et);

        watcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                int b = editText.getText().length();
                a = editText.getText();
                //editable과 edittext를 연결해도 editable의 변화가 edittext에 영향을 미친다.
                if(b>10) {
                    a.delete(b - 2, b - 1);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        };

        editText.addTextChangedListener(watcher);

    }
}
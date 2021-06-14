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

        editText = findViewById(R.id.et);
        InputFilter filter = new InputFilter.LengthFilter(10);
        InputFilter[] filters = new InputFilter[]{filter};
        editText.setFilters(filters);
    }
}
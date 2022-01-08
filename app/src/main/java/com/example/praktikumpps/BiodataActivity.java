package com.example.praktikumpps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BiodataActivity extends AppCompatActivity {

    // deklarasi variable
    TextView tvNamaValue, tvNimValue, tvProdiValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        // instalasi variable
        tvNamaValue = findViewById(R.id.tvNamaValue);
        tvNimValue  = findViewById(R.id.tvNimValue);
        tvProdiValue = findViewById(R.id.tvProdiValue);

        Bundle bundle = getIntent().getExtras();
        tvNamaValue.setText(bundle.getString("KeyNama"));
        tvNimValue.setText(bundle.getString("KeyNim"));
        tvProdiValue.setText(bundle.getString("KeyProdi"));
    }
}
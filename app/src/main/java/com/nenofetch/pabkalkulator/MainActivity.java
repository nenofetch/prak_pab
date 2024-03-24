package com.nenofetch.pabkalkulator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void plus(View view) {
        EditText angkaPertama = (EditText) findViewById(R.id.angka_pertama);

        EditText angkaKedua = (EditText) findViewById(R.id.angka_kedua);

        int hitung = Integer.parseInt(angkaPertama.getText().toString()) + Integer.parseInt((angkaKedua.getText().toString()));
        TextView hasil = (TextView) findViewById(R.id.outputHasil);
        hasil.setText(String.valueOf(hitung));

    }

    public void minus(View view) {
        EditText angkaPertama = (EditText) findViewById(R.id.angka_pertama);

        EditText angkaKedua = (EditText) findViewById(R.id.angka_kedua);

        int hitung = Integer.parseInt(angkaPertama.getText().toString()) - Integer.parseInt((angkaKedua.getText().toString()));
        TextView hasil = (TextView) findViewById(R.id.outputHasil);
        hasil.setText(String.valueOf(hitung));
    }

    public void kali(View view) {
        EditText angkaPertama = (EditText) findViewById(R.id.angka_pertama);

        EditText angkaKedua = (EditText) findViewById(R.id.angka_kedua);

        int hitung = Integer.parseInt(angkaPertama.getText().toString()) * Integer.parseInt((angkaKedua.getText().toString()));
        TextView hasil = (TextView) findViewById(R.id.outputHasil);
        hasil.setText(String.valueOf(hitung));
    }

    public void bagi(View view) {
        EditText angkaPertama = (EditText) findViewById(R.id.angka_pertama);

        EditText angkaKedua = (EditText) findViewById(R.id.angka_kedua);

        double hitung = Double.parseDouble(angkaPertama.getText().toString()) / Double.parseDouble((angkaKedua.getText().toString()));
        TextView hasil = (TextView) findViewById(R.id.outputHasil);
        hasil.setText(String.valueOf(hitung));
    }
}
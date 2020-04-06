package com.dudenakb.pretest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class selanjutnya extends AppCompatActivity {
    EditText textNama;
    EditText Umur;
    Button Lanjut;

private String NAMES="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selanjutnya);

        textNama =(EditText)findViewById(R.id.etNama);
        Umur = (EditText)findViewById(R.id.etUmur);
        Lanjut = (Button)findViewById(R.id.selanjutnya);

            Lanjut.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String nama = textNama.getText().toString();
                    String umur = Umur.getText().toString();

                    if (nama.isEmpty()) {
                        textNama.setError(" Isi Nama Kamu Disini");
                        return;
                    }
                    if (umur.isEmpty()) {
                        Umur.setError(" Isi Umur Kamu Disini");
                        return;
                    }
                    next(nama);
                }

                private void next(String nama) {
                Intent intent = new Intent(getApplicationContext(), KelasAkhir.class);
                intent.putExtra(NAMES,nama);

                startActivity(intent);

            }

            });
        };

    }

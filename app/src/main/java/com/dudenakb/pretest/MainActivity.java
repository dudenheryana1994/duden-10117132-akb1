package com.dudenakb.pretest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//Tanggal Pengerjaan : 7 april 2020
//Deskripsi Pengerjaan : Mengerjakan Selanjutnya.java dan KelasAkhir.java
//NIM : 10117137
//Nama : Duden Heryana
//Kelas : IF-4

public class MainActivity extends AppCompatActivity {

    Button buttonMulai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonMulai = (Button) findViewById(R.id.buttonMulai);

        buttonMulai.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            Intent i = new Intent(MainActivity.this,
                                                    Login.class);
                                            startActivity(i);
                                        }
                                    }
        );
    }

 ;
}

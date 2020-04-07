package com.dudenakb.pretest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class KelasAkhir extends AppCompatActivity {
   TextView namasatu;
    TextView namadua;
    TextView namatiga;

    private String textnama;
   private String Names = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelas_akhir);
        namasatu = (TextView)findViewById(R.id.namasatu);
        namadua = (TextView)findViewById(R.id.namadua);
        namatiga = (TextView)findViewById(R.id.namatiga);
        Bundle extras = getIntent().getExtras();
        textnama = extras.getString(Names);
        namasatu.setText("" + textnama + " ");
        namadua.setText("" + textnama + " ");
        namatiga.setText("" + textnama + " ");


    }
}

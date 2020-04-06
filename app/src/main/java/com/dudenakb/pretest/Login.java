package com.dudenakb.pretest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    private EditText editCode;
    private Button buttonMasuk;
    public static final String KodeKeluarga = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editCode = findViewById(R.id.editCode);
        buttonMasuk = findViewById(R.id.masuk);
        editCode.setFilters(new InputFilter[]{new InputFilter.AllCaps()});

        buttonMasuk.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String KodeKeluarga = editCode.getText().toString();

                                if (KodeKeluarga.isEmpty()){
                    editCode.setError("Masukkan Kode Keluarga Disini");
                    return;
                }

                akses(KodeKeluarga);
            }
        });
    }
    private void akses(String KodeKeluarga){
        //create the intent
        Intent intent = new Intent(getApplicationContext(), selanjutnya.class);
        intent.putExtra(KodeKeluarga, KodeKeluarga);
        startActivity(intent);
    }
}
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
        buttonMasuk = findViewById(R.id.buttonMulai);
        editCode.setFilters(new InputFilter[]{new InputFilter.AllCaps()});

        buttonMasuk.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String editCode= editCode.getText().toString();

                if (editCode.isEmpty(){
                    editCode.setError("Masukkan Kode Keluarga Disini");
                    return;
                }

                akses(editCode);
            }
        });
    }
    private void akses(String editCode){
        //create the intent
        Intent intent = new Intent(getApplicationContext(), home.class);
        intent.putExtra(editCode, editCode);
        startActivity(intent);
    }
}
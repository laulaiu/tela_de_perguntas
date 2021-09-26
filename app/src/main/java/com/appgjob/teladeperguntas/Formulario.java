package com.appgjob.teladeperguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;

public class Formulario extends AppCompatActivity {

    private CheckBox  pergunta1;
    private CheckBox  pergunta2;
    private CheckBox  pergunta3;
    private CheckBox  pergunta4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        pergunta1 = findViewById(R.id.chk_pergunta1);
        pergunta2 = findViewById(R.id.chk_pergunta2);
        pergunta3 = findViewById(R.id.chk_pergunta3);
        pergunta4 = findViewById(R.id.chk_pergunta4);

    }
}
package com.example.calcularimc;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.activity.EdgeToEdge;

public class MainActivity extends AppCompatActivity {
    EditText inputPeso;
    EditText inputAltura;
    TextView lbMessage;
    private TextView txtResultado;
    private EditText inputpeso;
    private EditText inputtxtalt;
    private Button buttonCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
            inputpeso = findViewById(R.id.inputPeso);
            inputtxtalt = findViewById(R.id.inputAltura);
            txtResultado = findViewById(R.id.lbMessage);
        }

    public void calcularIMC(View view) {
            double peso = Double.parseDouble(inputpeso.getText().toString());
            double altura = Double.parseDouble(inputtxtalt.getText().toString());
            double imc = peso / (altura * altura);
            if (imc < 18.5) {
                txtResultado.setText("Abaixo do peso");
            } else if (imc >= 18.5 && imc <= 24.9) {
                txtResultado.setText("Peso normal");
            } else if (imc >= 25 && imc <= 29.9) {
                txtResultado.setText("Sobrepeso");
            } else if (imc >= 30 && imc <= 34.9) {
                txtResultado.setText("Obesidade");
            } else {
                txtResultado.setText("Obesidade grave");
            }
        }
};


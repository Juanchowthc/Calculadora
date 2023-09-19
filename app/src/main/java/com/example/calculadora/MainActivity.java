package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvResultado;
    float numero1 = 0.0f;
    float numero2 = 0.0f;
    String operacion = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResultado=findViewById(R.id.tvResultado);
    }

    public void escribirsiete(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        if (numero1 == 0.0f){
            tvResultado.setText("7");
        }
        else {
            tvResultado.setText(tvResultado.getText() + "7");
        }
    }

    public void escribirocho(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        if (numero1 == 0.0f){
            tvResultado.setText("8");
        }
        else {
            tvResultado.setText(tvResultado.getText() + "8");
        }
    }

    public void escribirnueve(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        if (numero1 == 0.0f){
            tvResultado.setText("9");
        }
        else {
            tvResultado.setText(tvResultado.getText() + "9");
        }
    }

    public void escribircuatro(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        if (numero1 == 0.0f){
            tvResultado.setText("4");
        }
        else {
            tvResultado.setText(tvResultado.getText() + "4");
        }
    }

    public void escribircinco(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        if (numero1 == 0.0f){
            tvResultado.setText("5");
        }
        else {
            tvResultado.setText(tvResultado.getText() + "5");
        }
    }

    public void escribirseis(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        if (numero1 == 0.0f){
            tvResultado.setText("6");
        }
        else {
            tvResultado.setText(tvResultado.getText() + "6");
        }
    }

    public void escribiruno(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        if (numero1 == 0.0f){
            tvResultado.setText("1");
        }
        else {
            tvResultado.setText(tvResultado.getText() + "1");
        }
    }

    public void escribirdos(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        if (numero1 == 0.0f){
            tvResultado.setText("2");
        }
        else {
            tvResultado.setText(tvResultado.getText() + "2");
        }
    }

    public void escribirtres(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        if (numero1 == 0.0f){
            tvResultado.setText("3");
        }
        else {
            tvResultado.setText(tvResultado.getText() + "3");
        }
    }

    public void escribircero(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        if (numero1 == 0.0f){
            tvResultado.setText("0");
        }
        else {
            tvResultado.setText(tvResultado.getText() + "0");
        }
    }

    public void limpiar(View view) {
        tvResultado.setText("0");
        numero1 = 0.0f;
        numero2 = 0.0f;
        operacion = "";
    }

    public void dividir(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        operacion = "/";
        tvResultado.setText("0");

    }

    public void multiplicar(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        operacion = "*";
        tvResultado.setText("0");

    }

    public void restar(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        operacion = "-";
        tvResultado.setText("0");

    }

    public void sumar(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        operacion = "+";
        tvResultado.setText("0");

    }

    public void resultado(View view) {
        numero2 = Float.parseFloat(tvResultado.getText().toString());
        if (operacion.equals("/")){
            if (numero2==0.0f){
                tvResultado.setText("0");
                Toast.makeText(this, "Operacion No Valida", Toast.LENGTH_LONG).show();
            }
            else {
                float result = numero1/numero2;
                tvResultado.setText(result + "");
            }

        }else if(operacion.equals("*")){
            float result = numero1*numero2;
            tvResultado.setText(result + "");

        }else if(operacion.equals("+")){
            float result = numero1+numero2;
            tvResultado.setText(result + "");

        }else if(operacion.equals("-")){
            float result = numero1-numero2;
            tvResultado.setText(result + "");

        }
        numero1 = 0.0f;
        numero2 = 0.0f;
        operacion = "";

    }
}
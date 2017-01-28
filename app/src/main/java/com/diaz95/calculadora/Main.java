package com.diaz95.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main extends AppCompatActivity implements View.OnClickListener {

    EditText num1, num2;
    Button Sumar, Restar, Multiplicar, Dividir;
    TextView Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);

        Sumar = (Button) findViewById(R.id.Sumar);
        Restar = (Button) findViewById(R.id.Restar);
        Multiplicar = (Button) findViewById(R.id.Multiplicar);
        Dividir = (Button) findViewById(R.id.Dividir);

        Resultado = (TextView) findViewById(R.id.resultado);

        Sumar.setOnClickListener(this);
        Restar.setOnClickListener(this);
        Multiplicar.setOnClickListener(this);
        Dividir.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        String n1 = num1.getText().toString();
        String n2 = num2.getText().toString();

        int entero1 = Integer.parseInt(n1);
        int entero2 = Integer.parseInt(n2);

        int rta = 0;

        switch (v.getId()){
            case R.id.Sumar:
                rta=entero1+entero2;
                break;
            case R.id.Restar:
                rta=entero1-entero2;
                break;
            case R.id.Multiplicar:
                rta=entero1*entero2;
                break;
            case R.id.Dividir:
                rta=entero1/entero2;
                break;
        }

        Resultado.setText(""+rta);

    }
}

package com.example.calculadora2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static Double resultado;
    public static String operador, reserva, mostrar;
    public static Button multi, div, menos, mas, btnIgual, c, coma;
    public static Button cero,uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve;
    public static TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.mostrar);
        nueve = (Button) findViewById(R.id.Nueve);
        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = textView.getText().toString();
                mostrar = mostrar + "9";
                textView.setText(mostrar);
            }
        });
        ocho = (Button) findViewById(R.id.Ocho);
        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = textView.getText().toString();
                mostrar = mostrar + "8";
                textView.setText(mostrar);
            }
        });
        siete = (Button) findViewById(R.id.Siete);
        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = textView.getText().toString();
                mostrar = mostrar + "7";
                textView.setText(mostrar);
            }
        });
        seis = (Button) findViewById(R.id.Seis);
        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = textView.getText().toString();
                mostrar = mostrar + "6";
                textView.setText(mostrar);
            }
        });
        cinco = (Button) findViewById(R.id.Cinco);
        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = textView.getText().toString();
                mostrar = mostrar + "5";
                textView.setText(mostrar);
            }
        });
        cuatro = (Button) findViewById(R.id.Cuatro);
        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = textView.getText().toString();
                mostrar = mostrar + "4";
                textView.setText(mostrar);
            }
        });
        tres = (Button) findViewById(R.id.Tres);
        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = textView.getText().toString();
                mostrar = mostrar + "3";
                textView.setText(mostrar);
            }
        });
        dos = (Button) findViewById(R.id.Dos);
        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = textView.getText().toString();
                mostrar = mostrar + "2";
                textView.setText(mostrar);
            }
        });
        uno = (Button) findViewById(R.id.Uno);
        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = textView.getText().toString();
                mostrar = mostrar + "1";
                textView.setText(mostrar);
            }
        });
        cero = (Button) findViewById(R.id.Cero);
        cero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = textView.getText().toString();
                mostrar = mostrar + "0";
                textView.setText(mostrar);
            }
        });
        c = (Button) findViewById(R.id.C);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = textView.getText().toString();
                mostrar = "";
                textView.setText(mostrar);
            }
        });
        coma = (Button) findViewById(R.id.Coma);
        coma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = textView.getText().toString();
                mostrar = mostrar + ".";
                textView.setText(mostrar);
            }
        });
        multi = (Button) findViewById(R.id.Multi);
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reserva = textView.getText().toString();
                operador = "*";
                textView.setText("");
            }
        });
        div = (Button) findViewById(R.id.Div);
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reserva = textView.getText().toString();
                operador = "/";
                textView.setText("");
            }
        });
        mas = (Button) findViewById(R.id.Mas);
        mas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reserva = textView.getText().toString();
                operador = "+";
                textView.setText("");
            }
        });
        menos = (Button) findViewById(R.id.Menos);
        menos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reserva = textView.getText().toString();
                operador = "-";
                textView.setText("");
            }
        });

        btnIgual = (Button) findViewById(R.id.Igual);
        btnIgual.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = textView.getText().toString();
                mostrar = mostrar + "1";
                if(operador.equals("-")){
                    resultado = Double.parseDouble(reserva) - Double.parseDouble(textView.getText().toString());
                    textView.setText(String.valueOf(resultado));
                }
                if(operador.equals("+")){
                    resultado = Double.parseDouble(reserva) + Double.parseDouble(textView.getText().toString());
                    textView.setText(String.valueOf(resultado));
                }
                if(operador.equals("/")){
                    resultado = Double.parseDouble(reserva) / Double.parseDouble(textView.getText().toString());
                    textView.setText(String.valueOf(resultado));
                }
                if(operador.equals("*")){
                    resultado = Double.parseDouble(reserva) * Double.parseDouble(textView.getText().toString());
                    textView.setText(String.valueOf(resultado));
                }
            }
        });
    }
}
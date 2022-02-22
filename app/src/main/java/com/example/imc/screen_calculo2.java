package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class screen_calculo2 extends AppCompatActivity {
    public TextView resulta;
    public Double imc;
    public TextView cadena;
    public ImageButton equipo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_calculo2);
        equipo=(ImageButton)findViewById(R.id.btn_equipo);
        resulta=(TextView)findViewById(R.id.txt_resulta);
        cadena=(TextView)findViewById(R.id.txt_cadena);
        Bundle extras=getIntent().getExtras();
        double pesos= extras.getDouble("peso");
        double estaturas= extras.getDouble("altura");
        imc= Math.round(pesos/Math.pow(estaturas,2)*100.0)/100.0;
        resulta.setText(""+imc);
        calculacion2();
        equipo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(getApplicationContext(),equipo.class);
                 startActivity(b);
            }
        });


    }

    public void calculacion2(){
        if(imc>=18.4&&imc<=24.9){
            cadena.setText("TU MARGEN DE PESO ES NORMAL");


        }
        else if (imc>=25.0&&imc<=29.9){
            cadena.setText("TU MARGEN DE PESO ES SOBREPESO");
        }
        else if (imc>=30.0&&imc<=34.9){
            cadena.setText("TU MARGEN DE PESO ES OBESIDAD GRADO 1");
        }
        else if (imc>=35.0&&imc<=39.9){
            cadena.setText("TU MARGEN DE PESO ES OBESIDAD GRADO 2");
        }
        else if (imc>=40.0){
            cadena.setText("TU MARGEN DE PESO ES OBESIDAD GRADO 3");
        }









    }





}

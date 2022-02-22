package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public EditText peso;
public EditText estatura;
public ImageButton limpiar;
public ImageButton hacer;






    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        peso=(EditText) findViewById(R.id.edt_peso);
        estatura=(EditText)findViewById(R.id.edt_medida);
        limpiar=(ImageButton)findViewById(R.id.btn_escobarxd);
        hacer=(ImageButton)findViewById(R.id.btn_calcular);





        limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                peso.setText("");
                estatura.setText("");
            }
        });

        hacer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               calculacion();
            }
        });





        }
    public void calculacion(){

        try {
            double calculo_peso = Double.parseDouble(peso.getText().toString());
            double calculo_altura = Double.parseDouble(estatura.getText().toString());

            Intent a = new Intent(this,screen_calculo2.class);
            a.putExtra("peso",calculo_peso);
            a.putExtra("altura",calculo_altura);
            startActivity(a);

        }catch (Exception i){
            Toast.makeText(this,"error en tipo de datos, intenta ingresar datos validos",Toast.LENGTH_SHORT).show();


        }


















    }

    }

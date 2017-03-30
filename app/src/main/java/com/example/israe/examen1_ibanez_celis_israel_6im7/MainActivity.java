package com.example.israe.examen1_ibanez_celis_israel_6im7;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;


public class MainActivity extends Activity {


    EditText cantidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cantidad = (EditText) findViewById(R.id.txtCantidad);
    }

    public void onClickConvertir(View v){
        if(cantidad.getText().toString().equals("")){
            Toast toast = Toast.makeText(getApplicationContext(),"Llena el campo.",Toast.LENGTH_SHORT);
            toast.show();
        }else{
            Intent envia = new Intent (this, Enviar.class);
            Bundle datos = new Bundle();
        float resultado = (Float.parseFloat(cantidad.getText().toString()))/15;
        datos.putFloat("resultado",resultado);
        envia.putExtras(datos);
        finish();
        startActivity(envia);
        }
    }
}

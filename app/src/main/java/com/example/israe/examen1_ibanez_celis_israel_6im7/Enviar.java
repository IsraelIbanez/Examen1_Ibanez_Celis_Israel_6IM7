package com.example.israe.examen1_ibanez_celis_israel_6im7;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.os.Bundle;

public class Enviar extends Activity {

    TextView resultado;
    float res = 0.0f;
    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enviar);
        resultado = (TextView) findViewById(R.id.lblResultado);
        Bundle recibe = new Bundle();
        recibe = this.getIntent().getExtras();
        res = recibe.getFloat("resultado");
        resultado.setText("Resultado: "+ res +"$");

    }

    public void onClickEnviar(View correo)
    {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Examen 1er Parcial");
        intent.putExtra(Intent.EXTRA_TEXT, "Resultado: " +res+ " $");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "eoropezag@ipn.mx"} );
        startActivity(intent);
    }

    public void regresar (View v)
    {
        Intent envia = new Intent (this, MainActivity.class);
        finish();
        startActivity(envia);
    }
}

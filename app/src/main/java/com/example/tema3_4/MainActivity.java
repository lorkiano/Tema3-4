package com.example.tema3_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Obtenemos referencias a los controles insertados en diseño
    EditText nombre;
    RadioGroup grupoColores;
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Capturamos
        nombre = findViewById(R.id.editTextTextPersonName);
        grupoColores = findViewById(R.id.rdColores);
        boton = findViewById(R.id.btnEnviar);




        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Capturamos opcion elegida del radiogroup
                int checkedId = grupoColores.getCheckedRadioButtonId();
                String color = "";

                switch (checkedId){
                    case R.id.rbRojo:
                        color = "rojo";
                        break;
                    case R.id.rbAmarillo:
                        color = "amarillo";
                        break;
                    case R.id.rbVerde:
                        color = "verde";
                        break;
                }
                // Listener para escuchar la acción del click del ratón
                String finalColor = color;

                // Creamos Intent para pasar de actividad
                Intent intent = new Intent(MainActivity.this, ActivitySaludo.class);

                // Información a pasar entre actividades
                Bundle bundle = new Bundle();
                bundle.putString("Nombre", nombre.getText().toString());
                bundle.putString("Color", finalColor.toString());

                // Pasamos la información al intent
                intent.putExtras(bundle);

                // Arrancamos la nueva actividad
                startActivity(intent);
            }
        });

    }
}
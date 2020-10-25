package com.example.tema3_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    // Obtenemos referencias a los controles insertados en diseño
    EditText nombre;
    RadioGroup color;
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Capturamos
        nombre = findViewById(R.id.editTextTextPersonName);
        color = findViewById(R.id.rdColores);
        boton = findViewById(R.id.btnEnviar);

        // Listener para escuchar la acción del click del ratón
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Creamos Intent para pasar de actividad
                Intent intent = new Intent(MainActivity.this, ActivitySaludo.class);

                // Información a pasar entre actividades
                Bundle bundle = new Bundle();
                bundle.putAll(bundle);

                // Pasamos la información al intent
                intent.putExtras(bundle);

                // Arrancamos la nueva actividad
                startActivity(intent);
            }
        });

    }
}
package com.example.tema3_4;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

public class ActivitySaludo extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);

        // Localizar controles de esta actividad en su xml correspondiente
        TextView txtNombre = (TextView)findViewById(R.id.textViewNombre);

        // Recuperamos la información del intent en un Bundle
        Bundle bundle = this.getIntent().getExtras();

        txtNombre.setText("Hola " + bundle.getString("Nombre"));
        String color = bundle.getString("Color");

        // Obtenemos el ID del layout en el que estamos
        ConstraintLayout currentLayout = (ConstraintLayout)findViewById(R.id.activitySaludo);

        // Según el color cambiamos el fondo del layout
        if(color.equals("rojo")){
            currentLayout.setBackgroundColor(Color.RED);
        }
        if(color.equals("verde")){
            currentLayout.setBackgroundColor(Color.GREEN);
        }
        if(color.equals("amarillo")){
            currentLayout.setBackgroundColor(Color.YELLOW);
        }



    }
}

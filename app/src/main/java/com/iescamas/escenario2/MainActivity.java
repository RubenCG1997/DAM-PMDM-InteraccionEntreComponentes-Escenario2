package com.iescamas.escenario2;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Spinner sp ;
    RadioButton rb1,rb2,rb3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = findViewById(R.id.sp_elementos);
        rb1 = findViewById(R.id.rb_opcion1);
        rb2 = findViewById(R.id.rb_opcion2);
        rb3 = findViewById(R.id.rb_opcion3);

        //Arracamos el spinner con las opciones 
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Opciones, android.R.layout.simple_spinner_item);
        //Se especifica el layout con el que empieza
        //adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Se asigna el adaptador al spinner
        sp.setAdapter(adapter);
        //Inicializo los botones con las opciones 1 2 3
        rb1.setText(R.string.opcionen1_1);
        rb2.setText(R.string.opcionen1_2);
        rb3.setText(R.string.opcionen1_3);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if(sp.getSelectedItem().equals("Fútbol")){
                    rb1.setText(R.string.opcionen1_1);
                    rb2.setText(R.string.opcionen1_2);
                    rb3.setText(R.string.opcionen1_3);
                } else if (sp.getSelectedItem().equals("Ríos")) {
                    rb1.setText(R.string.opcionen2_1);
                    rb2.setText(R.string.opcionen2_2);
                    rb3.setText(R.string.opcionen2_3);
                }
                else {
                    rb1.setText(R.string.opcionen3_1);
                    rb2.setText(R.string.opcionen3_2);
                    rb3.setText(R.string.opcionen3_3);
                }

            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}
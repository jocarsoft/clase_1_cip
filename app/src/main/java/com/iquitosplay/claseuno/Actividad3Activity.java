package com.iquitosplay.claseuno;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Actividad3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad3);
    }

    public void actividad2(View view){
        startActivity(new Intent(this, Ejemplo3Activity.class));
    }

    public void actividadMiSpinner(View view) {
        startActivity(new Intent(this, MiSpinner.class));
    }

    public void irTabHost(View view) {
        startActivity(new Intent(this, MiFragmentTabhost.class));
    }
}

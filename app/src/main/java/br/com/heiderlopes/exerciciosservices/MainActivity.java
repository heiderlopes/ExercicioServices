package br.com.heiderlopes.exerciciosservices;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import br.com.heiderlopes.exerciciosservices.atividade1.AlarmeActivity;
import br.com.heiderlopes.exerciciosservices.atividade1.AlarmeReceiver;
import br.com.heiderlopes.exerciciosservices.atividade3.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirExercicio1(View v) {
        startActivity(new Intent(this, AlarmeActivity.class));
    }

    public void abrirExercicio3(View v) {
        startActivity(new Intent(this, LoginActivity.class));
    }


}

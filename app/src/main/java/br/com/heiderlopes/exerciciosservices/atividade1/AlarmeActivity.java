package br.com.heiderlopes.exerciciosservices.atividade1;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import br.com.heiderlopes.exerciciosservices.R;

public class AlarmeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarme);
    }

    public void disparar(View v) {
        EditText etSegundos = (EditText)findViewById(R.id.etSegundos);
        int segundos = (Integer.parseInt(etSegundos.getText().toString()));

        Intent i = new Intent(this, AlarmeReceiver.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(this.getApplicationContext(),
                0, i, 0);

        AlarmManager alarmManager = (AlarmManager)getSystemService(ALARM_SERVICE);

        alarmManager.set(AlarmManager.RTC_WAKEUP,
                System.currentTimeMillis() + (segundos * 1000),
                pendingIntent);
        Toast.makeText(this, "Alarme para daqui " + segundos + "segundos", Toast.LENGTH_SHORT).show();
    }
}

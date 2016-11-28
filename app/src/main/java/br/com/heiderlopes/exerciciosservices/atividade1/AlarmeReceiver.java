package br.com.heiderlopes.exerciciosservices.atividade1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by heider on 28/11/16.
 */

public class AlarmeReceiver  extends BroadcastReceiver {

    public AlarmeReceiver() {

    }

    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Alarme ...", Toast.LENGTH_SHORT).show();
    }
}

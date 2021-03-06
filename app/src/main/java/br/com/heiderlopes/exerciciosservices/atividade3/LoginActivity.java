package br.com.heiderlopes.exerciciosservices.atividade3;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import java.util.Calendar;
import br.com.heiderlopes.exerciciosservices.R;

public class LoginActivity extends AppCompatActivity {

    private Calendar calendar;
    private int year, month, day;
    private Button btAniversario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btAniversario = (Button)findViewById(R.id.btAniversario);

        calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);

        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        showDate(year, month+1, day);
    }

    public void validar(View v) {
        Intent i = new Intent(this, LoginService.class);
        i.putExtra("nome", "Heider");
        startService(i);
    }
    @SuppressWarnings("deprecation")
    public void setDate(View view) {
        showDialog(999);
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        // TODO Auto-generated method stub
        if (id == 999) {
            return new DatePickerDialog(this,
                    myDateListener, year, month, day);
        }
        return null;
    }

    private DatePickerDialog.OnDateSetListener myDateListener = new
            DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker arg0,
                                      int year, int month, int day) {
                    showDate(year, month+1, day);
                }
            };

    private void showDate(int year, int month, int day) {
        btAniversario.setText(new StringBuilder().append(day).append("/")
                .append(month).append("/").append(year));
    }
}

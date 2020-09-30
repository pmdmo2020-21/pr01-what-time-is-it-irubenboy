package es.iessaladillo.ruben.whattimeisit;

import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupView();
    }

    private void setupView() {
        TextView lblFecha = ActivityCompat.requireViewById(this, R.id.lblFecha );
        TextView lblHora = ActivityCompat.requireViewById(this, R.id.lblHora);
        Date date = new Date();
        String actualDate= new SimpleDateFormat("dd/MM/yyyy").format(date);
        String actualTime = new SimpleDateFormat("HH:mm").format(date);
        lblFecha.setText(actualDate);
        lblHora.setText(actualTime);
    }
}
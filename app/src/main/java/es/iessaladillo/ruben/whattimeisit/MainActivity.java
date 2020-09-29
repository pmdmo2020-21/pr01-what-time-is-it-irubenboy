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
        String actualDate = dateNow();
        String actualTime = timeNow();
        TextView lblFecha = ActivityCompat.requireViewById(this, R.id.lblFecha );
        TextView lblHora = ActivityCompat.requireViewById(this, R.id.lblHora);
        lblFecha.setText(actualDate);
        lblHora.setText(actualTime);
    }

    private String timeNow() {
        return new SimpleDateFormat("HH:mm").format(new Date());
    }

    private String dateNow() {
        Date now = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        return format.format(now);
    }
}
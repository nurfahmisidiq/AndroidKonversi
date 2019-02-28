package id.sch.smktelkom_mlg.www.menuapp_fahmi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editRupiah;
    RadioButton radioDolar, radioEuro;
    Button btnOkKonversi;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editRupiah = findViewById(R.id.editRupiah);
        radioDolar = findViewById(R.id.radioDolar);
        radioEuro = findViewById(R.id.radioEuro);
        btnOkKonversi = findViewById(R.id.btnOkKonversi);
        txtHasil = findViewById(R.id.txtHasil);

        btnOkKonversi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nilairupiah = editRupiah.getText().toString();
                if (radioDolar.isChecked()) {
                    double hasil = Double.parseDouble(nilairupiah) / 13000;
                    String result = Double.toString(hasil);
                    txtHasil.setText(result);
                }
                if (radioEuro.isChecked()) {
                    double hasil = Double.parseDouble(nilairupiah) / 15000;
                    String result = Double.toString(hasil);
                    txtHasil.setText(result);
                }
            }
        });
    }
}
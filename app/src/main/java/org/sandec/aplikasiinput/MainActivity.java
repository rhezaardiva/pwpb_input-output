package org.sandec.aplikasiinput;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText eNama;
    private EditText eJam;
    private EditText eLapangan;
    private EditText eHari;
    private Button bbutton;
    private TextView Eoutputnama;
    private TextView Eoutputjam;
    private TextView Eoutputlapangan;
    private TextView Eoutputhari;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eNama = findViewById(R.id.idnama);
        eJam = findViewById(R.id.idjam);
        eLapangan = findViewById(R.id.idlapangan);
        eHari = findViewById(R.id.idhari);
        bbutton = findViewById(R.id.bButton);
        Eoutputnama = findViewById(R.id.IDoutputnama);
        Eoutputlapangan = findViewById(R.id.IDoutputlapangan);
        Eoutputjam = findViewById(R.id.IDoutputjam);
        Eoutputhari = findViewById(R.id.IDoutputhari);

        bbutton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        String inputNama = eNama.getText().toString();
        String inputLapangan = eLapangan.getText().toString();
        String inputJam = eJam.getText().toString();
        String inputHari = eHari.getText().toString();

        if (inputNama.length()==0){
            eNama.setError("Data tidak boleh kosong");
        } else {
            Eoutputnama.setText(inputNama);
        } if (inputLapangan.length()==0){
            eLapangan.setError("Data tidak boleh kosong");
        } else {
            Eoutputlapangan.setText(inputLapangan);
        } if (inputJam.length()==0){
            eJam.setError("Data tidak boleh kosong");
        } else {
            Eoutputjam.setText(inputJam);
        } if (inputHari.length()==0){
            eHari.setError("Data tidak boleh kosong");
        } else {
            Eoutputhari.setText(inputHari);
        }
    }
}

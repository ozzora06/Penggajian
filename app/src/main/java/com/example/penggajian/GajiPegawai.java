package com.example.penggajian;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ImageView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class GajiPegawai extends AppCompatActivity {

    EditText nik, nama, gapok, tunjab, jumhk, tunmak, tuntra, gakot, gaber;
    Button  btnhitung, btnkembali;
    Double vnik, vgapok, vtunjab, vjumhk, vtunmak, vtuntra, vgakot, vgaber;
    String vnama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_gaji_pegawai);
        nik = (EditText)findViewById(R.id.nik);
        nama = (EditText)findViewById(R.id.nama);
        gapok = (EditText)findViewById(R.id.gapok);
        tunjab = (EditText)findViewById(R.id.tunjab);
        jumhk = (EditText)findViewById(R.id.jumhk);
        tunmak = (EditText)findViewById(R.id.tunmak);
        tuntra = (EditText)findViewById(R.id.tuntra);
        gakot = (EditText)findViewById(R.id.gakot);
        gaber = (EditText)findViewById(R.id.gaber);
        btnhitung = (Button) findViewById(R.id.btnhitung);
        btnkembali = (Button) findViewById(R.id.btnkembali);

        //OnClick Button
        btnkembali = findViewById(R.id.btnkembali);
        btnkembali.setOnClickListener(v -> finish());
    }

    public void Hitung(View view) {
        vnik = Double.parseDouble(nik.getText().toString());
        vgapok = Double.parseDouble(gapok.getText().toString());
        vtunjab = Double.parseDouble(tunjab.getText().toString());
        vjumhk = Double.parseDouble(jumhk.getText().toString());

        vtunmak = vjumhk * 10000;
        vtuntra = vjumhk * 5000;
        vgakot = vgapok + vtunjab + vtunmak + vtuntra;
        vgaber = vgakot - (0.1 * vgakot);

        tunmak.setText(vtunmak+" : Tunjangan Makan");
        tuntra.setText(vtuntra+" : Tunjangan Transportasi");
        gakot.setText(vgakot+" : Gaji Kotor");
        gaber.setText(vgaber+" : Gaji Bersih");
    }





}
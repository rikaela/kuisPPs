package com.example.praktikumpps;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {
    // deklarasi variabale
    Button btnSimpan, btnHapus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        // menampilkan toast saat button simpan diklik
        btnSimpan = findViewById(R.id.btnSimpan);
        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FormActivity.this, "data simpan", Toast.LENGTH_LONG).show();
            }
        });

        // menampilkan alert dialog saat button Hapus diklik
        btnHapus = findViewById(R.id.btnHapus);
        btnHapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder AlertDialogBuilder = new AlertDialog.Builder(FormActivity.this);
                // membuat judul alert dialog
                AlertDialogBuilder.setTitle("peringatan!");
                // membuat pesan alert dialog
                AlertDialogBuilder.setMessage("apakah anda yakin akan menghapus data?")
                        .setIcon(R.drawable.daffa)
                        .setCancelable(false)
                        .setPositiveButton("ya", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "data dihapus", Toast.LENGTH_LONG).show();
                            }
                        })
                        .setNegativeButton("tidak", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int which) {
                                dialogInterface.cancel();
                            }
                        });
                AlertDialog alertDialog = AlertDialogBuilder.create();

                alertDialog.show();
            }
        });
    }
}
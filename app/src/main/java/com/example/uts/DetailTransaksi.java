package com.example.uts;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class DetailTransaksi extends AppCompatActivity {
    Transaksi trns;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saldo);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1,menu);
        return true;
    };

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.opsi_profil:
                Intent intent= new Intent(this,DetailProfile.class);
                startActivity(intent);
                return true;
            case R.id.opsi_saldo:Intent intent2= new Intent(this, DetailSaldo.class);
                startActivity(intent2);
                return true;
            case R.id.opsi_transaksi:Intent intent3= new Intent(this,DetailTransaksi.class);
                startActivity(intent3);
                return true;
            case R.id.logout:finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

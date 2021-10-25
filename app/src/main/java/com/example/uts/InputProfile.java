package com.example.uts;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.uts.databinding.InputProfileBinding;
import com.google.gson.Gson;

public class InputProfile extends AppCompatActivity {
    Profile prfl;
    InputProfileBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.input_profile);

        prfl = new Profile();
        binding.setPrfl(prfl);
        binding.setActivity(this);
    }

    public View.OnClickListener btnSaveProfile = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent DetailProfile = new Intent(InputProfile.this, DetailProfile.class);

            Gson gson = new Gson();
            String strProfile = gson.toJson(prfl);

            DetailProfile.putExtra("Profile", strProfile);

            startActivity(DetailProfile);
        }
    };
}

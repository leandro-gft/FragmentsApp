package br.com.gft.fragments.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import br.com.gft.fragments.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Remover sombra do action bar
        getSupportActionBar().setElevation(0);
    }
}

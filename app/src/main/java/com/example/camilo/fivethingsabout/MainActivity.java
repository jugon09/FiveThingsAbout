package com.example.camilo.fivethingsabout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setListenersButtons();
    }

    private void setListenersButtons() {
        ToggleButton btPortAventura = (ToggleButton) findViewById(R.id.verMasPortAventura);
        btPortAventura.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                TextView txtPortAventura = (TextView) findViewById(R.id.textPortAventura);
                if (isChecked) {
                    txtPortAventura.setText(R.string.textoAmpliadoPortAventura);
                }
                else {
                    txtPortAventura.setText(R.string.textoReducidoPortAventura);
                }
            }
        });
        ToggleButton btIllaFantasia = (ToggleButton) findViewById(R.id.verMasIllaFantasia);
        btIllaFantasia.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                TextView txtIllaFantasia = (TextView) findViewById(R.id.textIllaFantasia);
                if (isChecked) {
                    txtIllaFantasia.setText(R.string.textoAmpliadoIllaFantasia);
                } else {
                    txtIllaFantasia.setText(R.string.textoReducidoIllaFantasia);
                }
            }});
        ToggleButton btPlaya = (ToggleButton) findViewById(R.id.verMasPlaya);
        btPlaya.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                TextView textPlaya = (TextView) findViewById(R.id.textPlaya);
                if (isChecked) {
                    textPlaya.setText(R.string.textoAmpliadoPlaya);
                }
                else {
                    textPlaya.setText(R.string.textoReducidoPlaya);
                }
            }
        });
        ToggleButton btDiscotecas = (ToggleButton) findViewById(R.id.verMasDiscotecas);
        btDiscotecas.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                TextView txtDiscotecas = (TextView) findViewById(R.id.textDiscotecas);
                if (isChecked) {
                    txtDiscotecas.setText(R.string.textoAmpliadoDiscotecas);
                }
                else {
                    txtDiscotecas.setText(R.string.textoReducidoDiscotecas);
                }
            }
        });
        ToggleButton btAquarium = (ToggleButton) findViewById(R.id.verMasAquarium);
        btAquarium.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                TextView txtAquarium = (TextView) findViewById(R.id.textAquarium);
                if (isChecked) {
                    txtAquarium.setText(R.string.textoAmpliadoAquarium);
                }
                else {
                    txtAquarium.setText(R.string.textoReducidoAquarium);
                }
            }
        });
    }
}

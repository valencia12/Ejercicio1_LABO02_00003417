package com.example.labo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener{
private Button Mostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Mostrar = findViewById(R.id.Mostrar);
        Mostrar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.Mostrar:
                EditText  Show = findViewById(R.id.tx1);
                TextView  tv1 = findViewById(R.id.Show);
                tv1.setText(Show.getText().toString());
        }
    }

    @Override
    public boolean onLongClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.Mostrar:
                EditText  Show = findViewById(R.id.tx2);
                TextView  tv1 = findViewById(R.id.Show);
                tv1.setText(Show.getText().toString());
        }
        return true;
    }
}

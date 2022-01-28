package com.example.actividade2aula;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            EditText l = (EditText) findViewById(R.id.nome);
            EditText n = (EditText) findViewById(R.id.telefone);
            EditText s = (EditText) findViewById(R.id.seña);
            EditText a = (EditText) findViewById(R.id.algo);
            EditText e = (EditText) findViewById(R.id.email);

            TextView t = (TextView) findViewById(R.id.titulo);

            t.setText(l.getText() + "-" + n.getText() + "-" + e.getText()+"-"+s.getText()+"-"+a.getText()+"-"+e.getText());

            Button b = (Button) findViewById(R.id.button);
            b.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    t.setText(l.getText() + "-" + n.getText() + "-" + e.getText()+"-"+s.getText()+"-"+a.getText()+"-"+e.getText());

                }
            });
        }
    }

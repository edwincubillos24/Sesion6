package com.edwinacubillos.ejnotas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText Quiz = (EditText) findViewById(R.id.eQuiz);
        final EditText Expo = (EditText) findViewById(R.id.eExpo);
        final EditText Pract = (EditText) findViewById(R.id.ePract);
        final EditText Proy = (EditText) findViewById(R.id.eProy);
        final EditText NotaF = (EditText) findViewById(R.id.eNotaF);
        final Button calcular = (Button) findViewById(R.id.bCalc);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double qui, exp, prac, pro, nota;

                qui = Double.parseDouble(Quiz.getText().toString());
                exp = Double.parseDouble(Expo.getText().toString());
                prac = Double.parseDouble(Pract.getText().toString());
                pro = Double.parseDouble(Proy.getText().toString());
                nota = qui * .15 + exp * 0.1 + prac * 0.4 + pro * 0.35;
                NotaF.setText(String.valueOf(nota));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
   /*     if (id == R.id.action_settings) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }
}

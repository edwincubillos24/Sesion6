package com.edwinacubillos.ejnotas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class ConfActiviy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conf);

        final EditText cQuiz = (EditText) findViewById(R.id.eCQuiz);
        final EditText cExpo = (EditText) findViewById(R.id.eCExpo);
        final EditText cPract = (EditText) findViewById(R.id.eCPract);
        final EditText cProy = (EditText) findViewById(R.id.eCProy);

        Bundle extras = getIntent().getExtras();
        cQuiz.setText(String.valueOf(extras.getInt("pQuiz")));
        cExpo.setText(String.valueOf(extras.getInt("pExpo")));
        cPract.setText(String.valueOf(extras.getInt("pPra")));
        cProy.setText(String.valueOf(extras.getInt("pPro")));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_conf_activiy, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
package com.example.rafael.rosamobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataBaseHelper a = new DataBaseHelper(getApplicationContext());
        System.out.println("aqui3");
        try {
            System.out.println("aqui");
            a.createDataBase();
        } catch (IOException e) {
            System.out.println("aqui1");
            e.printStackTrace();
        }

    }

    public void myClickMenu(View v){
        setContentView(R.layout.menu);
    }
    public void myClickCliente(View v){
        setContentView(R.layout.cliente);
    }
    public void myClickClientePedido(View v){
        setContentView(R.layout.cliente_pedido_list);
    }
    public void myClickPedido(View v){
        setContentView(R.layout.pedido_list);
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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

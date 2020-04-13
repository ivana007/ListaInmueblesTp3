package com.example.listainmueblestp3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ArrayList<Inmueble> lista= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargarDatos();
        generarVista();
    }
    public void cargarDatos(){
        lista.add(new Inmueble(R.drawable.casa10,"Juana Koslay",800000));
        lista.add(new Inmueble(R.drawable.casa1,"Merlo",750000));
        lista.add(new Inmueble(R.drawable.casa4,"Potrero de los Funes",980000));
    }
    public void generarVista(){

        ArrayAdapter<Inmueble> adapter=new ListaAdapter(this,R.layout.item,lista,getLayoutInflater());
        ListView lv=findViewById(R.id.miLista);
        lv.setAdapter(adapter);
    }
}

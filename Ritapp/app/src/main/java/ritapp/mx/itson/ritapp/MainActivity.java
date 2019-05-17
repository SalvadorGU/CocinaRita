package ritapp.mx.itson.ritapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Arrays;

import mx.itson.ritapp.Entidades.Usuario;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        (findViewById(R.id.btnRegistrar)).setOnClickListener(this);
        (findViewById(R.id.btnInicioSesion)).setOnClickListener(this);

    }


    public void onClick(final View v){


        switch (v.getId()){

            case R.id.btnRegistrar:

                Intent intentRegistro = new Intent(this, registroUsuarioActivity.class);
                startActivity(intentRegistro);
                break;
            case R.id.btnInicioSesion:
                Intent intentInicio = new Intent(this, menuPrincipalActivity.class);
                startActivity(intentInicio);
                break;



        }


    }



    }






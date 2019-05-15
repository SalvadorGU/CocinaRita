package ritapp.mx.itson.ritapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        (findViewById(R.id.btnRegistrar).setOnClickListener(this);
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



package ritapp.mx.itson.ritapp;

import android.content.Intent;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

import mx.itson.ritapp.mx.itson.ritapp.tools.Constantes;
import mx.itson.ritapp.mx.itson.ritapp.web.VolleySingleton;

public class registroUsuarioActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = registroUsuarioActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuario);
        (findViewById(R.id.btnRegistro)).setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btnRegistro:

                Intent intentInicio = new Intent(this, menuPrincipalActivity.class);

                startActivity(intentInicio);
                break;


                default:
                    break;
        }


    }








}

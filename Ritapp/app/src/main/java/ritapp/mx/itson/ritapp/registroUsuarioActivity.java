package ritapp.mx.itson.ritapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class registroUsuarioActivity extends AppCompatActivity implements View.OnClickListener {

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
        }


    }
}

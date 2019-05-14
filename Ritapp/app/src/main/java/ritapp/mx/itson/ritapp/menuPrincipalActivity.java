package ritapp.mx.itson.ritapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class menuPrincipalActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        (findViewById(R.id.btnOrdenar)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btnOrdenar:
                Intent intentMenu = new Intent(this, tipoPlatilloActivity.class);
                startActivity(intentMenu);

                break;
        }

    }
}

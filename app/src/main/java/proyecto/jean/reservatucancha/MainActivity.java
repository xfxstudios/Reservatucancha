package proyecto.jean.reservatucancha;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button Horarios;
    Button canchas;

    public Button getCanchas() {
        return canchas;
    }

    
    public Button getHorarios() {
        return Horarios;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        canchas=(Button)findViewById(R.id.button);
        canchas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent canchas = new Intent(MainActivity.this, Main3Activity_cancha.class);
                startActivity(canchas);
            }
        });

        Toast.makeText(getApplicationContext(), "Bienvenidos", Toast.LENGTH_SHORT).show();
        Horarios=(Button)findViewById(R.id.button2);
        Horarios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent Horarios = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(Horarios);
                Toast.makeText(getApplicationContext(), "Seleccione Horarios", Toast.LENGTH_SHORT).show();
            }
        });





    }
}

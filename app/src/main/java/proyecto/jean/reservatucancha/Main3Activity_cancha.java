package proyecto.jean.reservatucancha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Main3Activity_cancha extends AppCompatActivity {
   ListView lista;
    String[][] datos={
            {"titulo","information","image_cancha"},
            {"titulo","information","image_cancha"},


    };
    int[] datosImg={R.drawable.cancha,R.drawable.a};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3_cancha);
         lista = (ListView) findViewById(R.id.LvLista);

        lista.setAdapter(new adaptador(this, datos, datosImg));


    }
}

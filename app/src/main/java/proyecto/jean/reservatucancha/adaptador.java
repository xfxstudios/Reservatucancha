package proyecto.jean.reservatucancha;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class adaptador extends BaseAdapter {

    private static LayoutInflater inflater = null;
    Context contexto;
    String[][]datos;
    int[] datosImg;
   public adaptador(Context conexto, String[][] datos , int[] imagen){
       this.contexto =conexto;
       this.datos = datos;
       this.datosImg = imagen;
       inflater =(LayoutInflater)conexto.getSystemService(conexto.LAYOUT_INFLATER_SERVICE);


    };

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {

      final View vista =inflater.inflate(R.layout.elemento_lista , null);
        TextView Titulo = (TextView) vista.findViewById(R.id.titulo);
        TextView informacion= ( TextView ) vista.findViewById( R.id.information);


        ImageView imaje = (ImageView) vista.findViewById(R.id.image_cancha);
        Titulo.setText(datos[i][0]);
        informacion.setText(datos[i][1]);

        imaje.setImageResource(datosImg[i]);
        imaje.setTag(i);


        return vista;
    }
    @Override
    public int getCount() {
        return datosImg.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


}

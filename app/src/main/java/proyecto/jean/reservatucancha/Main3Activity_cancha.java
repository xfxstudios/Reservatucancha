package proyecto.jean.reservatucancha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Main3Activity_cancha extends AppCompatActivity {
   ListView lista;
    String[][] datos;
    int[] datosImg={R.drawable.cancha,R.drawable.a};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3_cancha);
         lista = (ListView) findViewById(R.id.LvLista);
       
       RequestQueue queue = Volley.newRequestQueue(this);
            JsonObjectRequest jobReq = new JsonObjectRequest(Request.Method.POST, "AQUI LA URL", jObject,
                    new Response.Listener<JSONObject>() {
                        @Override
                        public void onResponse(JSONObject jsonObject) {

                           JSONArray array = new JSONArray();

                              for(int i=0;i<jsonObject.size();i++){
                                  JSONObject obj=new JSONObject();
                                  try {
                                      obj.put("clave",jsonObject.get(i));
                                  } catch (JSONException e) {
                                      e.printStackTrace();
                                  }
                                  datos.put(obj);
                              }

                           lista.setAdapter(new adaptador(this, datos, datosImg));

                        }
                    },
                    new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError volleyError) {

                        }
                    });

            queue.add(jobReq);

        


    }
}

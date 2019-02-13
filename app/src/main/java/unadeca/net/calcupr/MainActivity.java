package unadeca.net.calcupr;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Variables
        final EditText a = findViewById(R.id.num1);
        final EditText b = findViewById(R.id.num1);
        final TextView respuesta = findViewById(R.id.respuesta);

        //Boton de Suma
        Button sumar = findViewById(R.id.btnsuma);
        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                respuesta.setText(String.format(Locale.getDefault(),"%d", sumar(Integer.parseInt(a.getText().toString()), Integer.parseInt(b.getText().toString()))));

            }
        });


        private void validacion(EditText a, EditText b){
            if(a.getText().toString().isEmpty()){a.setText(getResources().getString(R.string.place_holder);}
        } if(b.getText().toString().isEmpty()){
            Toast.makeText(getApplicationContext(), getResources().getString(R.string.errorb), Toast.LENGTH_LONG ).show();
        }


        //Boton de Resta
        Button restar = findViewById(R.id.btnresta);
        restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                respuesta.setText(String.format(Locale.getDefault(),"%d", restar(Integer.parseInt(a.getText().toString()), Integer.parseInt(b.getText().toString()))));

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
        //Función de Suma
    private int sumar(int num1, int num2){
        return (num1 + num2);}

        //Funcion RESTA
        private int restar(int num1, int num2){
            return (num1 + num2);}

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

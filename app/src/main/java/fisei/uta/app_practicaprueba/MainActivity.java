package fisei.uta.app_practicaprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etNombres;
    EditText etApellidos;
    EditText etBase;
    EditText etExponente;
    EditText etFactorial;
    EditText etPotencia;
    Button btnSiguiente;
    Button btnMostrarResultados;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombres = findViewById(R.id.editTextNombreTA);
        etApellidos = findViewById(R.id.editTextApellidosMA);
        etBase = findViewById(R.id.editTextBaseMA);
        etExponente = findViewById(R.id.editTextExponenteMA);
        etFactorial = findViewById(R.id.editTextFactorialMA);
        etPotencia = findViewById(R.id.editTextPontenciaMA);
        btnSiguiente = findViewById(R.id.buttonSiguiente);
        btnMostrarResultados = findViewById(R.id.buttonMostrarResultados);

        /*btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SegundaActivity.class);
                startActivity(intent);
            }
        });*/

        btnMostrarResultados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = getIntent().getExtras();
                etNombres.setText(bundle.getString("nombres"));
                etApellidos.setText(bundle.getString("apellidos"));
                etBase.setText(bundle.getString("base"));
                etExponente.setText(bundle.getString("exponente"));
                String numero = bundle.getString("numero");
                int factorial = factorial(Integer.parseInt(numero));
                etFactorial.setText(String.valueOf(factorial));


                int potencia = devolverPotencia(Integer.parseInt(bundle.getString("base")),
                                                    Integer.parseInt(bundle.getString("exponente")));
                etPotencia.setText(String.valueOf(potencia));

            }
        });

    }

    public void clicSiguiente(View vista){
        Intent intent = new Intent(this, SegundaActivity.class);
        startActivity(intent);
    }

    public int factorial(int num){
        int factorial = 1;
       // int num = Integer.parseInt(edNumero.getText().toString());
        for (int i = 1; i <= num; i++) {
            factorial = i * factorial;
        }
        return factorial;
    }

    public int devolverPotencia(int base, int exponente){
        int p =1;
           while(exponente>0)
        {
            //calculando potencia
            p=p*base;
            exponente--;
        }
           return p;
    }


}
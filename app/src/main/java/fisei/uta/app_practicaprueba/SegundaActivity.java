package fisei.uta.app_practicaprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SegundaActivity extends AppCompatActivity {
    EditText etNombres;
    EditText etBase;
    Button btnSiguiente;
    Button btnCerrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        etNombres = findViewById(R.id.editTextNombreSA);
        etBase = findViewById(R.id.editTextBaseSA);
        btnSiguiente = findViewById(R.id.buttonSig);
        btnCerrar = findViewById(R.id.buttonClose);

        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = etNombres.getText().toString();
                String base = etBase.getText().toString();
                Intent intent = new Intent(getApplicationContext(), TercerActivity.class);
                intent.putExtra("nombres", n);
                intent.putExtra("base", base);
                startActivity(intent);
                //.finish();

            }
        });
        btnCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }

}
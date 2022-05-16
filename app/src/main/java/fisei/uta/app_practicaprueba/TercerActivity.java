package fisei.uta.app_practicaprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TercerActivity extends AppCompatActivity {
    EditText etApellido;
    EditText etNombre;
    EditText etBase;
    EditText etExponente;
    EditText etNumero;
    Button btnCerrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercer);
        etApellido = findViewById(R.id.editTextApellidosTA);
        etNombre = findViewById(R.id.editTextNombreTA);
        etBase = findViewById(R.id.editTextBaseTA);
        etExponente = findViewById(R.id.editTexExponenteTA);
        etNumero = findViewById(R.id.editTextNumeroTA);
        btnCerrar = findViewById(R.id.buttonCloseTA);

       Bundle bundle = getIntent().getExtras();
        etNombre.setText(bundle.getString("nombres"));
        etBase.setText(bundle.getString("base"));

      btnCerrar.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              String a = etApellido.getText().toString();
              String n = etNombre.getText().toString();
              String base = etBase.getText().toString();
              String exponente = etExponente.getText().toString();
              String numero = etNumero.getText().toString();
              Intent intent = new Intent(getApplicationContext(), MainActivity.class);
              intent.putExtra("apellidos", a );
              intent.putExtra("nombres", n );
              intent.putExtra("base", base );
              intent.putExtra("exponente", exponente );
              intent.putExtra("numero", numero );
              startActivity(intent);
              finish();
          }
      });
    }
}
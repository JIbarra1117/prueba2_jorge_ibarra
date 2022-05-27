package com.deitel.doodlz;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class loginActivity extends AppCompatActivity {
    //clyaldas@uta.edu.ec
    //Primer usuario: CLAY contrasenia: CLAY
    //Segundo usuario: FERNANDO contrasenia: FERNANDO
    private EditText etNomUsuario;
    private EditText etContrasenia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etNomUsuario = findViewById(R.id.etUsuarioLogin);
        etContrasenia = findViewById(R.id.etContraLogin);
    }//validar login

    public void IniciarSesion(View view) {

        String email = etNomUsuario.getText().toString();
        String password = etContrasenia.getText().toString();

        if (email.equals("") && password.equals("")) {
            Toast.makeText(this, "CAMPOS VACIOS", Toast.LENGTH_SHORT).show();
        } else {
            //String consulta = "SELECT * FROM Usuarios WHERE USUARIO = '" + email + "' and CONTRASEÑA = '" + password +"'";
            // Cursor cursor = sql.rawQuery(consulta, null);
            String usuario = "", contra = "", nombre = "", apellido = "";
            if (email.equals("CLAY") && password.equals("CLAY")) {
                Intent intent = new Intent(this, MainActivity.class);
                intent.putExtra("nombre", nombre);
                intent.putExtra("apellido", apellido);
                startActivity(intent);
                Toast.makeText(this, "Login correcto[PRIMER USUARIO]", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Usuario o contraseña incorrecta", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
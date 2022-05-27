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
    //Compartir con clyaldas@uta.edu.ec
    //Primer usuario: JORGE contrasenia: JORGE
    //Segundo usuario: LUIS contrasenia: LUIS
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
            String nombre = "";
            if (email.equals("JORGE") && password.equals("JORGE")) {
                Intent intent = new Intent(this, MainActivity.class);
                intent.putExtra("nombre", nombre);
                startActivity(intent);
                Toast.makeText(this, "Login correcto[PRIMER USUARIO 1]", Toast.LENGTH_SHORT).show();
            }
            else {
                if(email.equals("LUIS") && password.equals("IBARRA")){
                    Intent intent = new Intent(this, MainActivity.class);
                    intent.putExtra("nombre", nombre);
                    startActivity(intent);
                    Toast.makeText(this, "Login correcto [PRIMER USUARIO 2]", Toast.LENGTH_SHORT).show();
                }else{
                Toast.makeText(this, "Usuario o contraseña incorrecta", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }
}
package com.example.samsung.linben;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class LoginActivity extends AppCompatActivity  {
    Button bt_novo_usuario;
    Button bt_entrar;
    Button bt_esqueci_senha;
    EditText email;
    EditText senha;
    private RelativeLayout rl;
    private FragmentActivity fa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //chamada dos objetos
        bt_novo_usuario = (Button) findViewById(R.id.bt_novo_usuario);
        bt_esqueci_senha = (Button) findViewById(R.id.bt_esqueci_senha);
        bt_entrar = (Button) findViewById(R.id.entrar);
        email = (EditText) findViewById(R.id.email);
        senha = (EditText) findViewById(R.id.senha);
        bt_novo_usuario.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {
                                                   Intent i = new Intent(LoginActivity.this, CadastroActivity.class);
                                                   startActivity(i);


                                               }
                                           }
        );

        bt_esqueci_senha.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {
                                                   Intent intent = new Intent(LoginActivity.this, TesteActivity.class);
                                                   startActivity(intent);


                                               }
                                           }
        );

        bt_entrar.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {

                                             //verificar se campo login e senha estão vazios
                                             if (email.getText().length()==0 || senha.getText().length()==0){
                                                 Toast.makeText(getApplication(), "Os campos email e senha são obrigatórios", Toast.LENGTH_LONG).show();
                                                 //Intent j = new Intent(LoginActivity.this, LoginActivity.class);
                                                 //startActivity(j);
                                             }else{
                                                 Toast.makeText(getApplication(), "Seja bem vindo ao Linben!", Toast.LENGTH_LONG).show();
                                                 Intent i = new Intent(LoginActivity.this, MenuActivity.class);
                                                 startActivity(i);
                                                 //limpando os campos
                                                 email.setText("");
                                                 senha.setText("");
                                             }
                                         }
                                     }
        );


    }






}




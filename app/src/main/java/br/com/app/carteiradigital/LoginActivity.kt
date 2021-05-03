package br.com.app.carteiradigital

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class LoginActivity : AppCompatActivity() {

lateinit var btnLogin : Button
lateinit var editTextEmail: EditText
lateinit var editTextSenha: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        carregarElementos()
        carregarEventos()
}
//    override fun onResume() {
//        super.onResume()
//
//    }

    private fun carregarElementos(){
            btnLogin = findViewById(R.id.buttonEntrar)
            editTextEmail = findViewById(R.id.editTextEmailAddress)
            editTextSenha = findViewById(R.id.editTextPassword)
        }
    private fun carregarEventos() {
            btnLogin.setOnClickListener {

                val email = editTextEmail.text.toString()

                val senha = editTextSenha.text.toString()

                val usuario = User(email = email, senha = senha)

                if (usuario.validarEmail()) {
                    println("EMAIL VALIDADO TRUE")
                } else {
                    println("EMAIL INVALIDADO FALSE")
                }

                if (usuario.validarSenha()) {
                    println("Senha VALIDADO TRUE")
                } else {
                    println("senha INVALIDADO FALSE")
                }
            }
        }
}


                /*fun carregarEventos(){
        btnLogin.setOnClickListener{
            val intent = Intent(this, PrincipalActivity::class.java )
            startActivity(intent)
        }
    }*/
/*        }
    override fun onResume() {
        super.onResume()

    }*/

                /*  override fun onStart() {
        super.onStart()
        println("-------ON START")
    }



    override fun onRestart() {
        super.onRestart()
        println("-------ON RESTART")
    }

    override fun onPause() {
        super.onPause()
        println("-------ON PAUSE")
    }

    override fun onStop() {
        super.onStop()
        println("-------ON STOP")
}    }

    override fun onDestroy() {
        super.onDestroy()
        println("-------ON DESTROY")
    }*/

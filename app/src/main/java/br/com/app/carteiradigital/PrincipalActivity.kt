package br.com.app.carteiradigital

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PrincipalActivity : AppCompatActivity() {

    lateinit var btnTerceiraTela : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        btnTerceiraTela = findViewById(R.id.buttonTercTel)

        btnTerceiraTela.setOnClickListener{
            val intent = Intent(this, TerceiraTelaActivity::class.java)
            startActivity(intent)
        }
    }



}
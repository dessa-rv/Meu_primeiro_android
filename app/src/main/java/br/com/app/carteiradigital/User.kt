package br.com.app.carteiradigital

class User(
    var email: String,
    var senha: String
) {

    fun validarEmail() : Boolean {
        if(email == ""){
            return false
        }
        return true
    }

    fun validarSenha() : Boolean{
        if(senha == ""){
            return false
        }
        return true
    }

    override fun toString(): String {
        return super.toString()
    }
}
package pe.edu.upc.cubisoftapp.controllers.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.Validators.not
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_register.*
import pe.edu.upc.cubisoftapp.R

class RegisterActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        registerCustomerButton.setOnClickListener (this)

    }
    private fun validate () :Boolean{
        if(usernameEditText.text.toString().isEmpty()){
            usernameEditText.error = "Debe ingresar un nombre"
            return false
        }else if(emailEditText.text.toString().isEmpty()){
            emailEditText.error = "Debe ingresar un correo"
            return false
        }else if(passwordEditText.text.toString().isEmpty()){
            passwordEditText.error = "Debe ingresar una contraseña"
            return false

        }
            return true
    }

    override fun onClick(v: View?) {

        when(v?.id){
            R.id.LoginCustomerButton -> {
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
            }
            R.id.registerCustomerButton -> {
                if(validate()){
                    Toast.makeText(this, "Registro con exito", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, LoginActivity::class.java)
                    startActivity(intent)

                }
            }

        }
    }
}

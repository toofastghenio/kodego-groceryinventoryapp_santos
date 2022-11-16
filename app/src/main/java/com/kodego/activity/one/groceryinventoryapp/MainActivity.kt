package com.kodego.activity.one.groceryinventoryapp


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kodego.activity.one.groceryinventoryapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //login
        binding.btnLogin.setOnClickListener() {
            var userName : String = binding.etvUserName.text.toString()
            var password : String = binding.etvPassword.text.toString()
            checkCredential(userName, password)
        }

    }

    private fun checkCredential(userName:String, password: String): Boolean {
        val correctUserName: String = "admin"
        val correctPassword: String = "admin123"

        val correctUserName2: String = "user_eugene"
        val correctPassword2: String = "pass123"

        if ((correctUserName == userName)&&(correctPassword == password)) {
            var name: String = "Eugene"
            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("nameID", userName)
            startActivity(intent)
            finish()
            Toast.makeText(applicationContext, "Logging in....", Toast.LENGTH_SHORT).show()
            return true
        }else if ((correctUserName2 == userName)&&(correctPassword2 == password)){
            var name : String = "Eugene"
            val intent = Intent(this,HomeActivity::class.java)
            intent.putExtra("nameID",userName)
            startActivity(intent)
            finish()
            Toast.makeText(applicationContext, "Logging in....", Toast.LENGTH_SHORT).show()
            return true
        }else{
            Toast.makeText(applicationContext, "Invalid Credentials", Toast.LENGTH_SHORT).show()
            return false
        }
    }
}


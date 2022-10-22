package com.kodego.activity.one.groceryinventoryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kodego.activity.one.groceryinventoryapp.databinding.ActivityTestBinding

class TestActivity : AppCompatActivity() {

    private lateinit var binding : ActivityTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGetName.setOnClickListener(){
//            Toast.makeText(applicationContext, "Hello from Toast", Toast.LENGTH_LONG).show()
            var name : String = binding.etvName.text.toString()
            binding.txtName.text = name
        }

        binding.radioGroup.setOnCheckedChangeListener { radioGroup, checkedOption ->
            when(checkedOption) {
            R.id.rb1 -> Toast.makeText(applicationContext, "Option 1 Selected", Toast.LENGTH_LONG).show()
            R.id.rb2 -> Toast.makeText(applicationContext, "Option 2 Selected", Toast.LENGTH_LONG).show()
            R.id.rb3 -> Toast.makeText(applicationContext, "Option 3 Selected", Toast.LENGTH_LONG).show()
            }
        }

    }
}
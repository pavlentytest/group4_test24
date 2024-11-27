package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityMainBinding


class Calculation {
    fun calc(a: Int, b: Int) = a*a + b*b
    fun getStr(s: String?) : Boolean {
        println(s!!.length)
        return true
    }
}

class MainActivity : AppCompatActivity() {
    
    companion object {
        const val LOGIN = "test"
        const val PASS = "123"
    }
    
    lateinit var binding: ActivityMainBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener { 
            binding.textResult.apply {
                if (binding.editLogin.text.toString() == LOGIN &&
                    binding.editPassword.text.toString() == PASS
                ) {
                    this.text = context.getString(R.string.auth_successeful)
                } else 
                    this.text = context.getString(R.string.failed)
            }
        }
        
    }
}
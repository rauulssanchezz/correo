package com.example.correo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.correo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btEnviar.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO)
            intent.data= Uri.parse("mailto:"+binding.etEmail.text.toString())
            intent.putExtra(Intent.EXTRA_SUBJECT, "Bobito")
            intent.putExtra(Intent.EXTRA_TEXT, "Hola mi amor")
            startActivity(intent)
        }
    }
}
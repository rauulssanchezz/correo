package com.example.correo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.action_settings) {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        } else if (item.itemId == R.id.action_settings2) {
            val intent = Intent(this, Ejercicio2::class.java)
            startActivity(intent)

        }
        return super.onOptionsItemSelected(item)
    }
}

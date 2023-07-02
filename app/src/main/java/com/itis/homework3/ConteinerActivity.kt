package com.itis.homework3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.itis.homework3.databinding.ActivityConteinerBinding

class ConteinerActivity : AppCompatActivity() {

    private lateinit var binding : ActivityConteinerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conteiner)
        binding = ActivityConteinerBinding.inflate(layoutInflater)

    }
}
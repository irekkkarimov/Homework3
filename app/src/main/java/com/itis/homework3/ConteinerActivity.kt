package com.itis.homework3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import com.itis.homework3.databinding.ActivityConteinerBinding

class ConteinerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conteiner)

        var controller =
            (supportFragmentManager.findFragmentById(R.id.container)
                    as NavHostFragment).navController

    }
}
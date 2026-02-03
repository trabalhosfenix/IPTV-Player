package com.seunome.iptvplayer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class PlayerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player)

        val channel = intent.getParcelableExtra<Channel>("channel")
        // Inicializar o player com o canal selecionado
    }
}

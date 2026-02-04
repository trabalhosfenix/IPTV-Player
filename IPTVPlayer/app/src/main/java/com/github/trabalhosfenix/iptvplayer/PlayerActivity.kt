package com.github.trabalhosfenix.iptvplayer

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.ui.PlayerView

class PlayerActivity : AppCompatActivity() {
    
    private var exoPlayer: ExoPlayer? = null
    private lateinit var playerView: PlayerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player)

        playerView = findViewById(R.id.playerView)
        
        val channel = intent.getParcelableExtra<Channel>("channel")
        
        if (channel != null) {
            initializePlayer(channel)
            title = channel.name
        } else {
            Log.e("PlayerActivity", "Canal não recebido")
        }
    }

    private fun initializePlayer(channel: Channel) {
        exoPlayer = ExoPlayer.Builder(this).build()
        playerView.player = exoPlayer

        // Criar MediaItem com a URL do stream
        val mediaItem = MediaItem.fromUri(channel.url)
        
        exoPlayer?.apply {
            setMediaItem(mediaItem)
            prepare()
            play()
        }
    }

    override fun onPause() {
        super.onPause()
        exoPlayer?.pause()
    }

    override fun onResume() {
        super.onResume()
        exoPlayer?.play()
    }

    override fun onDestroy() {
        super.onDestroy()
        exoPlayer?.release()
        exoPlayer = null
    }
}

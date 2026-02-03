package com.github.trabalhosfenix.iptvplayer

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ChannelViewModel : ViewModel() {
    private val _channels = MutableLiveData<List<Channel>>()
    val channels: LiveData<List<Channel>> = _channels

    init {
        loadChannels()
    }

    private fun loadChannels() {
        // Implementar carregamento de canais do arquivo M3U
        _channels.value = emptyList()
    }
}

package com.github.trabalhosfenix.iptvplayer

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Channel(
    val name: String,
    val url: String,
    val logo: String = ""
) : Parcelable

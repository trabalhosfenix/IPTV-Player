package com.seunome.iptvplayer

object M3UParser {
    fun parse(content: String): List<Channel> {
        val channels = mutableListOf<Channel>()
        val lines = content.split("\n")
        
        var currentName = ""
        var currentLogo = ""
        
        for (line in lines) {
            when {
                line.startsWith("#EXTINF:") -> {
                    // Parse channel info
                    currentName = extractChannelName(line)
                    currentLogo = extractLogo(line)
                }
                line.isNotEmpty() && !line.startsWith("#") -> {
                    // URL do canal
                    if (currentName.isNotEmpty()) {
                        channels.add(Channel(currentName, line, currentLogo))
                        currentName = ""
                        currentLogo = ""
                    }
                }
            }
        }
        
        return channels
    }

    private fun extractChannelName(line: String): String {
        val parts = line.split(",")
        return if (parts.size > 1) parts[1].trim() else ""
    }

    private fun extractLogo(line: String): String {
        val logoRegex = """tvg-logo="([^"]*)"""".toRegex()
        return logoRegex.find(line)?.groupValues?.get(1) ?: ""
    }
}

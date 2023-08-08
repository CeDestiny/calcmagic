package com.darkempire78.opencalculator

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class Magic {
    companion object {
        var IS_MAGIC_ENABLED: Boolean = false

        fun calculateCombinedNumber(): Int {
            val now = LocalDateTime.now().plusSeconds(90)
            val dateFormatter = DateTimeFormatter.ofPattern("MMddyyhhmm")
            val formattedDateTime = now.format(dateFormatter)
            return formattedDateTime.toInt()
        }
    }
}
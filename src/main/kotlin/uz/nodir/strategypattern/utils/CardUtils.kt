package uz.nodir.strategypattern.utils


/**
@author: Nodir
@date: 19.07.2025
@group: Meloman

 **/

object CardUtils {

    fun maskPan(card: String?): String {
        if (card.isNullOrEmpty()) {
            return ""
        }

        if(card.length< 16) {
            return card
        }

        val mask = "".padStart(6, '*')

        return buildString {
            append(card.take(4))
            append(mask)
            append(card.takeLast(4))
        }
    }
}
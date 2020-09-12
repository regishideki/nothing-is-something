package composition

import compositionplusnullobject.Formatting
import compositionplusnullobject.Order

class Person(
    private val order: Order?,
    private val formatting: Formatting?
) {
    fun talk(phrase: String): String {
        val phraseFormatted = formatting?.format(phrase) ?: phrase
        return order?.sort(phraseFormatted) ?: phraseFormatted
    }
}

interface Order {
    fun sort(string: String): String
}

class ReversedOrder: Order {
    override fun sort(string: String) = string.reversed()
}

interface Formatting {
    fun format(string: String): String
}

class UpperCaseFormatting: Formatting {
    override fun format(string: String) = string.toUpperCase()
}

val p1 = Person(order = ReversedOrder(), formatting = UpperCaseFormatting()).talk("")

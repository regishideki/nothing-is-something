package compositionplusnullobject

class Person(
    private val order: Order = DefaultOrder(),
    private val formatting: Formatting = DefaultFormatting()
) {
    fun talk(phrase: String): String = order.sort(formatting.format(phrase))
}

interface Order {
    fun sort(string: String): String
}

class DefaultOrder: Order {
    override fun sort(string: String) = string
}

class ReversedOrder: Order {
    override fun sort(string: String) = string.reversed()
}

interface Formatting {
    fun format(string: String): String
}

class DefaultFormatting: Formatting {
    override fun format(string: String) = string
}

class UpperCaseFormatting: Formatting {
    override fun format(string: String) = string.toUpperCase()
}


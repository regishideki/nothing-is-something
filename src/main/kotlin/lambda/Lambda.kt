package lambda

class Person(
    private val transformations: List<(String) -> String> = emptyList()
) {
    fun talk(phrase: String) = transformations.fold(phrase) { acc, transformation ->
        transformation.invoke(acc)
    }
}

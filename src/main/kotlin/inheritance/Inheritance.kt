package inheritance

open class Person {
    open fun talk(phrase: String) = phrase
}

class CrazyPerson: Person() {
    override fun talk(phrase: String) = super.talk(phrase).reversed()
}

class RudePerson: Person() {
    override fun talk(phrase: String) = super.talk(phrase).toUpperCase()
}




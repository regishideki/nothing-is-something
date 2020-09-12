package lambda

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LambdaTest {
    @Test
    fun `it talks normally when it is a normal person`() {
        val subject = Person()

        val result = subject.talk("Olá, meu nome é Maria")

        assertThat(result).isEqualTo("Olá, meu nome é Maria")
    }

    @Test
    fun `it talks in reverse order when it is a crazy person`() {
        val transformations = listOf { string: String -> string.reversed() }
        val crazyPerson = Person(transformations = transformations)

        val result = crazyPerson.talk("Olá, meu nome é Maria")

        assertThat(result).isEqualTo("airaM é emon uem ,álO")
    }

    @Test
    fun `it talks in upper case when it is a rude person`() {
        val transformations = listOf { string: String -> string.toUpperCase() }
        val rudePerson = Person(transformations = transformations)

        val result = rudePerson.talk("Olá, meu nome é Maria")

        assertThat(result).isEqualTo("OLÁ, MEU NOME É MARIA")
    }

    @Test
    fun `it talks in upper case and in reverse order when it is a crazy rude person`() {
        val transformations = listOf (
            { string: String -> string.toUpperCase() },
            { string: String -> string.reversed() }
        )
        val crazyRudePerson = Person(transformations = transformations)

        val result = crazyRudePerson.talk("Olá, meu nome é Maria")

        assertThat(result).isEqualTo("AIRAM É EMON UEM ,ÁLO")
    }
}

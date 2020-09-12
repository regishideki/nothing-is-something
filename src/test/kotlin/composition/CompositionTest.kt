package composition

import compositionplusnullobject.Person
import compositionplusnullobject.ReversedOrder
import compositionplusnullobject.UpperCaseFormatting
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CompositionTest {
    @Test
    fun `it talks normally when it is a normal person`() {
        val subject = Person()

        val result = subject.talk("Olá, meu nome é Maria")

        assertThat(result).isEqualTo("Olá, meu nome é Maria")
    }

    @Test
    fun `it talks in reverse order when it is a crazy person`() {
        val crazyPerson =
            Person(order = ReversedOrder())

        val result = crazyPerson.talk("Olá, meu nome é Maria")

        assertThat(result).isEqualTo("airaM é emon uem ,álO")
    }

    @Test
    fun `it talks in upper case when it is a rude person`() {
        val rudePerson =
            Person(formatting = UpperCaseFormatting())

        val result = rudePerson.talk("Olá, meu nome é Maria")

        assertThat(result).isEqualTo("OLÁ, MEU NOME É MARIA")
    }

    @Test
    fun `it talks in upper case and in reverse order when it is a crazy rude person`() {
        val crazyRudePerson = Person(
            formatting = UpperCaseFormatting(),
            order = ReversedOrder()
        )

        val result = crazyRudePerson.talk("Olá, meu nome é Maria")

        assertThat(result).isEqualTo("AIRAM É EMON UEM ,ÁLO")
    }
}

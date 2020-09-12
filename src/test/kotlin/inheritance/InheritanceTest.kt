package inheritance

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InheritanceTest {
    @Test
    fun `it talks normally when it is a normal person`() {
        val subject = Person()

        val result = subject.talk("Olá, meu nome é Maria")

        assertThat(result).isEqualTo("Olá, meu nome é Maria")
    }

    @Test
    fun `it talks in reverse order when it is a crazy person`() {
        val subject = CrazyPerson()

        val result = subject.talk("Olá, meu nome é Maria")

        assertThat(result).isEqualTo("airaM é emon uem ,álO")
    }

    @Test
    fun `it talks in upper case when it is a rude person`() {
        val subject = RudePerson()

        val result = subject.talk("Olá, meu nome é Maria")

        assertThat(result).isEqualTo("OLÁ, MEU NOME É MARIA")
    }
}

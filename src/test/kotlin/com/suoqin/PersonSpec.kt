import com.suoqin.Person
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.jupiter.api.Assertions.assertEquals;

object PersonSpec: Spek({
    given("a person") {
        val person = Person("name", 11, null)
        on("isTeenager") {
            val isTeenager = person.isTeenager()
            it("should tell if too young") {
                assertEquals(false, isTeenager)
            }
        }
        on("years to adult") {
            val years = person.yearsToAdult()
            it("should tell how many years to be an adult") {
                assertEquals(7, years)
            }
        }
    }

    given("another person") {
        val person = Person("name2", 20, null)
        on("isTeenager") {
            val isTeenager = person.isTeenager()
            it("should tell if too old") {
                assertEquals(false, isTeenager)
            }
        }
        on("years to adult") {
            val years = person.yearsToAdult()
            it("should tell 0 if the person is an adult") {
                assertEquals(0, years)
            }
        }
    }
})
package com.suoqin

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.jupiter.api.Assertions
import java.util.*

object JavaSpec : Spek({
    given("kotlin") {
        on("java") {
            it("should be working") {
                val list = ArrayList<String>() // non-null (constructor result)
                list.add("Item")
                val sizeOfJava = list.size

                Assertions.assertEquals(sizeOfJava, 1)

                val sizeOfKotlin = listOf("Item").size
                Assertions.assertEquals(sizeOfKotlin, 1)
            }
        }
    }
}
)

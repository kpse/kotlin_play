package com.suoqin

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.jupiter.api.Assertions.assertEquals

object LanguageSpec: Spek({
    given("kotlin") {
        on("isTeenager") {
            it("should be fun") {
                assertEquals((1..10).all({it > 0}), true)
                assertEquals((1..10).any({it > 11}), false)
            }
        }
    }
})
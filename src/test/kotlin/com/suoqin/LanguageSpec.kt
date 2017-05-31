package com.suoqin

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.jupiter.api.Assertions.assertEquals

object LanguageSpec: Spek({
    given("kotlin") {
        on("range") {
            it("should be fun") {
                assertEquals((1..10).all({it > 0}), true)
                assertEquals((1..10).any({it > 11}), false)
                assertEquals((1..10).count(), 10)
            }
        }
        on("array") {
            it("should be fun") {
                assertEquals(arrayOf("hello", "world").any({it.contains("h")}), true)
            }
        }

        on("list") {
            it("should be fun") {
                assertEquals(listOf("hello", "world").drop(1), listOf("world"))
            }
        }
    }
})
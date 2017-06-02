package com.suoqin

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.jupiter.api.Assertions.assertEquals

object LanguageSpec : Spek({
    given("kotlin") {
        on("range") {
            it("should be fun") {
                assertEquals((1..10).all({ it > 0 }), true)
                assertEquals((1..10).any({ it > 11 }), false)
                assertEquals((1..10).count(), 10)
            }
        }
        on("array") {
            it("should be fun") {
                assertEquals(arrayOf("hello", "world").any({ it.contains("h") }), true)
            }
        }

        on("list") {
            it("should be fun") {
                assertEquals(listOf("hello", "world").drop(1), listOf("world"))
            }
        }

        on("drop") {
            it("should be fun") {
                assertEquals((1..2).drop(1), listOf(2))
                assertEquals((90..100).toList(), (1..100).dropWhile { it < 90 })
            }
        }

        on("filter") {
            it("should be fun") {
                assertEquals(listOf(0, 2, 4, 6, 8, 10), (0..10).filter { it % 2 == 0 })

                val filterToList = arrayListOf<Int>()
                (0..10).filterTo(filterToList) { it % 2 == 0 }
                assertEquals((0..10).step(2).toList(), filterToList)
                assertEquals((1..9).step(2).toList(), (0..10).filterNot { it % 2 == 0 })

                assertEquals(listOf("hello", "world"), arrayOf(null, "hello", null, "world", null).filterNotNull())
            }
        }

        on("find") {
            it("should be fun") {
                assertEquals("world", listOf("hello", "world").find { it.startsWith("wo") })
                assertEquals("hello", listOf("hello", "world").first())
            }
        }

        on("sort") {
            it("should be fun") {
                assertEquals(listOf(4,3,2,1), (1..4).sortedBy({ -it }))
                assertEquals((1..4).toList(), listOf(4,2,1,3).sortedBy({ it }))
            }
        }
    }
})
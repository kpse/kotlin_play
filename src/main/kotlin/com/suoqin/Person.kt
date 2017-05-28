package com.suoqin

class Person(val name: String, val age: Int, val college: String?) {
    fun isTeenager(): Boolean {
        return age in 13..19
    }

    fun yearsToAdult(): Int {
        val i = 18 - age
        return if (i > 0) i else 0
    }

}
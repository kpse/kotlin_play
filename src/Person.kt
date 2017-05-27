class Person(val name: String, val age: Int, val college: String?) {
    fun isTeenager(): Boolean {
        return age in 13..19
    }
}
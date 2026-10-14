fun main() {
    val david = Student("183904", "David", "Computing", 0.0)
    println("Student: $david")
    println("What mark did you receive? ")
    val mark = readln().toDouble()
    david.mark = mark
    println(david.getGrade())
    println(david.didPass())
}


fun main() {
    val uni = University()
    var choice = ""

    while (choice != "4") {
        println()
        println("1. Add a student")
        println("2. Search for student by ID")
        println("3. Search for students by name")
        println("4. Quit")

        choice = readln()

        when (choice) {
            "1" -> {
                println("Enter student type (1 for Undergraduate, 2 for Masters):")
                val typeChoice = readln()

                println("Enter ID:")
                val id = readln()

                println("Enter name:")
                val name = readln()

                println("Enter course:")
                val course = readln()

                println("Enter mark:")
                val mark = readln().toDouble()

                val student: Student = when (typeChoice) {
                    "2" -> Masters(id, name, course, mark)
                    else -> Undergraduate(id, name, course, mark)
                }

                uni.enrolStudent(student)
                println("Student added successfully.")
            }

            "2" -> {
                println("Enter student ID:")
                val id = readln()
                val student = uni.findStudentById(id)

                if (student != null) {
                    println(student)
                } else {
                    println("Student not found.")
                }
            }

            "3" -> {
                println("Enter name:")
                val name = readln()
                val students = uni.findStudentsByName(name)

                if (students.isEmpty()) {
                    println("No students found.")
                } else {
                    for (student in students) {
                        println(student)
                    }
                }
            }

            "4" -> {
                println("Goodbye")
            }

            else -> {
                println("Invalid option")
            }
        }
    }
}
fun main() {

    val uni = University()

    var choice = ""

//    Entering the while loop, until option 4 has been chosen to end the program
    while (choice != "4") {
//    Listing options for the user to choose from
        println()
        println("1. Add a student")
        println("2. Search for student by ID")
        println("3. Search for students by name")
        println("4. Quit")
//      Reading in the users choice
        choice = readln()

//        When the choice matches with one of the options then it proceeds with that option
        when (choice) {

            "1" -> {

                println("Enter ID:")
                val id = readln()

                println("Enter name:")
                val name = readln()

                println("Enter course:")
                val course = readln()

                println("Enter mark:")
                val mark = readln().toDouble()

                val student = Student(id, name, course, mark)

                uni.enrolStudent(student)

                println("Student added.")
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
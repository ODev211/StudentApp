class University {

    var modules = mutableListOf<Module>()
    var students = mutableListOf<Student>()

    fun enrolStudent(student: Student) {
        students.add(student)
    }

    fun findStudentById(id: String): Student? {

        for (student in students) {
            if (student.id == id) {
                return student
            }
        }

        return null
    }

    fun findStudentsByName(name: String): MutableList<Student> {

        val matches = mutableListOf<Student>()

        for (student in students) {

            if (student.name == name) {
                matches.add(student)
            }
        }

        return matches
    }
}
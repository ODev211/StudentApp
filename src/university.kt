class University {
    var modules = mutableListOf<Module>()
    var students = mutableMapOf<String, Student>()

    fun enrolStudent(student: Student) {
        students[student.id] = student
    }

    fun findStudentById(id: String): Student? {
        return students[id]
    }

    fun findStudentsByName(name: String): MutableList<Student> {
        val matches = mutableListOf<Student>()
        for (student in students.values) {
            if (student.name == name) {
                matches.add(student)
            }
        }
        return matches
    }
}
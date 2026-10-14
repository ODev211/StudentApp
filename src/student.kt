class Student(var id: String, var name: String, var course: String, var mark: Double) {

    fun getGrade(): String {
        return when {
            mark >= 70 -> "First"
            mark >= 60 -> "2:1"
            mark >= 50 -> "2:2"
            mark >= 40 -> "Third"
            else -> "Fail"
        }
    }

    override fun toString(): String {
        return "Student id='$id', name='$name', course='$course', mark=$mark"
    }
}
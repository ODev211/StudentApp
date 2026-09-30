class Student(var id: String, var name: String, var course: String, var mark: Double) {


    override fun toString(): String {
        return "Student id='$id', name='$name', course='$course', mark=$mark"
    }
}
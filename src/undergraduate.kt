// Undergraduate subclass extending the abstract Student class
class Undergraduate(id: String, nameIn: String, course: String, markIn: Double) : Student(id, nameIn, course, markIn) {

    // Standard undergraduate grading scale
    override fun getGrade(): String {
        return when {
            mark >= 70 -> "First"
            mark >= 60 -> "2:1"
            mark >= 50 -> "2:2"
            mark >= 40 -> "Third"
            else -> "Fail"
        }
    }
}
// Masters subclass extending the abstract Student class
class Masters(id: String, nameIn: String, course: String, markIn: Double) : Student(id, nameIn, course, markIn) {

    // Masters-specific grading scale
    override fun getGrade(): String {
        return when {
            mark >= 70 -> "Distinction"
            mark >= 60 -> "Merit"
            mark >= 40 -> "Pass"
            else -> "Fail"
        }
    }
}
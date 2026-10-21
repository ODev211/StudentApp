// Abstract base class representing a general student
abstract class Student(var id: String, nameIn: String, var course: String, markIn: Double) {

    var name = nameIn
        protected set

    // Custom property setter with validation (must be between 0 and 100)
    var mark: Double = 0.0
        set(value) {
            if (value in 0.0..100.0) {
                field = value
            } else {
                println("Invalid mark: $value. Mark must be between 0 and 100.")
            }
        }

    init {
        this.mark = markIn // Ensures validation runs when the object is created
    }

    // Abstract method forcing subclasses to define their own grading logic
    abstract fun getGrade(): String

    fun didPass(): Boolean {
        return mark >= 40
    }

    override fun toString(): String {
        return "Student id='$id', name='$name', course='$course', mark=$mark, grade='${getGrade()}'"
    }
}
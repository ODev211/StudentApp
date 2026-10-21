abstract class Student(var id: String, nameIn: String, var course: String, markIn: Double) {

    var name = nameIn
        protected set

    var mark: Double = 0.0
        set(value) {
            if (value in 0.0..100.0) {
                field = value
            } else {
                println("Invalid mark: $value. Mark must be between 0 and 100.")
            }
        }

    init {
        this.mark = markIn // Calls the custom setter upon instantiation
    }

    abstract fun getGrade(): String

    fun didPass(): Boolean {
        return mark >= 40
    }

    override fun toString(): String {
        return "Student id='$id', name='$name', course='$course', mark=$mark, grade='${getGrade()}'"
    }
}
import com.annotation.implementation.AnnotationUtility
import com.annotation.models.TestModel

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    val testModel = TestModel(test = "a", num = 1)

    val errors = AnnotationUtility.validate(testModel)

    if(errors.isNotEmpty()){
        for(error in errors){
            println(error)
        }
    } else { println("Error is Empty") }
}
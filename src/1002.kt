import java.util.*

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)

    val R = scanner.nextDouble()
    val n = 3.14159
    val area = n * R * R

    println("A=%.4f".format(area))
}
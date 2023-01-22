import java.util.*

fun input (correctNum : Int) : Int{

    var scanner : String

    while (true){
        println("Введите порядковый номер команды.")

        scanner = Scanner(System.`in`).nextLine()
        val value : Int? = scanner.toIntOrNull()
        if(value != null && 0 <= value && value <= correctNum) return value
        else println("Некорректный ввод")
    }

}

fun scanText() : String = Scanner(System.`in`).nextLine()
fun additon(a: Int, b: Int ): Int {
    return a + b
}
fun subtract(a: Int, b: Int): Int {
    return a - b
}
fun multiply(a: Int, b: Int): Int {
    return a * b
}
fun divide(a: Int, b: Int): Int {
    return a / b
}
fun factorial(n: Int): Long {
    return if (n == 0 || n == 1) {
        1
    } else {

        n * factorial(n - 1)
    }
}
fun main() {
//    while(true) {
//        print("Enter a first number: ")
//        val num1= readLine()!!.toInt()
//        print("Enter a second number: ")
//        val num2= readLine()!!.toInt()
//        print("Addtion :")
//        println(additon(num1, num2))
//        print("Subtraction :")
//        println(subtract(num1, num2))
//        print("Multiplication :")
//        println(multiply(num1, num2))
//        print("Division :")
//        println(divide(num1, num2))
//
//        println("You Wanna Continue?(Y/N)")
//        val x = readLine()!!
//        if(x == "N") {
//            break
//        }
//        else{
//            continue
//        }
//    }
////prac7
//    print("Enter a number: ")
//    val number = readLine()?.toIntOrNull() ?: return
//    val result = factorial(number)
//    println("Factorial of $number is: $result")


//Prac 9
        val numbers = arrayListOf(10, 25, 35, 15, 40, 5)


        val maxNumber = numbers.maxOrNull()


        if (maxNumber != null) {
            println("The maximum number is: $maxNumber")
        } else {
            println("The list is empty.")
        }
    }


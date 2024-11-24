import java.util.Collections.swap

fun main() {

    val a = arrayOf("kotlin", "java", "python", "c++")
    val b = Array<Int>(3) { 0 }
    val c = Array(7) { i -> i + 1 }
    val d = IntArray(5) { 0 }
    val e = intArrayOf(32, 544, 76, 87, 98)

    val f = arrayOf(
        arrayOf(1, 3),
        arrayOf(4, 5),
        arrayOf(6, 7)
    )
    val x = readLine()!!.toInt()
    val y = readLine()!!.toInt()

    val s = arrayOf(x)
    val r = arrayOf(y)

    println("By Using arrayof...")
    println(a.contentDeepToString())
    println(a.joinToString())

    println("By Using Array<> ")
    println(b.contentDeepToString())

    println("By using Lambda Function")
    println(c.contentToString())

    println("By Using IntArray Function")
    println(d.joinToString())

    println("By Using IntArrayOf Function")
    println(e.joinToString())

    println("2D Array : " + f.contentDeepToString())

// for the User Input in the Array
    println("Enter the size of the array:")
    val size = readLine()!!.toInt()
    val array = IntArray(size)
    println("Enter the elements of the array:")
    for (i in 0 until size) {
        array[i] = readLine()!!.toInt()
    }
    println("The array is:")
    println(array.contentToString())
    println("**Sort With Built-in Function** ")
    val q=array.sorted()
    println(q.joinToString())
    println("Sort Without Built-in Function")
    val sortedNumbers = bubbleSort(array)
    println("Sorted: ${sortedNumbers.contentToString()}")

}
fun bubbleSort(array: IntArray): IntArray {
    val n = array.size
    for (i in 0 until n - 1) {
        for (j in 0 until n - i - 1) {
            if (array[j] > array[j + 1]) {
                // Swap elements
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
            }
        }
    }
    return array
}
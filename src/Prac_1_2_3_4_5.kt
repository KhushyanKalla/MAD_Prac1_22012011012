fun main() {
//    //1.1
    val a: Int = 22
    val b: Float = 1.5f
    val c: Double = 3.141592653589793
    val d: String = "Khushyan kalla"
    var e: Char = 'K'
    var f: Boolean = true
    var g: Long = 22012011012
    var h: Short = -2
    var i: Byte = 123

    println("Integer Value: $a")
    println("Float Value: $b")
    println("Double Value: $c")
    println("Long Value: $g")
    println("Short Value: $h")
    println("Boolean Value: $f")
    println("Character : $e")
    println("String: $d")
    println("Byte Value: $i")

    //--------------------------------------------------------------------------------------------------------
    //1.2
    val x = c.toInt()
    val y = b.toInt()
    println("Double To Integer : $x")
    println("Float To Integer : $y")

    //--------------------------------------------------------------------------------------------------------
    //1.3
    print("\n")
    println("******************* Enter Student Details *********************")
    print("Student Enrollment No:")
    val a: Double = readLine()!!.toDouble()
    print("Student's Name:")
    val b: String = readLine()!!.toString()
    print("Student's branch:")
    val c: String = readLine()!!.toString()
    print("Student's Batch:")
    val d: String= readLine()!!
    print("Student's Collage name:")
    val f: String = readLine()!!.toString()
    print("Student's University Name:")
    val g: String = readLine()!!.toString()
    print("Student's Age:")
    val h: Int = readLine()!!.toInt()

    println("*************************************** \n")
    println("**************** Student's Details ***************\n")
    println("Student's Name: $b")
    println("Student Enrollment No:$a")
    println("Student's branch: $c")
    println("Student's Batch: $d")
    println("Student's Collage name: $f")
    println("Student's University Name: $g")
    println("Student's Age: $h")

    //---------------------------------------------------------------------------------------------------
//1.4
    print("Enter The Number: ")
    val a:Int=readLine()!!.toInt()
    print(
        if (a%2==0){
           println("It Even Number")
        }
        else{
            println("It Odd Number")
        }
    )
 //---------------------------------------------------------------------------------------------------------
    //1.5
    print("Enter Month's number:")
    val x:Int = readLine()!!.toInt()
    when(x){
         1->print("January")
         2->print("February")
         3->print("March")
         4->print("April")
         5->print("May")
         6->print("June")
         7->print("July")
         8->print("August")
         9->print("September")
         10->print("October")
         11->print("November")
         12->print("December")
         else->{
             println("Enter Valid Month Number")
         }
    }
}
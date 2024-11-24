class Matrix(private val rows: Int, private val cols: Int, private val data: Array<IntArray>) {

    // Addition Operator Overloading
    operator fun plus(other: Matrix): Matrix {
        if (this.rows != other.rows || this.cols != other.cols) {
            throw IllegalArgumentException("Matrices must have the same dimensions for addition")
        }
        val result = Array(rows) { IntArray(cols) }
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result[i][j] = this.data[i][j] + other.data[i][j]
            }
        }
        return Matrix(rows, cols, result)
    }

    // Subtraction Operator Overloading
    operator fun minus(other: Matrix): Matrix {
        if (this.rows != other.rows || this.cols != other.cols) {
            throw IllegalArgumentException("Matrices must have the same dimensions for subtraction")
        }
        val result = Array(rows) { IntArray(cols) }
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result[i][j] = this.data[i][j] - other.data[i][j]
            }
        }
        return Matrix(rows, cols, result)
    }

    // Multiplication Operator Overloading
    operator fun times(other: Matrix): Matrix {
        if (this.cols != other.rows) {
            throw IllegalArgumentException("Matrices must have compatible dimensions for multiplication")
        }
        val result = Array(this.rows) { IntArray(other.cols) }
        for (i in 0 until this.rows) {
            for (j in 0 until other.cols) {
                for (k in 0 until this.cols) {
                    result[i][j] += this.data[i][k] * other.data[k][j]
                }
            }
        }
        return Matrix(this.rows, other.cols, result)
    }

    // Overriding toString()
    override fun toString(): String {
        val sb = StringBuilder()
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                sb.append("${data[i][j]}\t")
            }
            sb.append("\n")
        }
        return sb.toString()
    }
}


fun main() {
    val data1 = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9)
    )

    val data2 = arrayOf(
        intArrayOf(9, 8, 7),
        intArrayOf(6, 5, 4),
        intArrayOf(3, 2, 1)
    )

    val matrix1 = Matrix(3, 3, data1)
    val matrix2 = Matrix(3, 3, data2)
    val additionResult = matrix1 + matrix2
    println("Matrix Addition:\n$additionResult")
    val subtractionResult = matrix1 - matrix2
    println("Matrix Subtraction:\n$subtractionResult")
    val multiplicationResult = matrix1 * matrix2
    println("Matrix Multiplication:\n$multiplicationResult")
}

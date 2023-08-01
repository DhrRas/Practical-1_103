import kotlin.math.min

class Matrix(var data:Array<IntArray>,var rows: Int,var cols: Int) {
    operator fun plus(other: Matrix): Array<IntArray> {
        val resultData = Array(rows) {
            IntArray(cols)
        }
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                resultData[i][j] = this.data[i][j] + other.data[i][j]

            }
        }
        return resultData
    }

    operator fun minus(other: Matrix): Array<IntArray>
    {
        val resultData = Array(rows) {IntArray(cols)}
        for(i in 0 until rows){
            for (j in 0 until cols){
                resultData[i][j] = this.data[i][j] - other.data[i][j]
            }
        }
        return resultData
    }

    operator fun times(other: Matrix): Array<IntArray> {
        val resultData = Array(rows) { IntArray(cols) }
        for (i in 0 until rows) {
            for (j in 0 until other.cols) {
                for (k in 0 until cols) {
                    resultData[i][j] += this.data[i][k] * other.data[k][j]
                }
            }
        }
        return resultData
    }
}

fun print1(array: Array<IntArray>,row: Int, col: Int){
    println("($row x $col Matrix):")
    for (i in 0 until row){
        for(j in 0 until col){
            print("${array[i][j]}\t")
        }
        println()
    }
}

fun main(){
    val a1 = arrayOf(intArrayOf(3,-2,5),intArrayOf(3,0,4))
    val a2 = arrayOf(intArrayOf(2,3),intArrayOf(-9,0),intArrayOf(0,4))
    val a3 = arrayOf(intArrayOf(6,3), intArrayOf(9,0),intArrayOf(5,4))
    var firstmatrix = Matrix(a1,2,3)
    var secondmatrix = Matrix(a2,3,2)
    var secondmatrix1 = Matrix(a3,3,2)
    println("************** Addition ****************")
    print("Matrix: 1")
    print1(a2,3,2)
    print("Matrix: 2")
    print1(a3,3,2)
    print("Addition: ")
    var plusmatrix = secondmatrix + secondmatrix1
    print1(plusmatrix, 3,2)
    println()

    println("********* Subtraction ************* ")
    print("Matrix: 1")
    print1(a3,3,2)
    print("Matrix: 2")
    print1(a2,3,2)
    print("Subtraction: ")
    var minusmatrix = secondmatrix1 - secondmatrix
    print1(minusmatrix,3,2)
    println()

    println("********** Multiplication ************** ")
    print("Matrix: 1")
    print1(a1,2,3)
    print("Matrix: 2")
    print1(a2,3,2)
    print("Multiplication: ")
    var multimatrix = firstmatrix * secondmatrix
    print1(multimatrix,2,2)
    println()
}
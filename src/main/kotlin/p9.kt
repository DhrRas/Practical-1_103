fun main() {
    var array = Array<Int>(5){0}
    var x:Int = 0
    val abc:Int = array.size
    while( x < abc)
    {
        print("a[$x]=")
        array[x] = readLine()!!.toInt()
        x++
    }
    var largest = array[0]
    for (num in array) {
        if (largest < num)
            largest = num
    }
    println("Largest element = $largest")
}


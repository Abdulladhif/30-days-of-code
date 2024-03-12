fun factorial(n: Int): Int {
    // Write your code here
    if(n==0 || n == 1) return 1
    return n * factorial(n-1)

}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val result = factorial(n)

    println(result)
}
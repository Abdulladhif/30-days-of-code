
fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()
    // Convert the number to binary
    val binary = Integer.toBinaryString(n)
    // Split the binary number by 0 and get the length of the longest 1s
    val result = binary.split("0").maxBy { it.length }!!.length
    println(result)
}
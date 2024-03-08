fun main(args: Array<String>) {
    val N = readLine()!!.trim().toInt()
    if( N % 2 != 0 || (N % 2 == 0 && N in 6..20) ) println("Weird")
    else println("Not Weird")
}
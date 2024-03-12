fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    for (i in n-1 downTo 0) {
        print("${arr[i]} ")
    }

}
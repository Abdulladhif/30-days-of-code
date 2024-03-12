fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val n = readLine()!!.toInt()
    for (i in 1..n) {
        val s = readLine()!!
        val even = StringBuilder()
        val odd = StringBuilder()
        for (j in s.indices) {
            if (j % 2 == 0) {
                even.append(s[j])
            } else {
                odd.append(s[j])
            }
        }
        println("$even $odd")
    }
}
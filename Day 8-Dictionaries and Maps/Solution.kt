fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val phoneBook = mutableMapOf<String, String>()
    for (i in 0 until n) {
        val (name, phone) = readLine()!!.split(" ")
        phoneBook[name] = phone
    }
    var name: String?
    while (readLine().also { name = it } != null) {
        if (phoneBook.containsKey(name)) {
            println("$name=${phoneBook[name]}")
        } else {
            println("Not found")
        }
    }
}
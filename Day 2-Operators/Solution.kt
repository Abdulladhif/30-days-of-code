import java.lang.Math.round

fun solve(meal_cost: Double, tip_percent: Int, tax_percent: Int): Unit {
    // Write your code here
    val tip = meal_cost * tip_percent / 100
    val tax = meal_cost * tax_percent / 100
    val totalCost = meal_cost + tip + tax
    println(Math.round(totalCost).toInt())
    
}

fun main(args: Array<String>) {
    val meal_cost = readLine()!!.trim().toDouble()

    val tip_percent = readLine()!!.trim().toInt()

    val tax_percent = readLine()!!.trim().toInt()

    solve(meal_cost, tip_percent, tax_percent)
}

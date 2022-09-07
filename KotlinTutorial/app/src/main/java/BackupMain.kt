fun main(args: Array<String>) {
    println("Hello World")
    println("My First Kotlin Program")

    val adam = "Adam Patrick"
    val jim = "James T Kirk"
    println(adam)

    val adamsWeeklySalary: Int = 32
    val adamsMonthlySalary: Int = adamsWeeklySalary * 4
    println("Adam's weekly salary is $$adamsWeeklySalary")
    println("Adam's monthly salary is $$adamsMonthlySalary")

    println()

    val apples: Int = 6
    val oranges: Int = 5
    val fruit: Int = apples - oranges
    println("The amount of apples minus oranges is $fruit")

    println("A quarter of the apples is ${apples / 4}")

    println()
    val weeks: Int = 234
    val years: Double = weeks / 52.0  // 52 will result in a error since 52.0 is a double and 52 is an Int
    println("$weeks weeks in years is: $years")



    println("My name is $adam")
    println("Jim is $jim")



    // #2

    //    val lives = 0;
//
//    var isGameOver = (lives < 1)
//
//    if (isGameOver) {
//        println("Game Over!")
//    } else {
//        println("You're still alive!")
//    }

    println("How old are you: ")
    val age = readLine()!!.toInt()
    println("age is $age")

    val message: String = when {
        age < 18 -> {
            "You're too young to vote."
        }
        age == 18 -> {
            "Congratulations"
        }
        else -> {
            "You can vote."
        }
    }
}
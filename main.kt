fun main(args: Array<String>)
{
    week3()
}
fun week3() {
    // multiples 0f 3 for fizz, while 5 for Buzz,
    // then multiples of 3 and 5 is fizzbuzz
    for (i in 1..100)
    {
        if (i % 3 == 0 && i % 5 == 0)
            println("FizzBuzz")
        else
            if (i % 3 == 0) println("Fizz")
            else
                if (i % 5 == 0)
                    println("Buzz")
                else
                    println(i)
    }
    //reverse statement
    var greeting = "Good food"
    var size = greeting.length - 1
    for (index in greeting.indices)
    {
        print(greeting[size - index])
    }
}
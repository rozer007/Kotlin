fun main()
{
    val n=10
    var ot10=1..n; // we define till a variable number
    var oto100=1.rangeTo(20)

    println(ot10)
    println(oto100)

    var tto1=30.downTo(12) // reverse order

    println(tto1)

    var st=tto1.step(3)
    println(st)

    for (i in ot10)
    {
        print("${i} ")
    }
    println()
    for (i in st)
    {
        print("${i} ")
    }
    println()
    for (i in ot10.reversed())
    {
        print("${i} ")
    }
}
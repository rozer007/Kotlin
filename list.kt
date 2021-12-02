fun main()
{
    var lis:MutableList<Int> = mutableListOf(1,2,3,4,5,6)
    var lis1:List<Int> = listOf(1,2,3,4,5,6)

    var l=lis.subList(1, 5)

    for (i in l)
    {
        println(lis[i])
    }

    var listt=mutableListOf<Int>(lis);
    listt.add(10);
    println(listt);
}
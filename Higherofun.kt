fun main()
{
    var n=1..10
    var even=n.filter{it%2==0}
    even.forEach{i->print("${i} ")}

    var mulh1=h1(5)
    println(mulh1(5))

    var mul={nq:Int->nq*2}
    var arr=arrayOf(1,2,3,4,5)

    h2(arr, mul)

}

fun h1(n:Int):(Int) -> Int={m->n*m}
fun h2(num:Array<Int>,func:(n:Int) -> Int){
    for(i in num)
    {
        println("h2 : ${func(i)}");
    }
}

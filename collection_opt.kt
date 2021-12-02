fun main()
{
    var v=1..10
    println(v.reduce{x,y-> x+y});
    println(v.fold(10){x,y-> x+y});
    println(v.any{x->x%2==0});
    println(v.all{it%2==0});

    var lis=v.filter{it%2==0}
    lis.forEach{x->print(x)}
    println()
    var lis1=v.map{it*2}
    lis1.forEach{x->print("${x} ")}

}
fun main()
{
    var sum={a:Int,b:Int-> a +b};
    println(sum(1,3))


    var sum1={a:Int,b:Int ->
    var num=a+b
    num.toString()
}
    println(sum1(1,3))

    var sum2:(Int,Int)->String={a,b->(a+b).toString()}
    println(sum2(1,3))

    var sum3=fun(a:Int,b:Int):String{
        return "a + b ${a+b}";
    }

    println(sum3(1,3))

    var st:String.(Int)-> String ={
        this+it;
    }

    println("abc".st(90));
}
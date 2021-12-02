fun main()
{
    fun add(a:Int,b:Int):Int = a+b;
   //we don't need write the return type for a single line function
    fun sub(a:Int,b:Int)=a-b;   

    println("add : ${add(1,4)}");
    println("sub : ${sub(4,1)}");

    println("sub : ${sub(b=1,a=9)}")

    fun hello():Unit=println("hello world!");
    hello()

    // funxtion which returns mutiple value

    fun mutli(a:Int):Pair<Int,Int>
    {
        return Pair(a+1,a+2);
    }

    val(n,m)=mutli(1);
    print("1 $n $m")

    fun tri(a:Int):Triple<Int,Int,String>
    {
        return Triple(a+1,a+2,"Bye");
    }

    val (p,k,o) = tri(1);
    print(" triple 1 ${p} ${k} ${o}");


    //varibale number of parameter

    fun sum(vararg num:Int):Int{
        var sum=0;
        num.forEach{n->sum+=n}

        return sum
    }

    println(sum(1,2,3,4,5,6));

    //lambda function

    var lm={g:Int,i:Int -> g*i*90}

    println(lm(8,9));

    //tail recursion

    tailrec fun facttail(x:Int,v:Int):Int
    {
        if(x==0)return v
        else return facttail(x-1,v*x)
    }
    println(facttail(5,1));

    fun fact(ft:Int):Int
    {
        tailrec fun factt(x:Int,v:Int):Int
        {
            if(x == 0)return v
            else return factt(x-1,v*x)
        } 
        return factt(ft,1)  
    }
    println(fact(5));
}
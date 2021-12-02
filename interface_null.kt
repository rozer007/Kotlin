fun main() {
    var b=brd("ko",true);
    b.get(0.9)

    var c:String?=null;
    println(c)
    fun ge():String?{return null}

    // var n=c!!.length;
    // println(n)

    var n2=ge()?: "is null"

    println(n2)
}

interface jiop{
    var b:Boolean
    fun get(d:Double):Unit
}

class brd(val name:String,override var b:Boolean):jiop
{
    override fun get(d:Double):Unit
    {
        if(b)
        {
            println("fly ${d}");
        }
    }
}
import java.util.Random;
fun main()
{
    var rand=Random();
    val m=rand.nextInt(50)+1;

    var g=0;
    while(g!=m)
    {
        g++;
    }
    println("The Number is ${g}");

    for( i in 0..10)
    {
        print("${i} ")
    }

    var arr=arrayOf(2,3,4,5,6,7,8);
    println()
    for( i in arr)
    {
        print("${i} ")
    }

    //for accessing the array indices

    println()
    for( i in arr.indices)
    {
        print("${i} ")
    }
    println()

    for((indx,value) in arr.withIndex())
    {
        println("index : ${indx} , value : ${value}")
    }

    var arrgg=arrayOf(1..8,9..13)
    for(i in arrgg[1])
    {
        print("${i} ")
    }
}
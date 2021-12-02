fun main()
{
    var arr=arrayOf(1,2,3,4,5,6,7,"hello","world");
    println(arr[7]);

    var arr1=Array(5,{i->i*i});
    println(arr1[2]);

    var arr2=intArrayOf(1,2,3,3,4,5);
    println(arr2[3])

    var arr3 : Array<Int> = arrayOf(1,2,3,3,4,5);
    println(arr3[4])

    var arr4=arrayOf<Int>(2,3,3,4,5);
    println(arr4[3])

    println("size : ${arr.size}");
    println("first : ${arr.first()}");
    println("Indexof : ${arr.indexOf("world")}")
    val arrr=arr.copyOfRange(2,4);
    println("arrr[0] : ${arrr[0]}")

    println(arrr.reversed()); //print the reversed array


    var arrgg=arrayOf(1..8)
    println(arrgg[0])

    for( i in arr4)
    {
        println(i)
    }
    
}
fun main()
{
    var map=mutableMapOf<Int,Any?>();
    var map1=mutableMapOf(1 to "hello",2 to "Bye");

    println(map1[1])

    map[1] ="popopp"
    map[2] ="lolololo"

    map.put(9,"pop")
    for((x,y) in map)
    {
        println("key : $x -> value $y")
    }

}
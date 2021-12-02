fun main()
{
    var st:String = "hello world";
    var str:String = """ this is the wolrd world
    kfkkfkkf lololololo""";

    println(st+str);
    println((st+str).length);

    println("A".equals("b"));
    println("A".compareTo("b"));

    println(st.get(6));
    println(st[6]);
    println(st.subSequence(3,6));
    println(st.contains("wor")); //gives the difference

    println(('A'-'B').toInt());
}
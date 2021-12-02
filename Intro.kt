import java.util.*;
fun main() {
    var a=10;
    var b:Int = 10;

    println("a = ${a}");
    println("b = ${b}");
    
    var d:Double =1.1111111111111111+1.111111111111111111111; //precide till 15 digit
    
    println("d = ${d}");
    
    var l:Long = Long.MAX_VALUE;
    
    println("l = ${l}");

    //Type casting
    var letter :Char = 'A';

    println(letter.code);
    println(letter.toInt());
    println(65.toChar());
    
    // is keyword

    if( letter is Char);
    println("true");
}
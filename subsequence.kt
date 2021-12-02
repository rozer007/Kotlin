import java.util.Scanner;
fun main() {
    val scn = Scanner(System.`in`)
    var str= scn.next();
    var ss=gss(str);
    println(ss);
}

fun gss(str: String): MutableList<String> {
    if(str.length==0)
    {
        var mid=mutableListOf<String>();
        mid.add("");
        return mid;
    }
     var ch : Char=str[0];
     var ros:String=str.substring(1);

     var rres: MutableList<String> = gss(ros);
     var mres=mutableListOf<String>();

     for( s in rres)
     {
         mres.add(s);
     }

     for(st in rres)
     {
         mres.add(ch+st);
     }
     return mres;
}

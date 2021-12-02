import java.util.Scanner;
fun main() {
    val scn = Scanner(System.`in`)

    var n :Int = scn.nextInt();
    var m :Int = scn.nextInt();

    val mat=Array(n){IntArray(m)};

    for (i in mat.indices)
    {
        for( j in mat[0].indices)
        {
            var ing:Int = scn.nextInt();
            mat[i][j]=ing;
        }
    }

    var minr=0;
    var minc=0;
    var maxr=mat.size-1;
    var maxc=mat[0].size-1;

    var tno=n*m;
    var count=0;

    while( count < tno)
    {
        var a=minr;
        while( count < tno&& a<=maxr )
        {
            println(mat[a][minc]);
            count++;
            a++;
        }
        minc++;
        var b =minc;
        while( count < tno && b<=maxc)
        {
            println(mat[maxr][b]);
            count++;
            b++;
        }
        maxr--;

        var c=maxr;
        while( count <tno && c>=minr)
        {
            println(mat[c][maxc]);
            count++;
            c--;
        }
        maxc--;

        var d=maxc;
        while( count < tno && d>= minc)
        {
            println(mat[minr][d]);
            count++;
            d--;
        }
        minr++;
    }
}
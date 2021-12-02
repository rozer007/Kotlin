fun main()
{
    var div=0
    try
    {
        var d=5/div
        println("d")
    }
    catch (e: Exception)
    {
        println(e.message)
    }

    try
    {
        if(div==0){
            throw IllegalArgumentException("Don't give zero as an divisor")
        }
        else
        {
            println(5/div);
        }
    }
    catch (e: IllegalArgumentException)
    {
        println(e.message);
    }
}
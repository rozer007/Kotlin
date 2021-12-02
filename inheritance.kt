fun main()
{
    var obj=animals("tommyy",90.9f);
    obj.info()

    var d=dog("tony",90.9f,"smith")
    d.info()
}

open class animals(val name: String,var weight: Float) // open to extentions
{
    init {
        var reg=Regex(".*\\d+.*");
        require(!reg.matches(name)){"no deci"}
        require(!name.matches(reg)){"no deci name"}

        require(weight>0){"can't be zero"}
    }

    open fun info():Unit
    {
        println("info $name is name with weight $weight")
    }

}

class dog(name: String,skills: Float,owner:String):animals(name,weight)
{

    override fun info():Unit
    {
        println("info $name is name weight $weight with owner $owner")
    }
}
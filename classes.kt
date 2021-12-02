fun main()
{
    var obj=animals("tom1myy","10");
    obj.info()
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
        println("info  - $name is name with weight : $weight")
    }

}
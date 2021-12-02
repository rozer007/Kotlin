fun main()
{
    val age=10;

    if (age < 5){
        println("Go to Preschool")
    } else if (age == 5){
        println("Go to Kindergarten")
    } else if ((age > 5) && (age <= 17)){
        val grade = age - 5
        println("Go to Grade $grade")
    } else {
    println("Go to College")
    }

    when(age) {
        1,2,3,4-> println("Go to Preschool");

        5->println("Go to Kindergarten");

        in 6..17 ->{
            var num=age-5
            println("Go to Grade $num")
        }

        else -> println("Go to College")
    }
}
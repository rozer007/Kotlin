// fun main(){
//     var n = readLine()!!.toInt();

//     var div = 1;
//     var count = 0;
//     while(div<= n) 
//     {
//         if(n % div == 0) 
//         {
//             count++;
//         }
//         div++;
//     }

//     if(count==2) {
//         println("Prime")
//     } else {
//         println("Not Prime")
//     }

// }
//optimixe


// bar chart

fun main() {
    print("Enter a number: ");
    var n = readLine()!!.toInt();
    var arr = Array(n) { _ -> 0 };

    
    for (i in arr.indices) {
        arr[i] = readLine()!!.toInt();
    }
    var max = arr[0];
    
    for (i in arr.indices) {
        max = maxOf(max, arr[i]);
    }

    for (i in max downTo 1) {
        for (j in arr.indices) {
            if (arr[j] >= i) {
                print("*\t");
            } else {
                print("\t");
            }
        }
        println();
    }
}
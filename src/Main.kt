import kotlin.math.max
import kotlin.math.min

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    var arr: Array<Int> = arrayOf(673, 101, 2044, 8, 2872, 6, 19, 44, 19756, 71, 54)

    val newArr = IntArray(arr.size)


   for(i in 0 until  arr.size - 1) {
        for (j in 0 until arr.size - 1) {
            newArr[j] = min(arr[j], arr[j + 1])
            newArr[j + 1] = max(arr[j], arr[j + 1])
            arr[j] = newArr [j]
            arr[j + 1] = newArr [j + 1]
        }
    }

    for (i in 0.. arr.size - 1){
        println(arr[i])
    }


}
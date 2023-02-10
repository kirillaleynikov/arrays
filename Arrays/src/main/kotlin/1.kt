import kotlin.random.Random

fun main(args: Array<String>) {
    var arraysize:Array<String>
    var itemsoutput=""

    do {
        println("Введите размер двумерного массива через пробел (n m), где n - кол-во строк, а m - кол-во столбцов:")
        arraysize = readln().split(" ").toTypedArray()
    }
    while(arraysize.size!=2||arraysize[0].toIntOrNull()==null||arraysize[1].toIntOrNull()==null||
          arraysize[0].toInt()<=0||arraysize[1].toInt()<=0)

    for (i in 0 until arraysize[0].toInt()) {
        for (j in 0 until arraysize[1].toInt()){
            itemsoutput+=Random.nextInt(100,1000).toString()+" "
            print("${itemsoutput.split(" ")[itemsoutput.split(" ").size-2]} ")
        }
        println()
    }
    println("В массиве использовано ${itemsoutput.toSet().size-1} различных цифр")
}



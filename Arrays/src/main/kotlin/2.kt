import kotlin.random.Random
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    var sym=true
    var arraysize="5"
    var itemsoutput:ArrayList<ArrayList<Int>> = arrayListOf()

//                          Если потребуется ввод размера массива пользователем
//
//    do {
//        println("Введите размер симметричной матрицы в виде одного целого числа (кол-во строк и столбцов):")
//        arraysize = readln()
//    }
//    while(arraysize.toIntOrNull()==null||arraysize.toInt()<=0)

    for (i in 0 until arraysize.toInt()) {
        itemsoutput.add(arrayListOf())
            for (j in 0 until arraysize.toInt()){
                itemsoutput[i].add(Random.nextInt(0,10))
                print("${itemsoutput[i][j]} ")
            }
        println()
    }

    for (i in 0 until arraysize.toInt()) {
        for (j in 0 until arraysize.toInt()) {
            if (itemsoutput[i][j] != itemsoutput[j][i]) {
                sym = false
            }
        }
    }

    if (!sym){
        println("Массив не является симметричным относительно главной диагонали")
    }
    else{
        println("Массив является симметричным относительно главной диагонали")
    }
}
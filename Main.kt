//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//1
    favoriteBook(null)
    println("=============================================")
//2
    println("${divideIfWhole(81, 3)}")
    println("==============================================")

//3
    val array = arrayOf("Привет","как", null, "дела")
    val newArray: MutableList<String> = mutableListOf()
    var j = 0
    for (i in array){
        if (i != null){
            newArray.add(j, i)
            j++
        }
        else continue
    }

    newArray.forEach{element -> print("$element ")}
}

fun favoriteBook (book: String?){
    if (book == null) println("У меня нет любимой книги")
    else println("Моя любимая книга \"$book\"")
}

fun divideIfWhole(divisible: Int, divider: Int) : Int{
    var div: Int = divisible
    var res: Int
    var num: Int = 0
    while (true){
        res = div / divider
        if (res * divider == div){
            num++
            div = res
        }
        else {
            break
        }
    }
   return num
}

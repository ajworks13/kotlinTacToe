fun main() {
    //var user = readLine()
    gameBoard()

} // main function

fun gameBoard(p1: String = "", p2: String = ""){
    var firstRow = mutableListOf(" "," "," ")
    var secondRow = mutableListOf(" "," "," ")
    var thirdRow = mutableListOf(" "," ", " ")

    println(" ${firstRow[0]} | ${firstRow[1]} | ${firstRow[2]} ")
    println("-----------")
    println(" ${secondRow[0]} | ${secondRow[1]} | ${secondRow[2]} ")
    println("-----------")
    println(" ${thirdRow[0]} | ${thirdRow[1]} | ${thirdRow[2]} ")


}

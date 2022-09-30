fun main() {

    var boss: String? = null // empty for now

    val randomNumberForBoss = (1..3).random()
    if(randomNumberForBoss == 1){
        boss = "Master Donut Toe"
    }else if(randomNumberForBoss == 2){
        boss = "Blue Toe"
    }else if(randomNumberForBoss == 3){
        boss = "Thirty Toe"
    }

    println("Welcome user! CPU boss is waiting! what is your name?")
    val user = readLine()
    println("Alright $user, the boss you're facing this time is: $boss")
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

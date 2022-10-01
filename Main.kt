fun main() {

    var boss: String? = null // empty for now
    var playerDecision: String? = null
    var gameOver = false

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

    do{
        gameBoard()
        println("$user, you go first!")
        playerDecision = readLine()

        gameBoard(p1 = playerDecision)
        // LEFT OFF HERE.....................................

    }while(gameOver != true)

} // main function

fun gameBoard(p1: String? = "", cpu: String? = ""){
    // using these lists to track a winning or draw pattern.
    var firstRow = mutableListOf(" "," "," ")
    var secondRow = mutableListOf(" "," "," ")
    var thirdRow = mutableListOf(" "," ", " ")

    // if a number goes missing, the next turn can not select that slot.
    var gameBoardRef = mutableListOf(1,2,3,4,5,6,7,8,9)

    when(p1){

    }


    // the board.
    println(" ${firstRow[0]} | ${firstRow[1]} | ${firstRow[2]} ")
    println("-----------")
    println(" ${secondRow[0]} | ${secondRow[1]} | ${secondRow[2]} ")
    println("-----------")
    println(" ${thirdRow[0]} | ${thirdRow[1]} | ${thirdRow[2]} ")


}

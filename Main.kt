import kotlin.random.Random


// global area

// determines winning or draw patterns.
var firstRow = mutableListOf(" "," "," ")
var secondRow = mutableListOf(" "," "," ")
var thirdRow = mutableListOf(" "," ", " ")

// Keeps track of which ones can not be used after it was already chosen
var gameBoardRef = mutableListOf(1,2,3,4,5,6,7,8,9)
var cpuNumbers = mutableListOf(1,2,3,4,5,6,7,8,9)

var count = 0
//-----------------------------------------------------------------------------

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
    //gameBoard()

    do{
        println("$user, you go first!")
        playerDecision = readLine()

        var intPlayerDecision = playerDecision?.toInt()

        when(intPlayerDecision) {
            1 -> {
                firstRow.add(0, "O")
                cpuNumbers.remove(1)
            }

            2 -> {
                firstRow.add(1, "O")
                cpuNumbers.remove(2)
            }

            3 -> {
                firstRow.add(2, "O")
                cpuNumbers.remove(3)

            }

            4 -> {
                secondRow.add(0, "O")
                cpuNumbers.remove(4)

            }

            5 -> {
                secondRow.add(1, "O")
                cpuNumbers.remove(5)

            }

            6 -> {
                secondRow.add(2, "O")
                cpuNumbers.remove(6)

            }

            7 -> {
                thirdRow.add(0, "O")
                cpuNumbers.remove(7)

            }

            8 -> {
                thirdRow.add(1, "O")
                cpuNumbers.remove(8)

            }

            9 -> {
                thirdRow.add(2, "O")
                cpuNumbers.remove(9)

            }
        }

       // regulator(p1 = playerDecision)
        gameBoard(p1 = playerDecision)

        var cpuDecisionNumber = Random.nextInt(cpuNumbers.size)

        when(cpuDecisionNumber){
            1 -> {
                firstRow.add(0,"O")
                cpuNumbers.remove(1)
            }
            2 -> {
                firstRow.add(1,"O")
                cpuNumbers.remove(2)
            }
            3 -> {
                firstRow.add(2,"O")
                cpuNumbers.remove(3)

            }
            4 -> {
                secondRow.add(0,"O")
                cpuNumbers.remove(4)

            }
            5 -> {
                secondRow.add(1,"O")
                cpuNumbers.remove(5)

            }
            6 -> {
                secondRow.add(2,"O")
                cpuNumbers.remove(6)

            }
            7 -> {
                thirdRow.add(0,"O")
                cpuNumbers.remove(7)

            }
            8 -> {
                thirdRow.add(1,"O")
                cpuNumbers.remove(8)

            }
            9 -> {
                thirdRow.add(2,"O")
                cpuNumbers.remove(9)

            }


        }
        // convert random choice for cpu into string to be accepted by function.
        var strCpuDecisionNumber = cpuDecisionNumber.toString()
       // regulator(cpu = strCpuDecisionNumber)
        gameBoard(cpu = strCpuDecisionNumber)
        println("CPU's SELECTION: $strCpuDecisionNumber")
        println("This is CPU numbers: $cpuNumbers")

    }while(gameOver != true)

} // main function

fun regulator(p1: String? = null, cpu: String? = null){
    //println("The count $count")
    if(count >= 1 && p1 == "1" && gameBoardRef[0] == 0){
        println("ALREADY SELECTED")
        do{
            println("Try another unselected number: ")
            println(gameBoardRef)
            var p1Chance = readLine()
            // DOESNT WORK.........................
            if(p1Chance != "1" || gameBoardRef[1] != 0 || gameBoardRef[2] != 0 ||
                gameBoardRef[3] != 0 || gameBoardRef[4] != 0 || gameBoardRef[5] != 0 ||
                gameBoardRef[6] != 0 || gameBoardRef[7] != 0 || gameBoardRef[8] != 0){

                break
            }
        }while(true)

    }else if(count >= 1 && cpu == "1" && gameBoardRef[0] == 0){
        println("To cpu: ALREADY SELECTED!")
    }

    if(p1 == "1" || cpu == "1" && gameBoardRef.contains(0)){
        gameBoardRef[0] = 0
        count++
    }
    if(p1 == "2" || cpu == "2"){gameBoardRef[1] = 0}
    if(p1 == "3" || cpu == "3"){gameBoardRef[2] = 0}
    if(p1 == "4" || cpu == "4"){gameBoardRef[3] = 0}
    if(p1 == "5" || cpu == "5"){gameBoardRef[4] = 0}
    if(p1 == "6" || cpu == "6"){gameBoardRef[5] = 0}
    if(p1 == "7" || cpu == "7"){gameBoardRef[6] = 0}
    if(p1 == "8" || cpu == "8"){gameBoardRef[7] = 0}
    if(p1 == "9" || cpu == "9"){gameBoardRef[8] = 0}

// LEFT OFF HERE...................................

}

fun gameBoard(p1: String? = "", cpu: String? = ""){
    println(gameBoardRef)
    // removes the selected slot.


    when(p1){
        "1" -> firstRow.add(0, "X")
        "2" -> firstRow.add(1, "X")
        "3" -> firstRow.add(2,"X")
        "4" -> secondRow.add(0,"X")
        "5" -> secondRow.add(1,"X")
        "6" -> secondRow.add(2,"X")
        "7" -> thirdRow.add(0,"X")
        "8" -> thirdRow.add(1,"X")
        "9" -> thirdRow.add(2,"X")


//        else -> do{
//                    var corrected = false
//
//                    println("Invalid input. Try 1 through 9 if it is available.")
//                    var outOfBounce = readLine()!!.toInt() // converting to int
//// LEFT OFF HERE.....................................
//                    if(outOfBounce <= 1 || outOfBounce >= 9){
//                        corrected = true
//                    }
//
//                }while(corrected != true)

    }


    // the board.
    println(" ${firstRow[0]} | ${firstRow[1]} | ${firstRow[2]} ")
    println("-----------")
    println(" ${secondRow[0]} | ${secondRow[1]} | ${secondRow[2]} ")
    println("-----------")
    println(" ${thirdRow[0]} | ${thirdRow[1]} | ${thirdRow[2]} ")


}

/*
------------------------------------------------------------------------------------------------------
Give the computer an array to go through at random. If a number is selected, it gets removed
to prevent from being selected.

Maybe have the user share the same fate from the same list.

CPU is able to select number 0. Remove that ability.

When user prints, it shows a O next to any decision from user at the same time.












 */

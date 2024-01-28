fun main() {
    var input = 0

    val one = "Chocolate"
    val two = "Vanilla"
    val three = "Sherbet"
    val four = "Butter Pecan"
    val five = "Mint Chip"
    val six = "Exit"

    do{
        println("Input the number of your preferred flavor")
        println("1) $one")
        println("2) $two")
        println("3) $three")
        println("4) $four")
        println("5) $five")
        println("6) $six")

        print("Enter Choice: ")
        input = readln().toInt()
        if(input < 1){
            println("Invalid Input")
        }
        else if(input >5){
            println("Invalid Input")
        }

        when(input){
            1 -> println("You chose $one")
            2 -> println("You chose $two")
            3 -> println("You chose $three")
            4 -> println("You chose $four")
            5 -> println("You chose $five")
            6 -> println("You chose to $six")
        }
    }while(input !=6)

}
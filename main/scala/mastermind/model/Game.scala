package mastermind.model

class Game {
    val player = new Player()

    def isWon(): Boolean = {
        if (player.won){
            true
        }
        else {
            false
        }
    }
}

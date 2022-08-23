package mastermind.model

import scala.collection.mutable.ListBuffer

class Player {
    var guessCount: Int = 0
    var won: Boolean = false
    var guess: ListBuffer[Peg] = ListBuffer(new PegWhite, new PegWhite, new PegWhite, new PegWhite)
    var feedback: ListBuffer[Peg] = ListBuffer(new PegWhite, new PegWhite, new PegWhite, new PegWhite)
    var board: Board = new Board()
    var pegSelected: Peg = new PegWhite
}

package mastermind.model

import scala.util.Random
import scala.collection.mutable.ListBuffer

class Board {
    val pegList: ListBuffer[Peg] = ListBuffer(new PegRed, new PegBlue, new PegPink, new PegGreen, new PegOrange, new PegBlack, new PegYellow)
    val feedbackPegs: ListBuffer[Peg] = ListBuffer(new PegBlack, new PegGrey, new PegWhite)
    val rows: Int = 10
    var answer: ListBuffer[Peg] = ListBuffer[Peg]()

    answer = generateAnswer()
    
    def generateAnswer(): ListBuffer[Peg] = {
        (Random.shuffle(pegList).slice(0,4))
    }
}

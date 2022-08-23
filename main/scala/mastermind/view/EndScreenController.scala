package mastermind.view

import mastermind.MainApp
import scalafx.event.ActionEvent
import scalafx.scene.image.{Image, ImageView}
import scalafx.scene.control.Label
import scalafxml.core.macros.sfxml
import scalafx.stage.Stage

@sfxml
class EndScreenController(private val endScreen: ImageView, private val winStatus: Label){
    var dialogStage: Stage  = null
    var winOrLose: Boolean = false
    
    def showEnd(winOrLose: Boolean): Unit = {
        if (winOrLose == true){
            endScreen.image = new Image("file:resources/images/wonGame.jpg")
        }
        else{
            endScreen.image = new Image("file:resources/images/lostGame.png")
            winStatus.text = "YOU LOST!"
        }
    }

    def handlePlayAgain(action: ActionEvent): Unit = {
        dialogStage.close()
        MainApp.showGameView()  
    }

    def handleReturnHome(action: ActionEvent): Unit = {
        dialogStage.close()
        MainApp.showTitleScreen()
    }
}

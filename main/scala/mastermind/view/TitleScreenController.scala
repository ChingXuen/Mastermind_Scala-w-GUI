package mastermind.view

import mastermind.MainApp
import scalafx.event.ActionEvent
import scalafx.scene.image.{Image, ImageView}
import scalafxml.core.macros.sfxml

@sfxml
class TitleScreenController(private val bgImage: ImageView) {
    bgImage.image = new Image("file:resources/images/titleBgImage.jpg")
    
    def handlePlay(action: ActionEvent): Unit = {
        MainApp.showGameView()
    }

    def handleExit(action: ActionEvent): Unit = {
        System.exit(0)
    }

    def handleInstructions(action: ActionEvent): Unit = {
        MainApp.showInstructions()
    }
}

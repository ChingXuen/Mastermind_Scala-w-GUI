package mastermind.view

import mastermind.MainApp
import scalafx.event.ActionEvent
import scalafx.scene.image.{Image, ImageView}
import scalafxml.core.macros.sfxml

@sfxml
class InstructionsController(private val bgImage1: ImageView, private val bgImage2: ImageView) {
    bgImage1.image = new Image("file:resources/images/gameBgImage.jpg")
    bgImage2.image = new Image("file:resources/images/gameBgImage.jpg")
    
    def handleReturnHome(action: ActionEvent): Unit = {
        MainApp.showTitleScreen()
    }
}

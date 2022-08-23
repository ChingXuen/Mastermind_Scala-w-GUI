package mastermind

import scalafx.scene.Scene
import scalafx.application.JFXApp
import javafx.{scene => jfxs}
import scalafx.Includes._
import scalafx.application.JFXApp.PrimaryStage
import scalafxml.core.{NoDependencyResolver, FXMLView, FXMLLoader}
import scalafx.scene.image.Image
import scalafx.stage.{ Stage, Modality }
import mastermind.view.EndScreenController

object MainApp extends JFXApp {
    val rootResource = getClass.getResource("view/RootLayout.fxml") 
    val loader = new FXMLLoader(rootResource, NoDependencyResolver) 
    loader.load()
    val roots = loader.getRoot[jfxs.layout.BorderPane] 

    stage = new PrimaryStage{
        title = "Mastermind"
        width = 620
        height = 730
        icons += new Image("file:resources/images/logo.png")

        scene = new Scene{
            root = roots
        }
    }

    def showTitleScreen(): Unit = {
        val resource = getClass.getResource("view/TitleScreen.fxml") 
        val loader = new FXMLLoader(resource, NoDependencyResolver) 
        loader.load(); 
        val roots = loader.getRoot[jfxs.layout.AnchorPane] 
        this.roots.setCenter(roots) 
    }

    def showInstructions(): Unit = {
        val resource = getClass.getResource("view/Instructions.fxml") 
        val loader = new FXMLLoader(resource, NoDependencyResolver) 
        loader.load(); 
        val roots = loader.getRoot[jfxs.layout.AnchorPane] 
        this.roots.setCenter(roots) 
    }

    def showGameView(): Unit = {
        val resource = getClass.getResource("view/GameView.fxml") 
        val loader = new FXMLLoader(resource, NoDependencyResolver) 
        loader.load(); 
        val roots = loader.getRoot[jfxs.layout.AnchorPane] 
        this.roots.setCenter(roots) 
    }

    def showEndScreen(winOrLose: Boolean): Unit = {
        val resource = getClass.getResourceAsStream("view/EndScreen.fxml") 
        val loader = new FXMLLoader(null, NoDependencyResolver) 
        loader.load(resource); 
        val roots2 = loader.getRoot[jfxs.Parent]  
        val control = loader.getController[EndScreenController#Controller]        

        val dialog = new Stage() { 
            title = "Mastermind"
            icons += new Image("file:resources/images/logo.png")
            initModality(Modality.APPLICATION_MODAL)         // Referenced from OOP Lab 
            initOwner(stage) 
            scene = new Scene { 
                root = roots2 
            } 
        } 

        control.dialogStage = dialog
        control.showEnd(winOrLose)
        dialog.showAndWait() 
    }

    showTitleScreen()
}
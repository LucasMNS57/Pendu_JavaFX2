package Controller;

import com.example.pendu.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {

    @FXML
    private TextField Pseudo;

    @FXML
    private ImageView pendu;

    public void jouerbtn(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/View/"+ "Jeu.fxml" ));
            Scene scene = new Scene(fxmlLoader.load());
            GameController controller = fxmlLoader.getController();
            controller.FunctionPseudo(Pseudo.getText());
            controller.lettre();
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }


}
package Controller;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;


import java.net.URL;
import java.util.ResourceBundle;

public class GameController implements Initializable {

    @FXML
    private ImageView img1;

    @FXML
    private ImageView img2;

    @FXML
    private ImageView img3;

    @FXML
    private ImageView img4;

    @FXML
    private ImageView img5;

    @FXML
    private ImageView img6;

    @FXML
    private ImageView img7;


    @FXML
    private Label setPseudo;

    @FXML
    private TextField lettresaisi;

    @FXML
    private ListView lettreprop;

    @FXML
    private Label motcache;

    private String wordToGuess;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void FunctionPseudo(String Pseudo){
       setPseudo.setText(Pseudo);
    }

    public void lettre() {
        lettresaisi.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.ENTER) {
                    String texteSaisi = lettresaisi.getText();
                    ObservableList<String> items = lettreprop.getItems();
                    items.add(texteSaisi); // Ajoute le texte saisi à la ListView listAffiche
                    lettresaisi.setText("");
                    if (!wordToGuess.contains(texteSaisi)) {
                        img1.setVisible(true); // Affiche l'image d'erreur
                    } else {
                        img1.setVisible(false); // Cache l'image d'erreur
                    }
                }
            }
        });
    }
}





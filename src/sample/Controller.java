package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Random;

public class Controller {
    Random random = new Random();

    @FXML
    private Button RockButton;

    @FXML
    private Button PaperButton;

    @FXML
    private Button ScissorButton;

    @FXML
    private ImageView PImageView;

    @FXML
    private TextArea PlayerFormerChoiceTextArea;

    @FXML
    private ImageView AIImageView;

    @FXML
    private TextArea AIFormerChoiceTextArea;

    @FXML
    String aiCoice(){
        int choice = random.nextInt(3);
        if (choice == 0) return "Paper";
        else if (choice == 1) return "Rock";
        else return "Scissor";
    }

    @FXML
    void choosePaper(ActionEvent event) {
        Character rdm = (char) (random.nextInt(3) + 1);
        Character rdmAi = (char) (random.nextInt(3) + 1);
        Image pImage = new Image("images/Paper" + rdm + ".jpg");
        PImageView.setImage(pImage);
        Image aImage = new Image("images/" + aiCoice() + rdmAi + ".jpg");
        AIImageView.setImage(aImage);
        PlayerFormerChoiceTextArea.appendText("You chose Paper\n");
        AIFormerChoiceTextArea.appendText("The AI chose " + aiCoice());
    }

    @FXML
    void chooseRock(ActionEvent event) {
        Character rdm = (char) (random.nextInt(3) + 1);
        Character rdmAi = (char) (random.nextInt(3) + 1);
        Image pImage = new Image("images/Rock" + rdm + ".jpg");
        PImageView.setImage(pImage);
        Image aImage = new Image("images/" + aiCoice() + rdmAi + ".jpg");
        AIImageView.setImage(aImage);
        PlayerFormerChoiceTextArea.appendText("You chose Rock\n");
        AIFormerChoiceTextArea.appendText("The AI chose " + aiCoice());
    }

    @FXML
    void chooseScissor(ActionEvent event) {
        Character rdm = (char) (random.nextInt(3) + 1);
        Character rdmAi = (char) (random.nextInt(3) + 1);
        Image pImage = new Image("images/Scissor" + rdm + ".jpg");
        PImageView.setImage(pImage);
        Image aImage = new Image("images/" + aiCoice() + rdmAi + ".jpg");
        AIImageView.setImage(aImage);
        PlayerFormerChoiceTextArea.appendText("You chose Scissor\n");
        AIFormerChoiceTextArea.appendText("The AI chose " + aiCoice());
    }

}

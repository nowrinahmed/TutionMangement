package AllControlers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
public class LoginFormController {

  @FXML // fx:id="UserNameText"
  private TextField UserNameText; // Value injected by FXMLLoader
  
  @FXML // fx:id="passwordholder"
  private PasswordField passwordholder; // Value injected by FXMLLoader
  
  @FXML // fx:id="LogInButton"
  private Button LogInButton; // Value injected by FXMLLoader
  
  @FXML
  public void handleLogInButton1(ActionEvent actionEvent) throws Exception {
    System.out.println("logged IN");
    System.out.println(this.UserNameText.getText()+"\n"+this.passwordholder.getText());
    Stage stage1 = (Stage) LogInButton.getScene().getWindow();
    stage1.close();
    try {
      Stage AdminStage= new Stage();
      FXMLLoader loader = new FXMLLoader();
      Pane root1= loader.load(getClass().getResource("../AllFxmlFile/AdminDashBoard.fxml").openStream());
      
      AdminStage.setScene(new Scene(root1));
       AdminStage.sizeToScene();
       AdminStage.showAndWait();
      
  
  
    }catch(IOException ex){
      ex.printStackTrace();
    }
  }
  @FXML
  public void initialize(){
  
  }
  
  
  
}

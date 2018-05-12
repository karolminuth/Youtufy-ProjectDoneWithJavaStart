package pl.javastart.youtufy.controller;
 
import java.net.URL;
import java.util.ResourceBundle;
 
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuBar;
 
public class MenuPaneController implements Initializable {
 
    @FXML
    private MenuBar mainMenu;

	public MenuBar getMainMenu() {
		return mainMenu;
	}

	public void setMainMenu(MenuBar mainMenu) {
		this.mainMenu = mainMenu;
	}
	
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

}
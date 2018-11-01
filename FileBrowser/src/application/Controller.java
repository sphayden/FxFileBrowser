package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
	
	@FXML
	Label testLabel = new Label();
	
	@FXML
	void ClickHandler() {
		System.out.println("Hello Bois");
		testLabel.setText("testetstestes");	
	}
}

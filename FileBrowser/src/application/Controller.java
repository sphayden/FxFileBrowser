package application;

import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

public class Controller {
	
	@FXML
	TreeView myTreeView = new TreeView();
	
	@FXML
	Label testLabel = new Label();
	
	@FXML
	void ClickHandler() {
		System.out.println("Hello Bois");
		testLabel.setText("testetstestes");	
	}
}

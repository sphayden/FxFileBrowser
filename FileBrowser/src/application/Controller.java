package application;

import java.util.ArrayList;

import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

public class Controller {
	
	@FXML
	TreeView myTreeView = new TreeView();
	
	TreeViewHelper helper = new TreeViewHelper();
	@FXML
	Label testLabel = new Label();
	
	@FXML
	void ClickHandler() {
		System.out.println("test");
		testLabel.setText("testetstestes");	
		
		Main main = new Main();
		main = main.getInstance();
		
		Object test = myTreeView.getSelectionModel().getSelectedItem();
		
	}
	
	@FXML
	void ClickHandler2() {
		Object test = myTreeView.getSelectionModel().getSelectedItem();
	}
}

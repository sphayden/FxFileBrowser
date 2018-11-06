package application;
	
import java.util.ArrayList;

import javax.swing.event.ChangeListener;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {
	
	private static Main instance;
	public Main() {
		instance = this;
	}
	public static Main getInstance() {
		return instance;
	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
//			TreeViewHelper helper = new TreeViewHelper();
//			ArrayList<TreeItem> products = helper.getProducts();
//			TreeView treeView = new TreeView();
//			TreeItem rootItem = new TreeItem("Root");
//			rootItem.getChildren().addAll(products);
//			treeView.setRoot(rootItem);
			//treeView.setId("myTreeView");
			
			AnchorPane root = FXMLLoader.load(getClass().getResource("view.fxml"));
			
			TreeView treeView2 = (TreeView) root.lookup("#myTreeView");
			TreeViewHelper helper = new TreeViewHelper();
			ArrayList<TreeItem> products = helper.getProducts();
			TreeItem rootItem = new TreeItem("Root");
			rootItem.getChildren().addAll(products);
			treeView2.setRoot(rootItem);
			
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.setTitle("TreeView Example");
			primaryStage.show();
			

			treeView2.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> handle(newValue));
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public Object getSelectedNode(TreeView treeView) {
		return treeView.getSelectionModel().getSelectedItem().toString().split(",");
	}
	
	public Object handle(Object newValue) {
		System.out.println(newValue);
		String[] nodeData = newValue.toString().split(",");
		
		
		return nodeData;
	}

	public static void main(String[] args) {
		launch(args);
	}
	
}







/*BorderPane root = new BorderPane();
Scene scene = new Scene(root,400,400);
scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());*/
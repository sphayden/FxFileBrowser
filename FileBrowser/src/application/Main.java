package application;
	
import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			TreeViewHelper helper = new TreeViewHelper();
			ArrayList<TreeItem> products = helper.getProducts();
			TreeView treeView = new TreeView();
			TreeItem rootItem = new TreeItem("Root");
			rootItem.getChildren().addAll(products);
			treeView.setRoot(rootItem);
			
			VBox root = new VBox();
			root.getChildren().add(treeView);
			
			Scene scene = new Scene(root,400,400);
			primaryStage.setScene(scene);
			primaryStage.setTitle("TreeView Example");
			primaryStage.show();
			
//			Parent root = FXMLLoader.load(getClass().getResource("view.fxml"));
//			Scene scene = new Scene(root);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			primaryStage.setTitle("FXML Welcome");
//			primaryStage.setScene(scene);
//			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}







/*BorderPane root = new BorderPane();
Scene scene = new Scene(root,400,400);
scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());*/
package application;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;


public class TreeViewHelper {

	public TreeViewHelper() {
		
	}
	
	public ArrayList<TreeItem> getProducts() {
		ArrayList<TreeItem> tree = new ArrayList<TreeItem>();
		
		File dir = new File("C:/");
		
		TreeItem root = new TreeItem(dir.getName());
		root.getChildren().addAll(listFileTree(dir));
		tree.add(root);
		
		return tree;
	}
	
	public static ArrayList<TreeItem> listFileTree(File dir) {
		ArrayList<TreeItem> treeItem = new ArrayList<TreeItem>();
		
	    Set<File> fileTree = new HashSet<File>();
	    if(dir==null||dir.listFiles()==null){
	        return treeItem;
	    }
	    for (File entry : dir.listFiles()) {
	        if (entry.isFile()) treeItem.add(new TreeItem(entry.getName()));
	        else {
	        	TreeItem item = new TreeItem(entry.getName());
	        	item.getChildren().addAll(listFileTree(entry));
	        	treeItem.add(item);
	        }
	    }
	    return treeItem;
	}
}

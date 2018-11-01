package application;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javafx.scene.control.TreeItem;


public class TreeViewHelper {

	public TreeViewHelper() {
		
	}
	
	public ArrayList<TreeItem> getProducts() {
		ArrayList<TreeItem> tree = new ArrayList<TreeItem>();
		
		File dir = new File("C://Users/187218");
		FileNode node = new FileNode(dir.getAbsolutePath(), Long.toString(dir.length()), dir.getName());
		
		TreeItem root = new TreeItem(node.getName());
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
	        if (entry.isFile()) {
	        	FileNode node = new FileNode(entry.getAbsolutePath(), Long.toString(entry.length()), entry.getName());
	        	TreeItem treeItm = new TreeItem(node);
	        }
	        else {
	        	FileNode node = new FileNode(entry.getAbsolutePath(), Long.toString(entry.length()), entry.getName());
	        	TreeItem item = new TreeItem(node);
	        	item.getChildren().addAll(listFileTree(entry));
	        	treeItem.add(item);
	        }
	    }
	    return treeItem;
	}
}

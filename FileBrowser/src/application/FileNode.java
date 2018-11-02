package application;

public class FileNode {
	public FileNode(String pPath, String pFileSize, String pName) {
		path = pPath;
		fileSize = pFileSize;
		name = pName;
	}
	
	String path = "";
	String fileSize = "";
	String name = "";
	
	@Override
	public String toString() {
	    return path;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getFileSize() {
		return fileSize;
	}
	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}
	
	
}

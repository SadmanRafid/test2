import filesystem.File;

public class Echoer {
	
	
	public static void writeOnFile(File file, String content) {
		
		
	}
	
	public static void echoOverwrite(File file, String content) {
		file.deleteContent();
		file.setContent(content);
	}
	
	public static void echoAppend(File file, String content) {
		file.setContent(content);
	}
	
	public static void echoPrint(String content) {
		System.out.println(content);
	}
}

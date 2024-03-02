package fileOperation;

import java.nio.file.Paths;

public class GetCurentDirectory {

	public static void main(String[] args) {
		String path= System.getProperty("user.dir");
		System.out.println("Working dir: "+path);
		
		String path1 = Paths.get("").toAbsolutePath().toString();
		System.out.println("Working dir: "+path1);
	}

}

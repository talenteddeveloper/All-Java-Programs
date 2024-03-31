package fileOperation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FileToByte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path= System.getProperty("user.dir")+"\\src\\abc.txt";
		//System.out.println("Working dir: "+path);
		try {
			byte[] byteData= Files.readAllBytes(Paths.get(path));
			System.out.println(Arrays.toString(byteData));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

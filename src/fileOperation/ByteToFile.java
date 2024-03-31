package fileOperation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class ByteToFile {

	public static void main(String[] args) {
		String path= System.getProperty("user.dir")+"\\src\\abc.txt";
		String des= System.getProperty("user.dir")+"\\src\\abcFinal.txt";
		//System.out.println("Working dir: "+path);
		try {
			byte[] byteData= Files.readAllBytes(Paths.get(path));
			Files.write(Paths.get(des), byteData);
			System.out.println("Done");
			//System.out.println(Arrays.toString(byteData));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

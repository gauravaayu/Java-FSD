package FilesExample;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class CreateWriteFile1 {
	
	public static void createFileUsingOutputStream()  throws IOException
	{
		FileOutputStream out= new FileOutputStream("E:\\File\\gaurav2");
		String input="i am from prayagraj";
		byte array[]=  input.getBytes();
		out.write(array);
		System.out.println("Data Written Successfully");
		out.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			 createFileUsingOutputStream();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

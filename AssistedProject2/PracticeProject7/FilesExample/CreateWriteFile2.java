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

public class CreateWriteFile2 {
	
	public static void createFileUsingNIO() throws IOException
	{
		
		Path path=Paths.get("E:\\File\\gaurav3");
		//write data using file class
		String input="Welcome  to Prayagraj";
		byte array[]=input.getBytes();
		
		Files.write(path, array, StandardOpenOption.CREATE,StandardOpenOption.APPEND);
		System.out.println("Data Written Successfully");
		
		
		//if you want to write data of list to  files directly
		Path path1=Paths.get("E:\\File\\gaurav4");
		//write data  using Files class
		
		List<String> list=Arrays.asList("This  is my first line","This is my secondLine");
		Files.write(path1, list, StandardOpenOption.CREATE,StandardOpenOption.APPEND);
		System.out.println("Lines Written Successfully");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			 createFileUsingNIO();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

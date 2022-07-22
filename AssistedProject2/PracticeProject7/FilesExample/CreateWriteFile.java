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
public class CreateWriteFile {
	
	public static void createFileUsingFileClass() throws IOException
	{
		//create file
		File file= new File("E:\\File\\gaurav");
		
		if(file.createNewFile()) {
			System.out.println("File is Created");
		}
		else {
			System.out.println("File  is already Exist");
		}
		
		//write data to that file
		FileWriter  writer= new  FileWriter(file,false);//overWrites file
		//FileWriter  writer= new  FileWriter(file,true);//appends File
		writer.write("my name is gaurav...!");
		writer.close();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			 createFileUsingFileClass();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

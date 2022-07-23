package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class CreatWriteAppendDemo {
	
	public static void createFileUsingFileClass() throws IOException
	{
		//create file
		File file= new File("E:\\File\\aayu.txt");
		
		if(file.createNewFile()) {
			System.out.println("File is Created");
		}
		else {
			System.out.println("File  is already Exist");
		}
		FileWriter  writer= new  FileWriter(file,false);
		writer.write("hello my name is gaurav mishra---");
		writer.close();		
	}
	
	public static void createFileUsingNIO() throws IOException
	{
		
		Path path=Paths.get("E:\\File\\aayu.txt");
		String input="i am from prayagraj";
		byte array[]=input.getBytes();
		
		Files.write(path, array,StandardOpenOption.CREATE,StandardOpenOption.APPEND);
		System.out.println("Data Append Successfully");
		
	}
	
	public static void readFileReaderClass() throws IOException
	{ 
		//read file
		FileReader reader= new FileReader("E:\\File\\aayu.txt");
		
		int data;
		
		while((data=reader.read())!=-1){
			
			System.out.print((char)data);
		}
		
	}

	public static void main(String[] args) {
		
		try {
			
			createFileUsingFileClass();
			 createFileUsingNIO();
			 readFileReaderClass();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("file not available");
		}
		

	}

}

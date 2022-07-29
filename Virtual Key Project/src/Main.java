import java.util.Scanner;
import java.io.*;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		 System.out.println("\n");
	        System.out.println("\t\t WELCOME TO THE VIRTUAL KEY PROJECT \n");
	        System.out.println("\t\t**************************************");
	        System.out.print("\t\t Developer Name :");
	        System.out.println(" Gaurav Mishra");
	        System.out.println("\t\t**************************************\n");
	        //System.out.println("\n");
	        optionsSelection();


	}
	
	 private static void optionsSelection() {
		 System.out.println("\t******The Choices are below*******\n");
	        String[] arr = {"1. **Retrive Current Filename in Ascending Order**",
	                "2. **Business Level Operation Menu**",
	                "3. **Exit From the Application**@@"
	               
	        };
	        int[] arr1 = {1,2,3};
	        int  slen = arr1.length;
	        for(int i=0; i<slen;i++){
	            System.out.println(arr[i]);
	            // display the all the Strings mentioned in the String array
	        }
	        
	        System.out.println("\nEnter your choice:\t");
	        Scanner sc = new Scanner(System.in);
	        int  options =  sc.nextInt();
	        for(int j=1;j<=slen;j++){
	            if(options==j){
	                switch (options){
	                    case 1:
	                        System.out.println("***Retrive Current Filename in Ascending Order are listed below:*** \n");
	                        SortFile();
	                        optionsSelection();
	                        break;
	                    case 2:
	                       BLODemo();
	                        break;
	                    case 3:
	                    	System.out.println("Please wait.............\nClosing your application... \n(:Thank you:)");
	        
	        
	                }
	            }
	        }
	 }
	 
	 private static void SortFile() {
		// String[] pathnames;
		 System.out.println("**Enter the path to folder for Retrive Current Filename in Ascending Order---:");//line D:\ or D:\folder name you want open 
	      Scanner s1 = new Scanner(System.in);
	      String folderPath = s1.next();
		 File f = new File(folderPath);
		 if(f.isDirectory()){
			 List listFile = Arrays.asList(f.list());
			 
			 Collections.sort(listFile);
				System.out.println("---------------------------------------");
				System.out.println("**Sorting by Filename in ascending order**");
				for(Object o:listFile){
					String s =o.toString();
					System.out.println(s);
				}
		 }
			 
		 
		 
	 }
	 
	 private static void BLODemo() {
		 
		 String[] arr1 = {"1. **Add a file its content to the directory**",
	                "2. **Delete a file from directory**",
	                "3. **Searching a file and showing its content**",
	                "4. **Exit From BLO menu**"
	               
	        };
		 int[] arr2 = {1,2,3};
	        int  slen = arr1.length;
	        for(int i=0; i<slen;i++){
	            System.out.println(arr1[i]);
	            // display the all the Strings mentioned in the String array
	        }
	        System.out.println("\nEnter your choice--:\t");
	        Scanner sc = new Scanner(System.in);
	        int  options =  sc.nextInt();
	        for(int j=1;j<=slen;j++){
	            if(options==j){
	                switch (options){
	                    case 1:
	                        System.out.println("**Adding a file its content to the directory--|--|-- \n");
	                       try {
	                    	   AddFile();
						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("**file not found!!!**");
						}
	                       System.out.println("\n");
	                        BLODemo();
	                       // optionsSelection();
	                        break;
	                    case 2:
	                    	System.out.println("**Deleting a file from directory--|--|--\n");
	                    
	                       DeleteFile();
	                       System.out.println("\n");
	                       BLODemo();
	                        break;
	                    case 3:
	                    	System.out.println("**Searching a file and showing its content--|--|--");
	                    	try {
	                    		SearchingFileAndContent();
							} catch (Exception e) {
								// TODO: handle exception
								System.out.println("!!Error!!\n !!!File not found!!!\n !!Please enter the correct File path and File name!!\n (:Thank you:)");
							}
	                    	System.out.println("\n");
	                    	BLODemo();
	                    	break;
	                    case 4:
	                    	System.out.println("Closing your BLO menu tab... \nGoing to Main menu--|--|--");
	                    	System.out.println("\n");
	                    	optionsSelection();
	                    	break;
	        
	        
	                }
	            }
	        } 
	 }
	 
	 private static void AddFile() throws IOException {
		 Scanner sc = new Scanner(System. in ); //object of Scanner class  
	      System.out.print("**Enter the file name with specific location----: ");//like D:\FolderName\File name with type.
	      String name = sc.nextLine(); // name to store the file name  
	      FileOutputStream fos = new FileOutputStream(name, true);
	      // true for append mode  
	      System.out.print("**Enter file content---: ");
	      String str = sc.nextLine() + "\n";
	      
	      //str stores the string which we have entered  
	      byte[] b = str.getBytes(); //converts string into bytes  
	      fos.write(b); //writes bytes into file  
	      fos.close(); //close the file  
	      System.out.println("The file has been saved on the given path.");
		
			
	 }
	 
	 private static void DeleteFile() {
		 String st;
		 Scanner sc = new Scanner(System.in);
		 System.out.print("**Enter the Name of File to Delete----: ");//like D:\FolderName\File name with type.
		 st = sc.nextLine();
		 File myfile = new File(st);
		 if(myfile.delete())
	         System.out.println("\n**The file is deleted successfully(:**");
	      else
	         System.out.println("\n***Something went wrong!!!!***");
		 
		 
	 }
	 
	 private static void SearchingFileAndContent() throws Exception {
		 Scanner sc = new Scanner(System.in);
		System.out.println("**Enter the file name you want to search---:");//its case sensitive please enter like E:\Folder name \ file name with type 
		 String Str= sc.nextLine();
		 FileReader reader= new FileReader(Str);
			
			int data;
			System.out.print("**The Content of File you just searching is------> ");
			while((data=reader.read())!=-1){
				
				System.out.print((char)data);
				
			}	 
		 
	 }
	 
	 
}

package Excep;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class File_notfound_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try {
    	  File file  = new File("C:/Users/Admin/Downloads/Telegram Desktop/dbms practice questions.txt");
    	  FileReader fr = new FileReader(file);
    	  
      }
      catch(FileNotFoundException e){
    	  System.out.println("File does'nt exist or wrong file directory");
      }
	}

}

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.File;
import java.io.FileReader;

public class SearchingAFile
{
public static void main(String[] args)
{
String password, userInput = "zzzz";
Scanner inputStream = null;
try
{
inputStream = new Scanner(new FileReader("test.txt"));

//inputStream = new Scanner(new File("test.txt"));
}//end try

catch(FileNotFoundException e)
{
System.out.println("File not found, program will close.");
System.exit(0);
}//end catch

while(inputStream.hasNextLine())
{
password = inputStream.nextLine();
if(password.equals(userInput))
{
System.out.println("Found it: " + password);
break;
}//end if

}//end while loop

inputStream.close();

}//end main
}//end class

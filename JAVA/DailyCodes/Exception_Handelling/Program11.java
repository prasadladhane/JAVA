import java.io.*;
class FileNotFoundExceptionDemo{
	public static void main(String[]args){
		File fObj=new File("abc.text");
		FileReader fr=new FileReader(fObj);
	}
}

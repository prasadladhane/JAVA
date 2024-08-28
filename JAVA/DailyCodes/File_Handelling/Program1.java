import java.io.*;

class FileDemo{
	public static void main(String[]args)throws IOException{
		File fObj=new File("Incubators.txt");
		fObj.createNewFile();
	}
}


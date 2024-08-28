import java.io.*;

class FileDemo2{
	public static void main(String[]args)throws IOException{
		File dirObj=new File("Core2Web");
		dirObj.mkdir();

		File fObj=new File(dirObj,"Incubator2.txt");
		fObj.createNewFile();
	}
}
		




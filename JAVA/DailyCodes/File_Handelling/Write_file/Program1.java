import java.io.*;
class FileWrite{
	public static void main(String[]args)throws IOException{
		FileWriter obj=new FileWriter("Incubators.txt");
		obj.write("reactJS\n");
		obj.write("flutter\n");
		obj.write("springBoot");

		obj.close();
	}
}

import java.io.*;

class FileWrite2{
	public static void main(String[]args)throws IOException{
		FileWriter obj2=new FileWriter("Incubators.txt",true);
		obj2.write("reactJS");
		obj2.write("springBoot");
		obj2.write("Flutter");

		obj2.close();
	}
}


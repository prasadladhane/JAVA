import java.io.*;
class FileRead{
	public static void main(String[]args)throws IOException{
		FileWriter obj=new FileWriter("Incubators.txt");
		obj.write("reactJS\n");
		obj.write("flutter\n");
		obj.write("springBoot\n");
		obj.close();

		FileReader fr=new FileReader("Incubators.txt");
		int ch;
		while((ch=fr.read())!= -1){
			System.out.print((char)ch);
			ch++;
		}
		fr.close();
	}
}

				

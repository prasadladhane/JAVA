import java.io.*;

class DirList{
	public static void main(String[]args){
		File fObj=new File("./../File_Handelling");

		String names[]=fObj.list();
		for(int i=0;i<names.length;i++){
			System.out.println(names[i]);
		}
		System.out.println(names.length);
	}
}

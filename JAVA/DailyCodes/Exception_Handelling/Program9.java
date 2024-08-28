import java.io.*;
class IOExceptionDemo{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first String");
		String str1=br.readLine();

		br.close();

		System.out.println("Enter second String");
		String str2=br.readLine();
	}
}

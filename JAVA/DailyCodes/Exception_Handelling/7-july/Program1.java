import java.io.*;
class Demo{
	void fun(){
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try{
			br.close();
		}catch(IOException io){
		}
		String str=null;
		try{
			str=br.readLine();
		}catch(IOException ioe){
			System.out.println(ioe.toString());
			System.out.println(ioe.getMessage());
			ioe.printStackTrace();
		}
		System.out.println(str);
	}

	public static void main(String[]args){
		Demo obj=new Demo();
		obj.fun();
	}
}

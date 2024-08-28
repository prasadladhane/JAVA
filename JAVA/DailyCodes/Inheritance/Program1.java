class C2W{
	C2W(C2W obj){
		this(10);

		System.out.println(obj);
		System.out.println("In C2w");
	}
	C2W(int x){
	
		System.out.println("In C2w"+x);
	}
		

	public String toString(){
		return "this is c2w obj";
	}
	public static void main(String[]args){
		C2W obj = new C2W(1);
		C2W obj1 = new C2W(obj);


		System.out.println(obj);
		System.out.println(obj1);
	}
}

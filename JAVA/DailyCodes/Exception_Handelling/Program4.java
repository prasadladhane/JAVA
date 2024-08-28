class ArrayDemo3{
	public static void main(String[]args){
		System.out.println("Start Code");
		int arr[]=new int[]{10,20,30,40,50};
		int i=0;
		for(;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		try{
			System.out.println(arr[i]);
		}catch(Exception e){
			System.out.println("Exception Handelled");
		}
		System.out.println("End Code");
	}
}

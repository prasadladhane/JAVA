class Engg{
	Engg(){
		System.out.println("First year syllabus is common for all in branches");
	}
}

class Entc extends Engg{
	Entc(){
		System.out.println("Second year ENTC");
		System.out.println("third year ENTC");
		System.out.println("last year ENTC");
	
	}
}

class Comp extends Engg{
        Comp(){
                System.out.println("second year Computer");
                System.out.println("third year Computer");
                System.out.println("last year Computer");
	
        }
}

class client{	
	public static void main(String[]args){

		Comp cmp=new Comp();
		
	}
}


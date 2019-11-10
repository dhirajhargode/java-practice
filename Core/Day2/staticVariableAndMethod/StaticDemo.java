

class StaticDemo{


	static int i;


	static void m1(){

		System.out.println("in m1 "+i);
		i = 20 ;

		m2();

	}

	static void m2(){


		System.out.println("in m2 " + i);
		System.out.print();

		i = 30;		
	}

	public static void main(String[] args){


		System.out.println("i before initialize "+i);

		i = 10;

		System.out.println("i after initialize "+i);

		m1();

	}
}

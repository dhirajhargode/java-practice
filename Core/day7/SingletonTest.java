public class SingletonTest{

	public static void main(String[] args){
	
		//SingleTonDemo s = new SingleTonDemo();
		System.out.println(SingleTonDemo.increament());
		System.out.println(SingleTonDemo.increament());
		System.out.println(SingleTonDemo.increament());
		System.out.println(SingleTonDemo.increament());
		SingleTonDemo s1 = SingleTonDemo.getInstance();
		SingleTonDemo s2 = SingleTonDemo.getInstance();
		
		System.out.println(s1 == s2);
		
		SingleTonDemo s3 = (SingleTonDemo)s1.clone();
		System.out.println(s1 == s3);
		
	}

	
}
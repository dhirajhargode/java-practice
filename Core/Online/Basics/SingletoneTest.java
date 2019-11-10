class SingletoneTest{

	public static void main(String[] args) throws Exception{
		
		Singleton s1 = Singleton.getInstance();
		System.out.println(s1);	
			
		Singleton s2 = Singleton.getInstance();	
		System.out.println(s2);

		System.out.println("getInstance s1 == s2 "+(s1==s2));	
		
		Singleton s3 = (Singleton) s1.clone();
		System.out.println(s3);
		System.out.println("clone s1 == s3 "+(s1==s3));	

		}
	

}
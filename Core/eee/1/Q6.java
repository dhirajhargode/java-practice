interface Device{
	void doIt();
}

class Electronics implements Device{
	public void doIt(){
		
	}
}

abstract class Phone1 extends Electronics{
	
}
abstract class Phone2 extends Electronics{
	public void doIt(int x){
		
	}
}

class Phone3 extends Electronics implements Device{
	int $_x =10;
	static String symbol = "!@#$%&*";
	public static void main(String[] args){
		String st = "dhiraj";
		for(int i = 0 ; i < st.length()-1;i++){
			if (symbol.indexOf(st[i]) != -1) {
				System.out.println("ok");
			}
		}
		
		
		
	}
	
}

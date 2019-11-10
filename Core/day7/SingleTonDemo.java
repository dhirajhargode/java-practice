
public class SingleTonDemo{

	private static int num=0;
	private static SingleTonDemo obj = null;
	
	
	// dont delete it
	private SingleTonDemo(){
	}
	
	public static SingleTonDemo getInstance(){
		if(obj == null){
			obj = new SingleTonDemo();
		}
		return obj;
	}
	
	public static int increament(){
		if(num==0)
			num+=1;
		return num;
	}
	
}
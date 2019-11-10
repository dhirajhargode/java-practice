class Digambar{

	public static void main(String[] args){
		
		Dhiraj d = new Dhiraj();
		Kapil k = new Kapil();
		Sidhant s = new Sidhant();
		Chutiya c = new Chutiya();
		
		s.start();
		c.start();
		k.start();
		d.start();
		
		for(int i =0;i<10;i++)
			System.out.println("Digambar: order de tu bas");
	
	}
}


class Dhiraj extends Thread{
	public void run(){
		for(int i =0;i<10;i++)
			System.out.println("Dhiraj: market ja ke aa");
	}
}
class Kapil extends Thread{
	public void run(){
		for(int i =0;i<10;i++)
			System.out.println("kapil: ladkiyo ko hi padha");
	}
}
class Sidhant extends Thread{
	public void run(){
		for(int i =0;i<10;i++)
			System.out.println("Siddhant: tu itna q sharmata hai");
	}
}
class Chutiya extends Thread{
	public void run(){
		for(int i =0;i<10;i++)
			System.out.println("Chutiya : sari ladkiya chutiya hai");
	}
}

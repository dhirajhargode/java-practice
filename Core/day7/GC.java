
class GC{
	
	public static void main(String[] args){
		Runtime r = Runtime.getRuntime();
			
		System.out.println("total memory "+r.totalMemory());
		System.out.println("free memory "+r.freeMemory());
		for(int i = 0 ; i<30 ;i++){
			GC g = new GC();
			g = null;
			
			// System.gc();
			r.gc();
		}
		System.out.println("use memory "+(r.totalMemory()-r.freeMemory()));
		System.out.println("free memory "+r.freeMemory());
		
		
	}
	
	 public void finalize() throws java.lang.Throwable{
		 System.out.println("GC invoke");
	 }
	
}
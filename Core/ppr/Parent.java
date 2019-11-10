class Parent extends GrandParent{
	
	String fatherName ;
	String motherName ;
	
	Parent(String fn ,String mn, String gfn , String gmn){
		this(gfn,gmn);
		this.fatherName = fn;
		this.motherName = mn;
		
		System.out.println("Parent names is "+fatherName +" "+motherName);
		
	}
	
	Parent(String gfn, String gmn){
		super(gfn,gmn);		
	}
	
	
}
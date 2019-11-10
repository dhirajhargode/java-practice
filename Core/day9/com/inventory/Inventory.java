

package com.inventory;

class Inventory{

	private Integer id;
	private String name;
	private Double price;
	
	
	
	
	public String toString(){
		return "Inventory : "
	}
	
	public boolean equals(Object object){
		try{
			if(object instanceof Inventory){
				Inventory inventory = (Inventory)object;
				if(inventory.)
					return true;
 			}
		}catch(NullPointerException | ClassCastException e){
			return false;
		}
		return false;
		
	}
	
	public int hashCode(){
		
		Integer prime = 2;
		Integer result = 1;
		result = result + prime * .hashCode();
	}

}
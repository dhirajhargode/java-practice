

package com.inventory;

import java.util.ArrayList;
import java.util.Iterator;


public class Computer{

	
	private String computerName;
	private Integer ramSize;
	private Integer hdCapacity;

	public Computer(){
		
	}
	
	public Computer(String computerName,Integer ramSize,Integer hdCapacity){
		this.computerName = computerName;
		this.ramSize = ramSize;
		this.hdCapacity = hdCapacity;
	}
	
	
	public void setCompterName(String computerName){
		this.computerName = computerName;
	}
	public String getComputerName(){
		return computerName;
	}
	public void setRamSize(Integer ramSize){
		this.ramSize = ramSize;
	}
	public Integer getRamSize(){
		return ramSize;
	}
	public void setHDCapacity(Integer hdCapacity){
		this.hdCapacity = hdCapacity ;
	}
	public Integer getHDCapacity(){
		return hdCapacity;
	}
		
	public String toString(){
		return "Details : Manufacture Name :" + getComputerName() + " Ram size:" + getRamSize() + "GB  HDCapacity :"+getHDCapacity()+"TB ";
	}
	
	public boolean equals(Object object){
		try{
			if(object instanceof Computer){
				Computer computer = (Computer)object;
				if(getComputerName().equals(computer.getComputerName()) && getHDCapacity().equals(computer.getHDCapacity()) && getRamSize().equals(computer.getRamSize()) )
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
		result = result + prime * getComputerName().hashCode();
		result = result + prime * getHDCapacity().hashCode();
		result = result + prime * getRamSize().hashCode();
		
		return result;
		
	}
	
	ArrayList<Computer> alist =  new ArrayList<>();
	public void add(Computer comp){
			if(!alist.contains(comp)){
				alist.add(comp);
			}	
	}
	
	public void display(){
		
		System.out.println("ArrayList of Computers");
		
		if(!alist.isEmpty()){
			Iterator itr = alist.iterator();
			while(itr.hasNext())
				System.out.println(itr.next());
		}
	}
	
	public boolean remove(Computer comp){
		if(alist.contains(comp)){
			alist.remove(comp);
			return true;
		}else{
			return false;
		}
	}
	
	

}
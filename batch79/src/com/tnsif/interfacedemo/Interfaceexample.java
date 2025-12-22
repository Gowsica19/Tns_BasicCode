package com.tnsif.interfacedemo;


interface Fruits{
	
 void sweet() ; //declaration
 
 //void sour();
	
}



public class Interfaceexample implements Fruits {

	public void sweet() {
		System.out.println("The fruits are sweet!!!"); //implementation
	}
	
	
	
	public static void main(String[] args) {
		
		
		Interfaceexample obj1 = new Interfaceexample();
		obj1.sweet();

	}
}
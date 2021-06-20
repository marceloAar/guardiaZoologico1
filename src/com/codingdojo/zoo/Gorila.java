package com.codingdojo.zoo;

public class Gorila extends Mamifero {
	
	public Gorila() {
		super();
	}
	
	public void throwSomething() {		
		int level = getEnergyLevel(); 
		setEnergyLevel( level-=5);
		System.out.println("Gorila lanzando cosas a la gente... !!Disminuye su energia en 5 pts!! >> "+level+ " pts.");	
	}
	
	public void eatBananas() {		
		int level = getEnergyLevel();		
		setEnergyLevel( level+=10);
		System.out.println("Gorila esta comiendo bananas... !!Aumenta su energia en 10 pts!! >> "+level+ " pts.");
	}
	
	public void climb() {		
		int level = getEnergyLevel();
		setEnergyLevel( level-=10);
		System.out.println("Gorila ha trepado a la cima de un árbol... !!Disminuye su energia en 10 pts!! >> "+level+ " pts.");
	}
	
}

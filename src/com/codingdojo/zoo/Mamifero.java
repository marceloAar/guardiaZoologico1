package com.codingdojo.zoo;

public class Mamifero {
	
	private Integer energyLevel = 100;	

	public void displayEnergy() {
		System.out.println("Nivel de Energia: " +energyLevel+ " pts.");
	}
	
	public Integer getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(Integer energyLevel) {
		this.energyLevel = energyLevel;
	}

}

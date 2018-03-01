package com.revature.io;

import java.io.Serializable;

/* Serializable allows our objects to be serialized
 * It is a marker interface
 * A marker interface has no methods
 */
public class Planets implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4897571259341298686L;

	double mass;
	
	transient int position;
	
	transient String name;
	
	int population;

	public Planets() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Planets(double mass, int position, String name, int population) {
		super();
		this.mass = mass;
		this.position = position;
		this.name = name;
		this.population = population;
	}


	@Override
	public String toString() {
		return "Planets [mass=" + mass + ", position=" + position + ", name=" + name + ", population=" + population
				+ "]";
	}

	public double getMass() {
		return mass;
	}

	public void setMass(double mass) {
		this.mass = mass;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

}

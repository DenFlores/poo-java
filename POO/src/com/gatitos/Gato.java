package com.gatitos;

public class Gato {
	//atributos
	private String nombre;
	private int patas;
	private boolean adoptado;
	
	
	//getters y setters
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
		
	}
	public int getPatas() {
		return this.patas;
		
	}
	public void setPatas(int patas) {
		if(patas >=0 && patas <5) {
			this.patas = patas;
			}
		else {
			throw new IllegalArgumentException("El número de patas no es válido");
			
		}
		//this.patas = patas;
	}
	public boolean isAdoptado() {
		return this.adoptado;
	}
	
	public void setAdoptado(boolean adoptado) {
		this.adoptado = adoptado;
		
	}
	
	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", patas=" + patas + "]";
	}
	
	

}

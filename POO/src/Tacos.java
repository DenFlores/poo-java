
public class Tacos {
	
	String tipoDeTortilla;
	String tipoDeGuisado;
	int numeroDeTortilla;
	String tamanioDeTortilla;
	float precio = 0.0f;
	
	//el constructor nos ayuda a inicializar objetos
	
	public Tacos() {
		
	}
	public Tacos(String tipoDeTortilla) { //argumenos o parametros
		this.tipoDeTortilla = tipoDeTortilla;
	}
	public Tacos(String tipoDeTortilla, String tipoDeGuisado, int numeroDeTortilla,
			String tamanioDeTortilla, float precio) {
		this.tipoDeTortilla = tipoDeTortilla;
		this.tipoDeGuisado = tipoDeGuisado;
		this.numeroDeTortilla = numeroDeTortilla;
		this.tamanioDeTortilla = tamanioDeTortilla;
		this.precio = precio;
		
		
		
		
	}
	
	void preparar() {
		System.out.println("Preparando tu rico taco");
		
	}
	
	void vender() {
		System.out.println("Taco vendido");
		
	}
	
	void ponerSalsa() {
		System.out.println("Agregando salsa de la que no pica");
		
	}
	void subirPrecio(float aumento) {
		precio = precio + aumento;
		
	}

	@Override
	public String toString() {
		return "Tacos [tipoDeTortilla=" + tipoDeTortilla + ", tipoDeGuisado=" + tipoDeGuisado + ", numeroDeTortilla="
				+ numeroDeTortilla + ", tamanioDeTortilla=" + tamanioDeTortilla + ", precio=" + precio + "]";
	}
	
	

}

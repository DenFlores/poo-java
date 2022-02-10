
public class Main {
public static void main(String[] args) {
	
	Tacos taco1 = new Tacos("Hecha a mano","Cesina", 2, "Mediana",25);
	
	/*taco1.tipoDeTortilla = "Hecha a mano";
	taco1.tipoDeGuisado = "Cesina";
	taco1.numeroDeTortilla = 2;
	taco1.tamanioDeTortilla = "mediana";
	taco1.precio = 25;*/
	taco1.subirPrecio(2.5f);
	
	System.out.println(taco1.toString());
	
	Tacos taco2 = new Tacos();
	taco2.tipoDeTortilla = "Harina";
	taco2.tipoDeGuisado = "bistec";
	taco2.numeroDeTortilla = 1;
	taco2.tamanioDeTortilla = "Grande";
	taco2.precio = 30.5f;
	// se especifica que es un float con f al ultimo
	
	System.out.println(taco2.toString());
	//manda a llamar al metodo toString por default
	
	Tacos taco3 = new Tacos("Azul");
	
	System.out.println(taco3);
}
	
		
	

}
